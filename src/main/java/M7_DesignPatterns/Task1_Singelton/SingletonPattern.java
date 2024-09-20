package M7_DesignPatterns.Task1_Singelton;

import org.openqa.selenium.WebDriver;

public class SingletonPattern {

    WebDriver driver;
    private static volatile SingletonPattern patern;
    private SingletonPattern() {
        WebDriver driver;
    }
    public static SingletonPattern getInstance() {
      if (patern == null) {
          synchronized (SingletonPattern.class) {
              if (patern == null) {
                  patern = new SingletonPattern();
              }
          }
      }
        return patern;
    }

    public void method(){
        System.out.println("Meth");
    }
}
