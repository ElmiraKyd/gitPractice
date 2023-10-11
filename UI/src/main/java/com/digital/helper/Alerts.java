package com.digital.helper;

import com.digital.driver.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class Alerts {

     WebDriver driver;

    @BeforeClass
    public  void setIp() throws InterruptedException {
        driver = Driver.getDriver();

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        /// alert
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        /// timer alert
        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(2000);
        alert.accept();
        /// confirm alert
        WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",confirmBtn);
        confirmBtn.click();
        Thread.sleep(2000);
        alert.dismiss();
        /// prompt alert
        WebElement prompt = driver.findElement(By.id("promtButton"));  //???
        prompt.click();
        alert.sendKeys("Nuta Nuta");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
    }
}