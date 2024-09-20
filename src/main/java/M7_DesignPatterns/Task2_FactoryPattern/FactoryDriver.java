package M7_DesignPatterns.Task2_FactoryPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FactoryDriver {

    public FactoryDriver() {

    }


    public static WebDriver getDriver(String str) {

        WebDriver driver = null;
        switch (str.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                return driver;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                return driver;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                return driver;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                return driver;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                return driver;
        }

        return driver;
    }
}
