package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JS extends BaseTest{
    @Test
    void demo1() throws InterruptedException {

    //driver.get("https://demoqa.com/text-box");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.location='https://demoqa.com/text-box'");

    //Actions builder = new Actions(driver);
    //builder.sendKeys(Keys.chord(Keys.CONTROL, "-")).perform(); // хотела уменьшить масштаб со 100% до 90, но неправильно

    WebElement fullName = driver.findElement(By.id("userName"));
    js.executeScript("arguments[0].setAttribute('style',arguments[1]);", fullName, "border: 2px solid red");
    fullName.sendKeys("John Doe");
    Thread.sleep(3000);

    WebElement email = driver.findElement(By.id("userEmail"));
    js.executeScript("arguments[0].setAttribute('style',arguments[1]);", email, "border: 2px solid red");
    email.sendKeys("john@gmail.com");
    Thread.sleep(3000);

    WebElement currentAddress = driver.findElement(By.id("currentAddress"));
    js.executeScript("arguments[0].setAttribute('style',arguments[1]);", currentAddress, "border: 2px solid red");
    currentAddress.sendKeys("Moscow");

    WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
    // скроллинг страницы чтобы (увидеть) кликнуть submit
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", permanentAddress);
    js.executeScript("arguments[0].setAttribute('style',arguments[1]);", permanentAddress, "border: 2px solid red");
    permanentAddress.sendKeys("Bishkek");
    Thread.sleep(3000);

    WebElement submitBtn = driver.findElement(By.id("submit"));
    js.executeScript("arguments[0].setAttribute('style',arguments[1]);", submitBtn, "border: 2px solid red");
    js.executeScript("arguments[0].click()",submitBtn);
    Thread.sleep(8000);
    }

}














