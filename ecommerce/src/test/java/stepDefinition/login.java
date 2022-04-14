package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Login {
    @Given("user should go to login page")
    public void loginLink() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
    }

    @When("^user login with valid \"(.*)\" and \"(.*)\"$")
    public void validData(String username, String password)
    {
        Hooks.driver.findElement(By.id("Email")).sendKeys(username);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("user press on login button")
    public void loginBtn()
    {
        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
    }

    @Then("user login to the system successfully")
    public void loginSuccessMsg()
    {
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("p")).isDisplayed());

    }

    @Given("^user is logged in with \"(.*)\" and \"(.*)\"$")
    public void loggedUser(String username, String password){
        loginLink();
        validData(username,password);
        loginBtn();
    }

    @When ("user should click on my account link then click on change password")
    public void changePasswordLink() throws InterruptedException {
        Thread.sleep(1000);
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).click();
        Hooks.driver.findElement(By.cssSelector("li[class=\"change-password inactive\"]>a")).click();//change password
    }
    @And ("^user fills old pass \"(.*)\" and new pass$")
    public void changeToNewPassword(String password){
        String NewPassword="111111";
        Hooks.driver.findElement(By.id("OldPassword")).sendKeys(password);
        Hooks.driver.findElement(By.id("NewPassword")).sendKeys(NewPassword);
        Hooks.driver.findElement(By.id("ConfirmNewPassword")).sendKeys(NewPassword);

    }

    @And ("user click on Change password button")
    public void ChangePassBtn(){
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 change-password-button\"]")).click();

    }
    @Then ("user has changed his-her password successfully")
    public void PassChangedSuccessfully(){
        SoftAssert softAssert = new SoftAssert();
        String actRes = Hooks.driver.findElement(By.className("content")).getText();
        softAssert.assertEquals(actRes.contains("Password was changed"),true, "1st assertion");//relative
        softAssert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("Password was changed"),true,"2nd assertion");

        softAssert.assertAll();

    }

}
