package DEMO;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public abstract class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setUpBrowser() {

        //WebDriverManager.chromedriver().setup(); // set up the chrome driver

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // create new object

        driver.manage().window().maximize(); // make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // set up the time
        driver.get("Http://www.google.com/");
    }


    @AfterClass
    public void tearDown()
    {
        driver.close();
        driver.quit();

    }
}
