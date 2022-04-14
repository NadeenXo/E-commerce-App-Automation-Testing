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

public class Search {

    @When("user search using the name of the product")
    public void searchProduct(){
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("camera");
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);

    }
    @Then("user could find camera")
    public void searchResults(){
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
       Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]")).click();

    }
    @And ("user can select sub category if found")
    public void selectSubCategory(){
        Hooks.driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/cell-phones\"]")).click();

    }
    @Then("user could see results")
    public void categoryResults(){
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();
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
    @And ("^user could select \"(.*)\" tag$")
    public void selectTag(String tagName){
//        WebElement tag = Hooks.driver.findElement(By.cssSelector("[class=\"tags\"] ul"));
        Hooks.driver.findElement(By.cssSelector("[class=\"tags\"] ul li a[href=\"/"+ tagName +"\"]")).click();
        Assert.assertEquals(Hooks.driver.findElement(By.cssSelector("[class=\"page-title\"] h1")).getText().toLowerCase().contains(tagName),true);
    }
    //09

    @And ("user click add item to cart")
    public void addToCart() {
        Hooks.driver.findElement(By.cssSelector("[class=\"button-2 product-box-add-to-cart-button\"]")).click();
    }
    @Then ("added successfully to shopping cart mssg")
    public void addToCartSuccessfully(){
        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);

    }
    //10


}
