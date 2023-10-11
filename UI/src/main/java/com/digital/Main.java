package com.digital;

import com.digital.driver.*;
import com.digital.helper.AlertHelper;
import com.digital.helper.ScreenShotMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; //?? вначале работал
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    WebDriver driver;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        WebDriver driver = ChromeWebDriver.loadChromeDriver();
        //       WebDriver driver = EdjeWebDriver.loadEdjeDriver();
        //  WebDriver driver = FireFoxWebDriver.loadFireFoxDriver();  // not working now
        //  WebDriver driver = SafariWebDriver.loadSafariWebDriver(); // not working
        //  WebDriver driver = OperaWebDriver.loadOperaDriver();      // not working
        driver.get("Http://www.google.com/");
    }

    @BeforeClass
    public void setIp() {
        driver = Driver.getDriver();
//        ScreenShotMethods = screenShotMethods = new ScreenShotMethods();
//        screenShotMethods.takeScreenShot();

    }

    @Test
    public void TestToAlert() throws InterruptedException {
        AlertHelper alerthelp = new AlertHelper();
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);
        alerthelp.acceptAlert();
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        alerthelp.acceptAlert();
        WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmBtn);
        confirmBtn.click();
        Thread.sleep(5000);
        alerthelp.dismissAlert();
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(5000);
        alerthelp.sendkeysAlert("Alina");
    }

    @Test
    public void test2() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());
    }
    @Test
    public void test3() {
    driver.get("https://demoqa.com/nestedframes");
    ///go to parent frame
    driver.switchTo().frame("frame1");
    /// then go to child frame
    driver.switchTo( ).frame(0);
        System.out.println(driver.findElement(By.tagName("p")).getText());
   // Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"Child Iframe");
    driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
    driver.switchTo().defaultContent();
        //  System.out.println(driver.findElement());




//
//
    }


}