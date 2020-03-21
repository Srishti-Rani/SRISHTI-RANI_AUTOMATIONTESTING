package selenium_page_object_model_practice.SecondHomeWorkRemake;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium_page_object_model_practice.FirstTask.PageObject;

public class CheckboxPage extends PageObject {
    @FindBy(xpath = "//input[@id = \"checkbox-1\"]")
    private WebElement firstCheckbox;

    @FindBy(xpath = "//input[@id = \"checkbox-2\"]")
    private WebElement secondCheckbox;

    @FindBy(xpath = "//input[@id = \"checkbox-3\"]")
    private WebElement thirdCheckbox;

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    public void clickAllCheckboxes() {
        firstCheckbox.click();
        secondCheckbox.click();
        thirdCheckbox.click();
    }
}
