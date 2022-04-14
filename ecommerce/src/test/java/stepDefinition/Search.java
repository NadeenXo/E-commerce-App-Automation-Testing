package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.security.Key;

public class Search {

    @When("user search using the name of the product")
    public void searchProduct(){
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("camera");
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);

    }
    @Then("user could find camera")
    public void serchResults(){
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertTrue(count > 0);
        for (int i = 0; i < count ; i++) {
            softAssert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(i).getText().toLowerCase().contains("camera"));
        }
        softAssert.assertAll();

    }
    @When ("user select Euro currency")
    public void selectCurrency(){
        WebElement customerCurrency = Hooks.driver.findElement(By.xpath("//*[@id='customerCurrency']"));
        Select drpCurrency = new Select(customerCurrency);
        drpCurrency.selectByVisibleText("Euro");
    }
    @Then ("user could see product with Euro currency")
    public void selectCurrencySuccessfully(){

    }

    //
    @When ("user could select a category")
    public void selectCategory(){
       Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]")).click();

    }
    @And ("user can select sub category if found")
    public void selectSubCategory(){
        Hooks.driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/desktops\"]")).click();

    }
    @Then("user could see results")
    public void categoryResults(){
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertTrue(count > 0);
    }

    //
    @When ("user could select Apparel")
    public void selectApparel(){
        Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]")).click();
        Hooks.driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/shoes\"]")).click();


    }
    @And ("user could select color gray")
    public void selectColorGray(){
        Hooks.driver.findElement(By.id("attribute-option-14")).click();

    }
}
