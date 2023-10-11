package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionDemo extends BaseTest{

    @Test
    void demo123() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        // make double click
        actions.doubleClick(doubleClickButton).perform();

        WebElement doubleClickText = driver.findElement(By.xpath("//p[text()='You have done a double click']"));
        Assert.assertEquals(doubleClickText.getText(),"You have done a double click");

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        // make right click
        actions.contextClick(rightClickButton).perform();

        WebElement rightClickText = driver.findElement(By.xpath("//p[text()='You have done a right click']"));
        Assert.assertEquals(rightClickText.getText(),"You have done a right click");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        // make click me
        actions.click(clickMeButton).perform();
        WebElement clickBtnText = driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
        Assert.assertEquals(clickBtnText.getText(),"You have done a dynamic click");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'"); // уменьшить масштаб, а то не виден результат
        Thread.sleep(5000);
    }

}
