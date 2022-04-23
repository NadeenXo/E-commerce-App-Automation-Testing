package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Hooks {
    static WebDriver driver =null;
    static LoginPage loginPage = null;

    //open Chrome browser & navigates to website
    @Before
    public static void open_browser() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); //System.getProperty()
        //new obj
        driver = new ChromeDriver();
        //wait 10 until item exist in dom
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.manage().window().maximize();//max screen
        //nav to website
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public static void close_browser(){
        driver.quit();
    }
}

