package DEMO;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class PracticeRandomColor  extends BaseTest {

    @Test
    void demo22() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu"); // select menu
        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(selectColor);
//

        List<WebElement> selectedOptions = select.getOptions();             // all  options ---> list
        //        for (WebElement options : selectedOptions) {  // all available options from dropdown list
//            System.out.println(options.getText());
//        }
        selectRandomColor(select, selectedOptions); // random
    }

    //@Test //not work??
    void selectRandomColor(Select select, List<WebElement> selectedOptions) {

        Random randomcolor = new Random();
        int indexcolor = randomcolor.nextInt(selectedOptions.size());
        select.selectByIndex(indexcolor);
        System.out.println(indexcolor);
    }

}
