package selenium_page_object_model_practice.SecondHomeWorkRemake;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium_page_object_model_practice.FirstTask.PageObject;

public class ButtonsPage extends PageObject {
    @FindBy(xpath = "//form//button[@class='btn btn-lg btn-primary']")
    private WebElement primaryButton;

    @FindBy(xpath = "//form//button[@class='btn btn-lg btn-success']")
    private WebElement successButton;

    @FindBy(xpath = "//form//button[@class='btn btn-lg btn-info']")
    private WebElement infoButton;

    @FindBy(xpath = "//form//button[@class='btn btn-lg btn-warning']")
    private WebElement warningButton;

    @FindBy(xpath = "//form//button[@class='btn btn-lg btn-danger']")
    private WebElement dangerButton;

    @FindBy(xpath = "//form//button[@class='btn btn-lg btn-link']")
    private WebElement linkButton;

    @FindBy(xpath = "//div//button[contains(text(), 'Left')]")
    private WebElement leftButton;

    @FindBy(xpath = "//div//button[contains(text(), 'Middle')]")
    private WebElement middleButton;

    @FindBy(xpath = "//div//button[contains(text(), 'Right')]")
    private WebElement rightButton;

    @FindBy(xpath = "//div//button[contains(text(), '1')]")
    private WebElement firstButton;

    @FindBy(xpath = "//div//button[contains(text(), '2')]")
    private WebElement secondButton;

    @FindBy(xpath = "//button[contains(@id,'btnGroupDrop1')]")
    private WebElement dropdownButton;

    @FindBy(xpath = "//div[@class='btn-group show']//a[1]")
    private WebElement firstLinkButton;

    @FindBy(xpath = "//div[@class='btn-group show']//a[2]")
    private WebElement secondLinkButton;


    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstLinkButton() {
        dropdownButton.click();
        firstLinkButton.click();
    }

    public void clickSecondLinkButton() {
        dropdownButton.click();
        secondLinkButton.click();
    }

    public void clickAllButtons() {
        primaryButton.click();
        successButton.click();
        infoButton.click();
        warningButton.click();
        dangerButton.click();
        linkButton.click();
        leftButton.click();
        middleButton.click();
        rightButton.click();
        firstButton.click();
        secondButton.click();
        clickFirstLinkButton();
        clickSecondLinkButton();
    }
}
