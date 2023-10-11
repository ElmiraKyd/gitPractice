package com.digital.pages;

import com.digital.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class RegistrationPage extends BasePage {
    @FindBy(id = "firstName")
    public WebElement firstNameInput;
    @FindBy(id = "lastName")
    public WebElement lastNameInput;
    @FindBy(id = "userName")
    public  WebElement userNameInput;
    @FindBy(id = "passWord")
    public WebElement passwordInput;
    @FindBy(id="rc-anchor-container")
    public WebElement recapchaClick;
    @FindBy(id = "btn btn-primary")
    public WebElement btnPrimaryClick;

    public RegistrationPage fillUpTheFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;
    }

    public RegistrationPage fillUpTheLastName(String txt){
        elementActions.writeText(lastNameInput,txt);
        return this;
    }
    public RegistrationPage fillUpTheEmail(String txt) {
        elementActions.writeText(userNameInput, txt);
        return this;
    }
    public RegistrationPage CreateThePassword(String txt) {
        elementActions.writeText(passwordInput, txt);
        return this;
    }
    public RegistrationPage recapchaClick(String txt) {
        elementActions.writeText(recapchaClick, txt);
        return this;
    }
    public RegistrationPage buttonPrimaryClick(String txt){
    ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", btnPrimaryClick);
        elementActions.writeText(btnPrimaryClick,txt);
        return this;
    }
    WebDriver driver;
    @Test
    public void fillUpTheRegistrationForm(){
        driver = Driver.getDriver();
        driver.get("https://demoqa.com/text-box");


    }

}
