package selenium_page_object_model_practice.SecondHomeWorkRemake;

import org.testng.annotations.Test;
import selenium_page_object_model_practice.FirstTask.FunctionalTest;

public class CheckboxPageClickTest extends FunctionalTest {
    @Test
    public void checkCheckboxesClicks() {

        driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxPage checkboxPage = new CheckboxPage(driver);
        checkboxPage.clickAllCheckboxes();

    }
}
