package pagefactory_design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Factory_FacebookPage {
    WebDriver driver;

    public Factory_FacebookPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "firstname")
    WebElement firstname;

    @FindBy(how = How.NAME, using = "lastname")
    WebElement lastname;

    @FindBys({
            @FindBy(id = "reg_box"),
            @FindBy(name = "reg_email__")})
    public WebElement email;

    @FindBy(xpath = "//input[@aria-label='Re-enter email']")
    WebElement reEnterMail;

    @FindBy(name = "reg_passwd__")
    WebElement password;

    @FindBy(id = "month")
    WebElement month;

    @FindBy(id = "day")
    WebElement day;

    @FindBy(id = "year")
    WebElement year;

    @FindBy(xpath = "//input[@value='2']")
    WebElement gender;

    @FindBy(name = "websubmit")
    WebElement submit;
//    -----------------------------------------------

    public Factory_FacebookPage setFirstname() {
        firstname.sendKeys("sai");
        return this;
    }

    public Factory_FacebookPage setLastname() {
        lastname.sendKeys("sai");
        return this;
    }

    public Factory_FacebookPage setEmail() {
        email.sendKeys("sai@gmail.com");
        return this;
    }

    public Factory_FacebookPage setReEnterMail() {
        reEnterMail.sendKeys("sai@gmail.com");
        return this;
    }

    public Factory_FacebookPage setPassword() {
        password.sendKeys("saikiraan12345@@");
        return this;
    }


    public Factory_FacebookPage setMonth() {
        Select sc = new Select(month);
        sc.selectByVisibleText("Jul");
        return this;
    }

    public Factory_FacebookPage setDay() {
        Select sc = new Select(day);
        sc.selectByVisibleText("12");
        return this;
    }

    public Factory_FacebookPage setYear() {
        Select sc = new Select(year);
        sc.selectByVisibleText("2001");
        return this;
    }

    public Factory_FacebookPage setgender() {
        gender.click();
        return this;
    }

    public Factory_FacebookPage setSubmit() {
        submit.click();
        return this;
    }


}
