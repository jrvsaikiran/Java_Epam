package pageobjectmodel_design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class POM_FacebookPage {
    WebDriver driver;

    public POM_FacebookPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstname = By.name("firstname");
    By lastname = By.name("lastname");
    By email = By.name("reg_email__");
    By reEnterMail = By.xpath("//input[@aria-label='Re-enter email']");
    By password = By.name("reg_passwd__");
    By month = By.id("month");
    By day = By.id("day");
    By year = By.id("year");
    By gender = By.xpath("//input[@value='2']");
    By submit = By.name("submit");

//    -----------------------------------------------

    public POM_FacebookPage setFirstname() {
        driver.findElement(firstname).sendKeys("sai");
        return this;
    }

    public POM_FacebookPage setLastname() {
        driver.findElement(lastname).sendKeys("sai");
        return this;
    }

    public POM_FacebookPage setEmail() {
        driver.findElement(email).sendKeys("sai@gmail.com");
        return this;
    }

    public POM_FacebookPage setReEnterMail() {
        driver.findElement(reEnterMail).sendKeys("sai@gmail.com");
        return this;
    }

    public POM_FacebookPage setPassword() {
        driver.findElement(password).sendKeys("saikiraan12345@@");
        return this;
    }


    public POM_FacebookPage setMonth() {
        Select sc = new Select(driver.findElement(month));
        sc.selectByVisibleText("Jul");
        return this;
    }

    public POM_FacebookPage setDay() {
        Select sc = new Select(driver.findElement(day));
        sc.selectByVisibleText("12");
        return this;
    }

    public POM_FacebookPage setYear() {
        Select sc = new Select(driver.findElement(year));
        sc.selectByVisibleText("2001");
        return this;
    }

    public POM_FacebookPage setgender() {
        driver.findElement(gender).click();
        return this;
    }

    public POM_FacebookPage setSubmit() {
        driver.findElement(submit).click();
        return this;
    }


}
