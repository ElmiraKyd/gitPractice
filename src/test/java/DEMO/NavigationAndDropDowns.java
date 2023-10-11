package DEMO;

import org.asynchttpclient.ClientStats;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class NavigationAndDropDowns  extends BaseTest {
    @Test
    void demo1() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8'");
        driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click(); //
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
    @Test
    void demo2() throws InterruptedException {

        driver.get("https://demoqa.com/select-menu"); // select menu
        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));  // old Style Select Menu
        Select select = new Select(selectColor);
//        select.selectByVisibleText("Green"); // blue
//        Thread.sleep(3000);

//        select.selectByValue("4"); //purple
//        Thread.sleep(3000);
//
//        select.selectByIndex(7); //violet
//        Thread.sleep(3000);

         //List<WebElement> selectedOptions =select.getAllSelectedOptions();// only last selected option--> violet
//        List<WebElement> selectedOptions = select.getOptions();             // all  options ---> list
//        for (WebElement options : selectedOptions) {  // all available options from dropdown list
//            System.out.println(options.getText());
//        }

         ///Select Value
//        WebElement selectReact = driver.findElement(By.id("react-select-2-input"));
//        selectReact.sendKeys("Group 1, option 1");
//        Thread.sleep(3000);
//        selectReact.sendKeys(Keys.ENTER);

         ///all options in list
//        WebElement selectReact1 = driver.findElement(By.id("withOptGroup"));
//        WebElement inputclick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
//        inputclick.click();
//        List<WebElement> menuItem = selectReact1.findElements(By.xpath("./div[2]"));
//        for (WebElement item : menuItem) {
//            System.out.println(item.getText());
//        }

        /// Random options from the list
        WebElement selectReact1 = driver.findElement(By.id("withOptGroup"));
        System.out.println(selectReact1.getText());
        WebElement inputclick2= driver.findElement(By.xpath("//div[@aria-hidden='true']"));
        System.out.println(inputclick2);
        inputclick2.click();
        List<WebElement> menuItem2 = selectReact1.findElements(By.xpath("./div[2]"));
        WebElement selectReactInput = driver.findElement(By.id("react-select-2-input"));
        //Random random = new Random();
       // int randomindex = random.nextInt(menuItem2.size());
        List<String> menuItemValue = new ArrayList<>();

        String[] itemValue = new String[menuItem2.size()];
            for(int i = 0; i< menuItem2.size(); i++){
            itemValue[i] = String.valueOf(menuItem2.get(i).getText());
        }
//        for(String item:itemValue){
//            System.out.println(item);
//        }
      //  System.out.println(menuItemValue.size());
        Random random = new Random();
        int numberOfItemsToSelect = random.nextInt(itemValue.length);
        System.out.println(numberOfItemsToSelect);
        System.out.println(itemValue[5]);
            selectReactInput.sendKeys(itemValue[numberOfItemsToSelect]);
            selectReactInput.sendKeys(Keys.ENTER);
        }

//        for (WebElement item2 : menuItem2) {
//            System.out.println(item2.getText());
//            menuItemValue.add(item2.getText());
//        }
 //  System.out.println(menuItemValue.size());
        //SelectReactInput.clear();
//        for (String value: menuItemValue){
//            selectReactInput.sendKeys(value);
//            selectReactInput.sendKeys(Keys.ENTER);
//        }

//        for(int i=0; i<menuItemValue.size(); i++){
//            selectReactInput.sendKeys(menuItemValue.get(i));
//            System.out.println(menuItemValue);
//            selectReactInput.sendKeys(Keys.ENTER);
//            System.out.println(menuItemValue);
//            Thread.sleep(3000);
        }
//
//        WebElement selectReactInput = driver.findElement(By.id("react-select-2-input"));
//        String[] itemsValue = new String[6];
//        for (int i = 0; i < menuItem.size(); i++) {
//            itemsValue[i] = String.valueOf(menuItem.get(i).getText());
//        }
//        System.out.println(itemsValue.length);
//        Random random = new Random();
//        int numberOfItemsToSelect = random.nextInt(itemsValue.length);
//        System.out.println(numberOfItemsToSelect);
//        System.out.println(itemsValue[5]);
//        selectReactInput.sendKeys(itemsValue[numberOfItemsToSelect]);
//        selectReactInput.sendKeys(Keys.ENTER);



















