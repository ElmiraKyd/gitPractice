package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CssDemo extends BaseTest {
    @Test
    void CssDemo1(){
        /// by css # --> by id
        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox")); // empty search box
        searchBox.sendKeys("Iphone");
        searchBox.sendKeys(Keys.ENTER);
        /// by css li --> by link and several elements
        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']")); // list of brands
        for(WebElement brand:brands){
            System.out.println(brand.getText());

        }

    }
}











