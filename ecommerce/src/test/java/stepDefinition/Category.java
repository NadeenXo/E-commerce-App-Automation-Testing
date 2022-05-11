package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Category {
    @When("user could select a category")
    public void selectCategory(){
        //Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]")).click();
        Hooks.categoryPage.CategoryElement().click();

    }

    @And("user can select sub category if found")
    public void selectSubCategory(){
        Hooks.driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/cell-phones\"]")).click();

    }
//    @When ("user could select")
//    public void select(){
//        selectCategory();
//        selectSubCategory();
//    }
    @Then("user could see results")
    public void categoryResults(){
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertTrue(count > 0);
    }

}
