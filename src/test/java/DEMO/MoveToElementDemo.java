package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class MoveToElementDemo extends BaseTest{
    @Test
    void demo1234() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",submitBtn);
        Thread.sleep(7000);
        //driver.switchTo().defaultContent(); // not work
        js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        //Actions action = new Actions(driver);
         //action.moveToElement(submitBtn).perform();
        //WebDriverWait wait = new WebDriverWait(driver,15);
        //WebElement clickableSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0")));
        //clickableSubmitBtn.click();
        submitBtn.click();

    }
}
