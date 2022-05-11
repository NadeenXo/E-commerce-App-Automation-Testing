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

public class SuccessOrder {
//    String email=Hooks.email;
//    String pass="111111";
//    @Given("user is logged in with email and password")
//    public void loggedUser() throws InterruptedException {
//        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]")).click();
//
//        Hooks.loginPage.getEMailElement().sendKeys(email);
//        Hooks.loginPage.getPasswordElement().sendKeys(pass);
//        Thread.sleep(1000);
//        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
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
//    @And ("user click add item to cart")
//    public void addToCart() {
//        Hooks.driver.findElement(By.cssSelector("[class=\"button-2 product-box-add-to-cart-button\"]")).click();
//        //addToCartSuccessfully
//        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);
//
//        Hooks.driver.findElement(By.cssSelector("[class=\"button-2 product-box-add-to-cart-button\"]")).click();
//        //addToCartSuccessfully
//        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);
//    }
    @When ("user click on shopping cart")
    public void clickShoppingCart() {
        Hooks.successOrderPage.successOrderElement().click();

//a[href="/cart"]
    }
    @And ("user accept terms of service")
    public void accepttermsofservice() {
        Hooks.driver.findElement(By.id("termsofservice")).click();
//id termsofservice
    }
    @And ("user choose checkout")
    public void checkout() {
        Hooks.driver.findElement(By.id("checkout")).click();

//id="checkout"
    }

    @And ("user fills all checkout data")
    public void fillcheckoutdata() {
        //select new address
        if(Hooks.driver.findElement(By.id("billing-address-select")).isDisplayed()) {
            WebElement new_webElement = Hooks.driver.findElement(By.id("billing-address-select"));
            Select new_select = new Select(new_webElement);
            new_select.selectByVisibleText("New Address");
        }
        //fill all required data
        Hooks.driver.findElement(By.id("BillingNewAddress_FirstName")).clear();

        Hooks.driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("nadeen");
        Hooks.driver.findElement(By.id("BillingNewAddress_LastName")).clear();

        Hooks.driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("serag");
        Hooks.driver.findElement(By.id("BillingNewAddress_Email")).clear();
        Hooks.driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("email@gmail.com");

        //country
        WebElement Country_webElement = Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select Country_select = new Select(Country_webElement);
        Country_select.selectByValue("1");
        //state
        WebElement StateProvince_webElement = Hooks.driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select StateProvince_select = new Select(StateProvince_webElement);
        StateProvince_select.selectByValue("1");

        Hooks.driver.findElement(By.id("BillingNewAddress_City")).sendKeys("newyork");
        Hooks.driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("street 5,building 4");
        Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("null");
        Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("01001100111");

//        BillingNewAddress_FirstName 00
//                BillingNewAddress_LastName 00
//        BillingNewAddress_Email 00
//                BillingNewAddress_CountryId -> option value1   00
//                BillingNewAddress_StateProvinceId -> option value1   00
//                BillingNewAddress_City -> newyork   00
//        BillingNewAddress_Address1->street5 00
//        BillingNewAddress_ZipPostalCode->null
//        BillingNewAddress_PhoneNumber->01001100111

    }
    //      country state city add1 zip phn
    @And ("user click on continue")
    public void continueCheckout() {
//        button[name="save"]
        Hooks.driver.findElement(By.cssSelector("button[name=\"save\"]")).click();

    }
    @And ("user click on continue-shipping")
    public void continueShipping() {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]")).click();

    }

    //    #button[class="button-1 shipping-method-next-step-button"]
    @And ("user click on continue-payment-method")
    public void continuePaymentMethod() {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]")).click();

    }
    //    #button[class="button-1 payment-method-next-step-button"]
    @And ("user click on continue-payment-info")
    public void continuePaymentInfo() {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]")).click();

    }
    //    #button[class="button-1 payment-info-next-step-button"]
    @And ("user click on confirm-order")
//    #button[class="button-1 confirm-order-next-step-button"]
    public void confirmOrderNext() {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]\n")).click();

    }

    @Then("user order products successfully")
    public void checkoutSuccessfully() {
//        div[class="details-link"]
        Hooks.driver.findElement(By.cssSelector("div[class=\"details-link\"]")).click();


    }
}
