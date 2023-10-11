package DEMO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathDemo extends BaseTest {

    @Test  // Klass Practice Work
    public void searchPath() throws InterruptedException {
    driver.get("https://www.amazon.com/");
    WebElement searchAmazon = driver.findElement(By.id("twotabsearchtextbox"));
    searchAmazon.sendKeys("iphone 15 promax case");
    searchAmazon.sendKeys(Keys.ENTER);
    Thread.sleep(3000);
    //WebElement submitBtn = driver.findElement(By.id("nav-search-submit-button")); //?? doesn't work why??
    //submitBtn.click();
    //Thread.sleep(5000);
    WebElement iphone15 = driver.findElement(By.xpath("//span[contains(text(),'ZAGG InvisibleShield Glass Elite Privacy 360 iPhone 15')]"));
    Thread.sleep(3000);
    //iphone15.sendKeys(Keys.ENTER);
    System.out.println(iphone15.getText());
    //iphone15.click();
    // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//your/xpath")));
    //div[@class='sg-row']/div[2]//h2//a/span[contains(@class, 'a-size-medium')]
    //span[contains(text(), 'Pelican Protector Series ')]
}
    @Test
    void absoluteXpath() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstNameInputField = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        firstNameInputField.sendKeys("John");
        System.out.println(firstNameInputField.getText());
        Thread.sleep(5000);
            }
    /// if // --> from the particular place; / --> from the beginning html/; //* ---> search in whole html

    @Test
    void relativeXpath1() {
        driver.get("https://demoqa.com/automation-practice-form"); // by the attribute id
        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameInputField.sendKeys("Doe");
    }

    @Test
    void relativeXpath2() {
        driver.get("https://demoqa.com/automation-practice-form"); // by the attribute name
        WebElement emailInputField = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        emailInputField.sendKeys("John@gmail.com");

//          WebElement mobNumberInputField = driver.findElement(By.xpath("//*[@id='userNumber']"));
        }
    @Test
    void relativeXpath3() {
        driver.get("https://demoqa.com/automation-practice-form"); // by the method text(), not attribute
      //WebElement registrationFormText = driver.findElement(By.xpath("//*[text()='Student Registration Form']"));

       ///by the methods contains() and text() ---> contains some text
      WebElement contains = driver.findElement(By.xpath("//*[contains(text(),'Student')]"));
      System.out.println(contains.getText());
       /// by the label
      // WebElement emailText = driver.findElement(By.xpath("//form/div[2]/div/label"));
      // System.out.println(emailText.getText());
        }
    @Test
    void relativeXpath4(){
        driver.get("https://demoqa.com/text-box");
         /// if  double id of the same attributes---> find by index of attribute
        WebElement currentAddress = driver.findElement(By.xpath("(//*[@id='currentAddress'])[1]"));
        System.out.println(currentAddress.getText());

         ///  /.. --> up to the parent, /p --> vise versa, if instead * --> p --> search only in tag p
//      WebElement parent = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]/../p"));
    }

}
