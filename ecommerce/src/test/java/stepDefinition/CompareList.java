package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareList {
//    @Before
//    public  void select(){
//        Hooks.category.selectCategory();
//        Hooks.category.selectSubCategory();
//    }

//    @When("user could select a category")
//    public void selectCategory(){
//        Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]")).click();
//
//    }
//    @And("user can select sub category if found")
//    public void selectSubCategory(){
//        Hooks.driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/cell-phones\"]")).click();
//
//    }
    @And ("user click add to compare list")
    public void addToComparelist() {
        Hooks.compareListPage.CompareElement().click();
    }
    @Then("added successfully to compare list")
    public void addToComparelistSuccessfully(){
        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);

    }
}
