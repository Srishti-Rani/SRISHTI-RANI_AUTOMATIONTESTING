package selenium_page_object_model_practice.ThirdTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium_page_object_model_practice.FirstTask.PageObject;

public class ThanksPage extends PageObject {
    @FindBy(xpath = "//div[@role = 'alert']")
    private WebElement alert;

    public ThanksPage(WebDriver driver){
        super(driver);
    }

    public String getAlertMessage(){
        return this.alert.getText();
    }
}
