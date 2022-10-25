package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePage extends ElementBase{


    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

 public void TakeScreenShot(String msg) throws IOException {
     TakesScreenshot scrShot =((TakesScreenshot)driver);
     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     String name="screenshots/"+msg+System.currentTimeMillis()+".png";
     File newFile=new File(name);
     FileUtils.copyFile(scrFile, newFile);
 }
}
