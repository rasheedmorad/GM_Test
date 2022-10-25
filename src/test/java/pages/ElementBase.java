package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementBase {

    WebDriver _driver;
    WebDriverWait wait;

    public ElementBase(WebDriver driver){
        _driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        PageFactory.initElements(driver, this);

    }
    public void SendKeys(WebElement elm, String str) throws Exception {
        try
        {
            elm.sendKeys(str);
            //elm.sendKeys(Keys.ENTER);
            Thread.sleep(50);
        }
        catch (Exception ex)
        {
            Exception customException = new Exception("Failed to enter text to the field: "+ elm );
            throw customException;
        }

    }
    public void Click(WebElement elm) throws Exception {
        try
        {
            Thread.sleep(20);
            elm.click();
        }
        catch (Exception ex)
        {

            Exception customException = new Exception("Failed to click on: " +  elm );
            throw customException;
        }
    }
}
