package com.digital.helper;

import com.digital.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ElementActions {

        Actions action = new Actions(Driver.getDriver());
    public ElementActions waitButtonToBeclicable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitElemetToBeVisible(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
        public ElementActions clickTheButton(WebElement element){
        waitButtonToBeclicable(element);
        action.moveToElement(element).perform();
        element.click();
        return this;
        }
        public ElementActions writeText(WebElement element,String txt){
        waitElemetToBeVisible(element);
        action.moveToElement(element).perform();
        element.sendKeys(txt);
        return this;
    }
    public ElementActions scrollToTheElement(WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", element);
        return this;
    }
    public ElementActions clickElement(WebElement element){
        waitElementToBeClickable(element);
        element.click();
        return this;
    }
    public ElementActions waitElementToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public ElementActions waitElementToBeVisible(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public ElementActions clickToRandomElement(List<WebElement> element){
        int randomIndex = new Random().nextInt(element.size());
        WebElement randomLabel = element.get(randomIndex);
        randomLabel.click();
        return this;
    }
    public ElementActions setTextAndEnterElement(String txt,WebElement element){
        writeText(element,txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }

}











