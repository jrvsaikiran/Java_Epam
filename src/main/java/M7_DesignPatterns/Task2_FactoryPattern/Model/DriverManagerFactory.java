package M7_DesignPatterns.Task2_FactoryPattern.Model;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
//                driverManager = new FirefoxDriverManager();
                break;
                case EDGE:
//                    driverManager = new FirefoxDriverManager();

            default:
//                driverManager = new SafariDriverManager();
                break;
        }
        return driverManager;

    }
}
