package comtests;

import com.digital.models.Student;
import comtests.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

public class PracticeFormTest extends BaseTest {
    @Test
    void fillUpTheFormTest() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        Student student = fakeDataProvider.createfakerStudent();
        practiceFormPages.fillUpTheForm(student).checkTheStudentDetails(student);
    }
//            @Test
////            void fillUpTheFormTest() throws InterruptedException, AWTException {
////                driver.get("https://demoqa.com/automation-practice-form");
////                Student student= fakeDataProvider.createfakerStudent();

    }

