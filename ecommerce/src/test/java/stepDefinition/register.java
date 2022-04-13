package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class register {
    String fname="aaa";
    String lname="bbb";
    String email="aaa@gmail.com";
    String pass="aaa@1111";
@Given("user click on register link")
    public void regLink() throws InterruptedException {

    Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
    Thread.sleep(1000);
    Hooks.driver.navigate().to("/register?returnUrl=%2F");
    }
@When ("user fills personal details with valid data")
    public void fillDetails()  {
    Hooks.driver.findElement(By.cssSelector("input[id^=FirstName]")).sendKeys(fname);
    Hooks.driver.findElement(By.cssSelector("input[id^=LastName]")).sendKeys(lname);
    Hooks.driver.findElement(By.cssSelector("input[id^=Email]")).sendKeys(email);

}

@And ("user fills pass with valid data")
    public void fillPass()  {
    Hooks.driver.findElement(By.cssSelector("input[id^=Password]")).sendKeys(pass);

}
@And ("user click on register button")
    public void regBtn()  {
    Hooks.driver.findElement(By.cssSelector("input[id^=register-button]")).click();

    }
@Then ("success message displayed")
    public void regSuccessMsg()  {

    }
}
