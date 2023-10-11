package com.digital.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdjeWebDriver {
    public static WebDriver loadEdjeDriver(){
       // System.setProperty("webdriver.edge.driver", "C:\\Program Files\\edgedriver_win64\\msedgedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;

    }

}
