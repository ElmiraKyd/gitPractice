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


    public class TextBox3   {

        @Test
        void FillUpTheFormTes1() throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // set up the chrome driver
        WebDriver driver = new ChromeDriver();  // create new object

        driver.manage().window().maximize();    // make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // set up the time;

        driver.get("https://demoqa.com/text-box");

        WebElement FullNameInputField = driver.findElement(By.id("userName"));
        String expectedFullName = "John Doe";
        FullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));
        String expectedEmail = "john@gmail.com";
        emailField.sendKeys(expectedEmail);
       //emailField.sendKeys("john@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        String expectedCurrentAdd = "Bishkek";
        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        String expectedPermanentAddress = "New York";
        permanentAddress.sendKeys(expectedPermanentAddress);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();

        Thread.sleep(8000);

        WebElement resultName = driver.findElement(By.id("name"));
        System.out.println(resultName.getText());
        Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrentAdd));

        driver.close();
        driver.quit();
        }

    }

