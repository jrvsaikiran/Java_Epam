package M7_DesignPatterns.Task2_FactoryPattern.Model;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class FactoryPatternTest {

    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void launchTestAutomationGuruTest() {
        driver.get("http://testautomationguru.com");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), driver.getTitle());
    }

    @Test
    public void launchGoogleTest() {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Assert.assertEquals("Google", driver.getTitle());
    }

    @Test
    public void launchYahooTest() {
        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), driver.getTitle());
    }

}
