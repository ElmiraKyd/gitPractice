package com.digital.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;

    public class WaitDemo {
        @Test
        public void fluentWaitDemo(){
            WebDriver webDriver = new ChromeDriver();
            webDriver.get("https://demoqa.com/dynamic-properties");
            webDriver.manage().window().maximize();
            WebElement visibleAfterBtn = webDriver.findElement(By.id("visibleAfter"));
            FluentWait<WebDriver> fluentWait = new FluentWait<>(webDriver)
                    .withTimeout(Duration.ofSeconds(20))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class);
            fluentWait.until(ExpectedConditions.visibilityOf(visibleAfterBtn));
            visibleAfterBtn.click();
            webDriver.close();
            webDriver.quit();
        }

    }
