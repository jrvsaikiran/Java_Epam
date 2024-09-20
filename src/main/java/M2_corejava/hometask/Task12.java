package M2_corejava.hometask;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task12 {

    public static void main() {
        Logger logger = Logger.getLogger(Task12.class.getName());
        String path = System.getProperty("user.dir");
        String home = System.getProperty("user.home");

        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("C:/Users/rajavenkatasaikiran_/IdeaProjects/JAVA_EPAM/src/main/resources/logs");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            logger.info(path+" ---- "+home);
            logger.info(" Info");
            logger.severe(" Server");
            logger.warning(" Warnings");
            logger.log(Level.INFO, "info data");
            logger.log(Level.SEVERE, "Server data");
            logger.log(Level.WARNING, "warning data");

        } catch (SecurityException | IOException e) {

        }
    }

}
