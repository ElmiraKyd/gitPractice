
package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocators extends BaseTest {

    @Test
    void byIdTest2() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Alex");
        System.out.println(firstName.getText()); // why not  printed?
        Thread.sleep(4000);
    }

    @Test
    void byTagName(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byTag = driver.findElement(By.tagName("h5"));
        System.out.println(byTag.getText());
    }

    @Test
    void byClassName(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byClass = driver.findElement(By.className("main-header"));
        System.out.println(byClass.getText());
    }

    @Test
    void linkedText(){
        driver.get("https://demoqa.com/links");
        WebElement linkText = driver.findElement(By.linkText("Home"));
        System.out.println(linkText.getText());
    }

    @Test
    void partialLinkedText() throws InterruptedException {
        driver.get("https://demoqa.com/links");
        WebElement partialLink = driver.findElement(By.partialLinkText("Bad"));
        Thread.sleep(5000);
        System.out.println(partialLink.getText());
    }

    @Test
    void byName(){
        driver.get("https://accounts.lambdatest.com/login");
       // driver.get("https://demoqa.com/links");
        WebElement byName = driver.findElement(By.name("email"));
        byName.sendKeys("alina@gmailcom");
       // WebElement byName = driver.findElement(By.name("aswift_0"));
        System.out.println(byName.getText());}// not printed // ??
}
