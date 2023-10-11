package com.digital.driver;

import com.digital.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver(){   //if private --> Singleton pattern --> cant create object anywhere else
    }
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){
            switch (ConfigReader.getProperties("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edje":
                    driver = EdjeWebDriver.loadEdjeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong driver name");
            }
        }
        return driver;
    }
    public static void closeDriver() {
        try {
            if (driver != null){
            driver.close();
            driver.quit();
            driver = null;
        }
    }catch (Exception e){
            System.err.println("Error while closing the driver");
        }
    }
}
