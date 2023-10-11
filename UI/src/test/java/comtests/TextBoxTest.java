package comtests;

import comtests.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

public class TextBoxTest extends BaseTest {
    @Test
    void fillUpTheFormTest() throws InterruptedException, AWTException {
        //
        driver.get("");
        textBoxPage.fillUpTheCurrentAddress("Moscow");
        textBoxPage.fillUpTheFullName("John");
        practiceFormPages.fillUpTheLastName("Doe");
        practiceFormPages.fillUpTheForm(student);

    }

}
