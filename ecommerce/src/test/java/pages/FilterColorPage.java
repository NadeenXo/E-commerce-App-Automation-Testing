package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FilterColorPage {
    WebDriver driver;
    public FilterColorPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
