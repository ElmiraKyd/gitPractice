package DEMO;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Random;

public class PracticeRandomColor2 extends BaseTest {
    @Test
    void selectRandomColor() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu"); // select menu
        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(selectColor);


//        int options = 10;
//        int numberOfOptions = options.size();
//
//        // Генерируем случайное число от 0 до (количество опций - 1)
//                Random random = new Random();
//
//                int randomIndex = random.nextInt(numberOfOptions);
//
//                // Выбираем опцию по случайному индексу
//                WebElement randomOption = options.get(randomIndex);
//
//                String optionText = randomOption.getText();
//                select.selectByVisibleText(optionText);
//                Thread.sleep(3000);


}
}
