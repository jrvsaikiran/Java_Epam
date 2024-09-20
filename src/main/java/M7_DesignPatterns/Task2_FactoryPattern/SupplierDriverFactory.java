package M7_DesignPatterns.Task2_FactoryPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SupplierDriverFactory {

    private SupplierDriverFactory() {}

    private static final Supplier<WebDriver> chrome = ()->{
        WebDriverManager.chromedriver().setup();
        return  new ChromeDriver();
    };

    private static final Supplier<WebDriver> firefox = ()->{
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    };

    private static final Supplier<WebDriver> edge = ()-> {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    };

    private static final Supplier<WebDriver> safari = ()-> {
        WebDriverManager.safaridriver().setup();
        return new SafariDriver();
    };

    private static final Supplier<WebDriver> opera = ()->{
        WebDriverManager.operadriver().setup();
        return new OperaDriver();
    };

    private static final Map<Drivers, Supplier<WebDriver>> drivers = new LinkedHashMap<>();

    static {
        drivers.put(Drivers.CHROME,chrome);
        drivers.put(Drivers.FIREFOX,firefox);
        drivers.put(Drivers.EDGE,edge);
        drivers.put(Drivers.SAFARI,safari);
        drivers.put(Drivers.OPERA,opera);
    }

    static WebDriver getDriver(Drivers browser){
        WebDriver driver = drivers.get(browser).get();
        return driver;
    }


}
