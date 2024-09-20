package selenium_grid;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjectmodel_design.POM_FacebookPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GridTest {

    @Test
    public void testGrid() throws MalformedURLException {

        String nodeUrl = "http://192.168.55.105:21993/wd/hub";
        DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en_US");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);





        Grid_FacebookPage facebook = new Grid_FacebookPage(driver);
        facebook.setFirstname();
        facebook.setLastname();
        facebook.setEmail();
        facebook.setReEnterMail();
        facebook.setPassword();
        facebook.setMonth();
        facebook.setDay();
        facebook.setYear();
        facebook.setgender();
//        facebook.setSubmit();
        Assert.assertEquals(3,3);



    }
}
