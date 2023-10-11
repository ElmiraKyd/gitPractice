package com.digital.pages;
import com.digital.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxPage  extends BasePage{
// Page Object Model
    @FindBy(id = "userName")
    public WebElement fullNameInput;
    @FindBy(id = "name")
    public WebElement expectedFullNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;
    @FindBy(id = "email")
    public WebElement expectedUserEmailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;
    @FindBy(xpath = "//p[@id='currentAddress']")
    public WebElement expectedUserCurrentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement expectedUserPermanentAddress;

    @FindBy(id = "submit")
    public WebElement submitBtn;

//    public  TextBoxPage fillUpTheFullName(String fullname){   // ???
//    elementActions.writeText(fullNameInput,fullname);
//        return this;
//    }
    public TextBoxPage fillUpTheFullName(String fullName) {
        elementActions.writeText(fullNameInput, fullName);
        return this;
    }
    public TextBoxPage fillUpTheEmail(String email){
    elementActions.writeText(userEmailInput,email);
    return this;
        }
    public TextBoxPage fillUpTheCurrentAddress(String currentAddressName) {
        elementActions.writeText(currentAddressInput, currentAddressName);
        return this;
    }

    public TextBoxPage fillUpThePermanentAddress(String permanentAddressName) {
        elementActions.writeText(permanentAddressInput, permanentAddressName);
        return this;
    }

    public TextBoxPage submitForm() {
        elementActions.waitElementToBeClickable(submitBtn);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", submitBtn);
        elementActions.clickElement(submitBtn);
        return this;
    }
        public TextBoxPage submitClick(){
           elementActions.scrollToTheElement(submitBtn).clickTheButton(submitBtn);
            return this;
        }

    public  TextBoxPage testTexBoxForm() {
        Assert.assertTrue(expectedFullNameInput.getText().contains(fullNameInput.getText()));
        Assert.assertTrue(expectedUserEmailInput.getText().contains(userEmailInput.getText()));
        Assert.assertTrue(expectedUserCurrentAddress.getText().contains(currentAddressInput.getText()));
        Assert.assertTrue(expectedUserPermanentAddress.getText().contains(permanentAddressInput.getText()));
        return this;
    }
        WebDriver driver;
        @Test
        public void testTextBoxPage(){
            driver = Driver.getDriver();
            driver.get("https://demoqa.com/text-box");
            TextBoxPage textBoxPage = new TextBoxPage();
            textBoxPage.fillUpTheFullName("Nurik")
                    .fillUpTheEmail("nurik@mail.ru").
                       fillUpTheCurrentAddress("Bishkek")
                    .fillUpThePermanentAddress("Bishkek").submitClick();
    }


}










