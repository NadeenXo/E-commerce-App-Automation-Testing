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

    @When("user search using the name")
    public void searchProduct(){
        Hooks.searchPage.getSearchTerms().sendKeys("camera");
        Hooks.searchPage.getSearchTerms().sendKeys(Keys.ENTER);

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
//    @When ("user select Euro currency")
//    public void selectCurrency(){
//        WebElement customerCurrency = Hooks.driver.findElement(By.xpath("//*[@id='customerCurrency']"));
//        Select drpCurrency = new Select(customerCurrency);
//        drpCurrency.selectByVisibleText("Euro");
//    }
//    @Then ("user could see product with Euro currency")
//    public void selectCurrencySuccessfully(){
//
//    }

    //
//    @When ("user could select a category")
//    public void selectCategory(){
//       Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]")).click();
//
//    }
//
//    @And ("user can select sub category if found")
//    public void selectSubCategory(){
//        Hooks.driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/cell-phones\"]")).click();
//
//    }

    /*something here*/

//    @When ("user could select")
//    public void select(){
//        selectCategory();
//        selectSubCategory();
//    }


//    @Then("user could see results")
//    public void categoryResults(){
//        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();
//        SoftAssert softAssert =new SoftAssert();
//        softAssert.assertTrue(count > 0);
//    }

    //
//    @When ("user could select Apparel")
//    public void selectApparel(){
//        Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]")).click();
//        Hooks.driver.findElement(By.cssSelector("li[class=\"active last\"] a[href=\"/shoes\"]")).click();
//
//
//    }
//    @And ("user could select color gray")
//    public void selectColorGray(){
//        Hooks.driver.findElement(By.id("attribute-option-14")).click();
//
//    }
//    @And ("^user could select \"(.*)\" tag$")
//    public void selectTag(String tagName){
//        Hooks.driver.findElement(By.cssSelector("[class=\"tags\"] ul li a[href=\"/"+ tagName +"\"]")).click();
//        Assert.assertEquals(Hooks.driver.findElement(By.cssSelector("[class=\"page-title\"] h1")).getText().toLowerCase().contains(tagName),true);
//    }
    //09

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
//    @Then ("added successfully to shopping cart mssg")
//    public void addToCartSuccessfully(){
//        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);
//
//    }
    //10
//    @And ("user click add to Wishlist")
//    public void addToWishlist() {
//        Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
//        //add again
//        Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
//    }
//    @Then ("added successfully to Wishlist")
//    public void addToWishlistSuccessfully(){
//        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);
//
//    }
    //11
//    @And ("user click add to compare list")
//    public void addToComparelist() {
//        Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).click();
//    }
//
//    @Then ("added successfully to compare list")
//    public void addToComparelistSuccessfully(){
//        Assert.assertEquals(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your"),true);
//
//    }
    //12
//    @When ("user click on shopping cart")
//    public void clickShoppingCart() {
//        Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]")).click();
//
//    }
//
//    @And ("user accept terms of service")
//    public void accepttermsofservice() {
//        Hooks.driver.findElement(By.id("termsofservice")).click();
//    }
//    @And ("user choose checkout")
//    public void checkout() {
//        Hooks.driver.findElement(By.id("checkout")).click();
//
//    }

//    @And ("user fills all checkout data")
//    public void fillcheckoutdata() {
//        //select new address
//        if(Hooks.driver.findElement(By.id("billing-address-select")).isDisplayed()) {
//            WebElement new_webElement = Hooks.driver.findElement(By.id("billing-address-select"));
//            Select new_select = new Select(new_webElement);
//            new_select.selectByVisibleText("New Address");
//        }
//        //fill all required data
//        Hooks.driver.findElement(By.id("BillingNewAddress_FirstName")).clear();
//
//        Hooks.driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("nadeen");
//        Hooks.driver.findElement(By.id("BillingNewAddress_LastName")).clear();
//
//        Hooks.driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("serag");
//        Hooks.driver.findElement(By.id("BillingNewAddress_Email")).clear();
//        Hooks.driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("email@gmail.com");
//
//        //country
//        WebElement Country_webElement = Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
//        Select Country_select = new Select(Country_webElement);
//        Country_select.selectByValue("1");
//        //state
//        WebElement StateProvince_webElement = Hooks.driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
//        Select StateProvince_select = new Select(StateProvince_webElement);
//        StateProvince_select.selectByValue("1");
//
//        Hooks.driver.findElement(By.id("BillingNewAddress_City")).sendKeys("newyork");
//        Hooks.driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("street 5,building 4");
//        Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("null");
//        Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("01001100111");

  //  }
//      country state city add1 zip phn
//    @And ("user click on continue")
//    public void continueCheckout() {
////        button[name="save"]
//        Hooks.driver.findElement(By.cssSelector("button[name=\"save\"]")).click();
//
//    }
//        @And ("user click on continue-shipping")
//        public void continueShipping() {
//            Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]")).click();
//
//        }
//
////    #button[class="button-1 shipping-method-next-step-button"]
//        @And ("user click on continue-payment-method")
//    public void continuePaymentMethod() {
//        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]")).click();
//
//    }
////    #button[class="button-1 payment-method-next-step-button"]
//        @And ("user click on continue-payment-info")
//        public void continuePaymentInfo() {
//            Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]")).click();
//
//        }
////    #button[class="button-1 payment-info-next-step-button"]
//        @And ("user click on confirm-order")
////    #button[class="button-1 confirm-order-next-step-button"]
//        public void confirmOrderNext() {
//            Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]\n")).click();
//
//        }
//
//    @Then ("user order products successfully")
//    public void checkoutSuccessfully() {
////        div[class="details-link"]
//        Hooks.driver.findElement(By.cssSelector("div[class=\"details-link\"]")).click();
//
//
//    }
//    @Given("^user logged in with \"(.*)\" and \"(.*)\"$")
//    public void logged(String username, String password){
//        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]")).click();
//        Hooks.loginPage.getEMailElement().sendKeys(username);
//        Hooks.loginPage.getPasswordElement().sendKeys(password);
//        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
//    }

}
