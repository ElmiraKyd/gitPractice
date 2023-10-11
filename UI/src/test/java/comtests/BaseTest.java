package comtests;

import com.digital.driver.Driver;
import com.digital.models.Student;
import com.digital.pages.PracticeFormPages;
import com.digital.pages.RegistrationPage;
import com.digital.pages.TextBoxPage;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public FakeDataProvider fakeDataProvider;
    public PracticeFormPages practiceFormPages;
    public  Student student;
    public RegistrationPage registrationPage;

    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
        practiceFormPages=new PracticeFormPages();
        fakeDataProvider = new FakeDataProvider();
        registrationPage= new RegistrationPage();
        student= new Student();
    }
        @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }
}





