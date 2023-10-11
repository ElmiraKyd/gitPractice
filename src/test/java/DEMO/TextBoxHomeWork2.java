package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;

public class TextBoxHomeWork2  extends BaseTest {
    @Test
    void checkbox() {
        driver.get("https://demoqa.com/buttons");

        WebElement excelFileBtn =driver.findElement(By.className("rct-icon rct-icon-check"));
    }
}
