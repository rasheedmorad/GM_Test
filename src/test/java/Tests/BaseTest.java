package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.MapsPage;
import pages.TopBar;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseTest{
    WebDriver driver;
    MapsPage _MapsPage;
    @BeforeMethod(alwaysRun = true)
    public void createDriver(@Optional("chrome") String browser, Method method) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.il/maps/@32.8063835,35.2478105,15z?hl=iw");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        _MapsPage=new MapsPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }



}
