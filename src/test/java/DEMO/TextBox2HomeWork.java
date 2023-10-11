package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox2HomeWork {
    @Test
    void FillUpTheFormTestt() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // set up the time;
        driver.get("https://demoqa.com/automation-practice-form");

        // first name
        WebElement FirstNameField = driver.findElement(By.id("firstName"));
        FirstNameField.sendKeys("Alina");

        // last name
        WebElement LastNameField = driver.findElement(By.id("lastName"));
        LastNameField.sendKeys("Alieva");

        // Email
        WebElement EmailName = driver.findElement(By.id("userEmail"));
        EmailName.sendKeys("alieva@gmail.com");

        //Gender
        WebElement GenderBtn1 = driver.findElement(By.xpath("//input[@id ='gender-radio-1']"));
        WebElement GenderBtn2 = driver.findElement(By.xpath("//input[@id ='gender-radio-2']"));
        WebElement GenderBtn3 = driver.findElement(By.xpath("//input[@id ='gender-radio-3']"));

        //Mobile number
        WebElement MobileNumber = driver.findElement(By.id("userNumber"));
        MobileNumber.sendKeys("0550787858");

        // DateOfBirth
        WebElement DateOfBirth = driver.findElement(By.id("dateOfBirthInput")); //input[@id='dateOfBirthInput']
        DateOfBirth.sendKeys("25 Sep 1993");

        //subject
        WebElement subjectField = driver.findElement(By.xpath("//input[@id='subjectsInput']"));

        driver.close();
        driver.quit();

    }

}
