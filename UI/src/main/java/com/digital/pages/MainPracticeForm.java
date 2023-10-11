package com.digital.pages;

import com.digital.driver.Driver;
import com.digital.helper.ScreenShotMethods;
import com.digital.models.Student;
import com.digital.utils.FakeDataProvider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class MainPracticeForm {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        driver = Driver.getDriver();
    }
    @Test
    public void test1() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        Student student = new Student();
        student.setFirstName("Jyldyz");
        student.setLastName("Jeenbaeva");
        student.setEMail("Jilduz@gmail.com");
        student.setCurrentAddress("Lenina 268");
        student.setPhoneNumber("9965553570");
        PracticeFormPages practiceFormPages= new PracticeFormPages();
        practiceFormPages.fillUpTheForm(student);

//        student1.fillUpTheFirstName(fakeDataProvider.generateFakeFullName())
//                .fillUpTheLastName(fakeDataProvider.generateFakeLastName())
//                .fillUpTheUserEmail(fakeDataProvider.generateFakeEmail())
//                .fillUpTheUserNumber(fakeDataProvider.generationPhoneNUmber())
//                .fillUpTheCurrentAddress(fakeDataProvider.generationFakeCurrentAddress())
//                .clickGender()
//                .clickHobbies()
//                .selectState()
//                .selectSubject()
//                .selectSubject()
//                .selectSubject()
//                .setUploadPicture()
//                .selectSubmitBtn();


        Thread.sleep(5000);
        Driver.closeDriver();

    }
}
