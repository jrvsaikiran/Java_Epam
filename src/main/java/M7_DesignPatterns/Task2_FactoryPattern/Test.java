package M7_DesignPatterns.Task2_FactoryPattern;

import org.openqa.selenium.WebDriver;


public class Test {


    public static void main() throws InterruptedException {

//        FactoryDriver
        WebDriver driver = FactoryDriver.getDriver(String.valueOf(Drivers.CHROME));
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.quit();

//        SupplierDriverFactory
        WebDriver driver1 = SupplierDriverFactory.getDriver(Drivers.CHROME);
        driver1.get("http://www.google.com");
        driver1.manage().window().maximize();
        Thread.sleep(4000);
        driver1.quit();


    }
}

