package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Register {
    String fname="nadeen";
    String lname="serag";
    String email=Hooks.email;
    String pass=Hooks.password;

    @Given("user click on register link")
    public void regLink() throws InterruptedException {

    Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
    Thread.sleep(1000);
    }
@When ("user fills personal details with valid data")
    public void fillDetails()  {
    Hooks.registerPage.getFNameElement().sendKeys(fname);
    Hooks.registerPage.getLNameElement().sendKeys(lname);
    Hooks.registerPage.getEMailElement().sendKeys(email);

}

@And ("user fills pass with valid data")
    public void fillPass()  {
    Hooks.driver.findElement(By.cssSelector("input[id^=Password]")).sendKeys(pass);
    Hooks.driver.findElement(By.cssSelector("input[id^=ConfirmPassword]")).sendKeys(pass);


}
@And ("user click on register button")
    public void regBtn()  {
    Hooks.driver.findElement(By.cssSelector("button[id^=\"register-button\"]")).click();

    }
@Then ("success message displayed")
    public void regSuccessMsg()  throws InterruptedException{
//    isDisplayed());//visible in ui page not dom page
//     Assert.assertTrue(Hooks.driver.findElement(By.partialLinkText("Your registration completed")).isDisplayed());
    Thread.sleep(2000);

//    Assert.assertEquals(Hooks.driver.findElement(By.partialLinkText("Your registration completed")).isDisplayed(),true);
    Assert.assertEquals(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed(),true);

    }
}
