package selenium_page_object_model_practice.ThirdTask;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_page_object_model_practice.FirstTask.FunctionalTest;

public class CompleteWebFormPageTest extends FunctionalTest {
    @Test
    public void checkWebForm(){
        driver.get("https://formy-project.herokuapp.com/form");
        CompleteWebFormPage formPage = new CompleteWebFormPage(driver);
        formPage.enterPersonalInfo("Jack","Ginger","Waiter");
        formPage.clickAllCheckboxes();
        formPage.clickAllRadioButtons();
        formPage.clickAllSelectMenuOptions();
        formPage.chooseDate("06/08/2000");
        ThanksPage thanksPage = formPage.clickSubmit();

        Assert.assertEquals("The form was successfully submitted!", thanksPage.getAlertMessage(), "Alert doesn't fit pattern");
    }
}
