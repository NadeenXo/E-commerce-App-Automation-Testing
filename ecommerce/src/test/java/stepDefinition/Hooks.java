package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    static WebDriver driver;
//open chrome browser & navigates to website
    @Before
    public static void open_browser() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); //System.getProperty()
        //new obj
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();//max screen
        //nav to website
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public static void close_browser(){
        driver.quit();
    }
}

