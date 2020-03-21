package selenium_page_object_model_practice.SecondHomeWorkRemake;

import org.testng.annotations.Test;
import selenium_page_object_model_practice.FirstTask.FunctionalTest;

public class ButtonPageClickTest extends FunctionalTest {
    @Test
    public void clickButtons() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.clickAllButtons();
    }

}
