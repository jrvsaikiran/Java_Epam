package pageobjectmodel_design;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test_POM {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en_US");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        POM_FacebookPage facebook = new POM_FacebookPage(driver);
        facebook.setFirstname();
        facebook.setLastname();
        facebook.setEmail();
        facebook.setReEnterMail();
        facebook.setPassword();
        facebook.setMonth();
        facebook.setDay();
        facebook.setYear();
        facebook.setgender();
        facebook.setSubmit();





    }
}
