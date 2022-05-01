package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.RegisterPage;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

public class Hooks {
    static WebDriver driver =null;
    static LoginPage loginPage = null;
    static RegisterPage registerPage = null;
    static SearchPage searchPage = null;
    static String email="email@gmail.com";
    static String password="asdf@1234";


    //open Chrome browser & navigates to website
    @Before
    public static void open_browser() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); //System.getProperty()
        //new obj
        driver = new ChromeDriver();
        //wait 10 until item exist in dom
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.manage().window().maximize();//max screen
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        searchPage = new SearchPage(driver);
        //nav to website
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public static void close_browser(){
        driver.quit();
    }
}

