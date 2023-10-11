package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.TestRunner;
import org.testng.annotations.Test;

public class HomeWork3OrderFaiza extends BaseTest{

    @Test
    public void orderFood() throws InterruptedException {
        driver.get("https://faiza.kg/");
        Thread.sleep(3000);
        /// open and scroll
        Actions actions = new Actions(driver);
        WebElement all_menu = driver.findElement(By.xpath("//a[@href='/menu']"));
      //WebElement all_menu = driver.findElement(By.cssSelector("a[href='/menu']"));// by css
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", all_menu);
        Thread.sleep(5000);
        all_menu.click();
        Thread.sleep(3000);
        ///choose 3 dishes Mampar
        WebElement dishtext = driver.findElement(By.xpath("(//*[contains(text(),'Мампар')])[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dishtext);
        Thread.sleep(6000);
        WebElement costActive = driver.findElement(By.xpath("(//div[@class='cost-dish active'])[8]"));
        Thread.sleep(3000); //220som
        WebElement addToOrder1 = driver.findElement(By.xpath("(//div[@class='add-cart '])[8]"));
        addToOrder1.click(); //  add 1 dish
        Thread.sleep(3000);
        //WebElement cost07 = driver.findElement(By.xpath("(//div[@class='cost-dish '])[8]"));
        WebElement cost07 = driver.findElement(By.xpath("(//*[contains(text(),'180')])[11]"));
        Thread.sleep(3000);
        cost07.click();  //  click on 160som
        //actions.click(cost07).perform(); //click on 160som
        Thread.sleep(3000);
        WebElement addToOrder2 = driver.findElement(By.xpath("(//div[@class='add-cart '])[8]"));
        addToOrder2.click(); // add 2 nd dish
        Thread.sleep(3000);
        actions.click(addToOrder2).perform(); //  click 2 times to add 3d dishes
        Thread.sleep(4000);
////        /// order delivery
        WebElement openTheOrders = driver.findElement(By.xpath("(//div[@class='cart-button'])"));
        openTheOrders.click();
        Thread.sleep(5000);
        WebElement orderTheDelivery = driver.findElement(By.xpath("(//a[@class='open-ordering'])"));
        orderTheDelivery.click();
        Thread.sleep(5000);
//        /// input contact data
        WebElement contactData = driver.findElement(By.xpath("//input[@name='name']"));
        contactData.sendKeys("AAA");
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("888 88 88 88");
        WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", address);
        Thread.sleep(3000);
        address.sendKeys("Bish");
        WebElement changeFor1000 = driver.findElement(By.xpath("//input[@name='odd_money']"));
        changeFor1000.sendKeys("1000");
        WebElement comment = driver.findElement(By.xpath("//textarea[@name='comment']"));
        comment.sendKeys("fake");
        WebElement okForDelivery = driver.findElement(By.xpath("//button[@class='disabled-btn']"));
        Thread.sleep(7000);
        okForDelivery.click();
        Thread.sleep(3000);



        //(//div[@class='add-cart '])[8]
        //h3[@data-mh='height'] //(//h3[@data-mh='height'])[8] ??
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='open-card-detail'][8]")))


    }


}
