package DEMO;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserWindow extends BaseTest{

    @Test
    public void windowsTest(){
        driver.get("");
        new WebDriverWait(driver,Duration.ofSeconds(10));
       // .until(ExceptedConditions

    }


}
