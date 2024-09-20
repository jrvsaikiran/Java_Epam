package pagefactory_design;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?locale=en_US");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Factory_FacebookPage fb = new Factory_FacebookPage(driver);
        fb.setFirstname();
        fb.setLastname();
        fb.setEmail();
        fb.setReEnterMail();
        fb.setPassword();
        fb.setMonth();
        fb.setDay();
        fb.setYear();
        fb.setgender();
        fb.setSubmit();


    }
}
