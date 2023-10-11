package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox  {

    @Test
    void FillUpTheFormTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // set up the chrome driver

        WebDriver driver = new ChromeDriver();  // create new object

        driver.manage().window().maximize();    // make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // set up the time;

        driver.get("https://demoqa.com/text-box");

        WebElement FullNameInputField = driver.findElement(By.id("userName"));
        FullNameInputField.sendKeys("John Doe");
        System.out.println(FullNameInputField.getText());

        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys("john@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Bishkek");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("New York");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();

        Thread.sleep(5000);


         driver.close();
         driver.quit();
    }

}
