package com.digital.helper;

import com.digital.driver.Driver;
import lombok.Data;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
@Data
public class AlertHelper {

    Alert alert;
    public AlertHelper acceptAlert() {
        alert = Driver.getDriver().switchTo().alert();
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        alert.accept();
        return this;
    }
    public AlertHelper dismissAlert() {
        switchtoAlert();
        alert.dismiss();
        return this;
    }
    public AlertHelper sendkeysAlert(String txt) {
        switchtoAlert();
       waitAlertToBePresent();
        alert.sendKeys(txt);
        alert.accept();
        return this;
    }
    public AlertHelper switchtoAlert(){
        alert = Driver.getDriver().switchTo().alert();
        return  this;
    }
    public AlertHelper waitAlertToBePresent(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        return  this;
    }
//    public class AlertHelper {
//
 //      private WebDriver driver = Driver.getDriver();
//
//        public AlertHelper(WebDriver driver) {
//            this.driver = driver;
//        }
//
//       public boolean getAlert() {
//           return driver.switchTo().alert(); // ?? driver?
////        }
//
////        public void AcceptAlert() {
////            getAlert().accept();
////        }
//
//        public void DismissAlert() {
//            getAlert().dismiss();
//        }
//
////        public String getAlertText() {
////            String text = getAlert().getText();
////            return text;
////        }
//
//        public  boolean isAlertPresent() {
//            try {
//                driver.switchTo().alert().accept();
//
//                return true;
//            } catch (NoAlertPresentException e) {
//                // Ignore
//                return false;
//            }
//        }
//
//        public void AcceptAlertIfPresent() {
//            if (!isAlertPresent())
//                return;
//            AcceptAlert();
//        }
//
//        public void DismissAlertIfPresent() {
//            if (!isAlertPresent())
//                return;
//            DismissAlert();
//        }
//
//        public void AcceptPrompt(String text) {
//            if (!isAlertPresent())
//                return;
//            Alert alert = getAlert();
//            alert.sendKeys(text);
//            alert.accept();
        }

