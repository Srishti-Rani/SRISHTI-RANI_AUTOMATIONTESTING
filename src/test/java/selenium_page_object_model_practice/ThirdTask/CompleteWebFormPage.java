package selenium_page_object_model_practice.ThirdTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium_page_object_model_practice.FirstTask.PageObject;

public class CompleteWebFormPage extends PageObject {
    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "job-title")
    private WebElement jobTitleInput;

    @FindBy(id = "radio-button-1")
    private WebElement highSchoolRadioButton;

    @FindBy(id = "radio-button-2")
    private WebElement collegeRadioButton;

    @FindBy(id = "radio-button-3")
    private WebElement gradSchoolRadioButton;

    @FindBy(id = "checkbox-1")
    private WebElement maleCheckbox;

    @FindBy(id = "checkbox-2")
    private WebElement femaleCheckbox;

    @FindBy(id = "checkbox-3")
    private WebElement preferNotToSayCheckbox;

    @FindBy(id = "select-menu")
    private WebElement yearsOfExperienceSelectMenu;

    @FindBy(id = "datepicker")
    private WebElement datePicker;

    @FindBy(linkText ="Submit")
    private WebElement submitButton;

    public CompleteWebFormPage(WebDriver driver){
        super(driver);
    }

    public void enterPersonalInfo(String firstName, String lastName, String jobTitle){
        this.firstNameInput.clear();
        this.firstNameInput.sendKeys(firstName);

        this.lastNameInput.clear();
        this.lastNameInput.sendKeys(lastName);

        this.jobTitleInput.clear();
        this.jobTitleInput.sendKeys(jobTitle);
    }

    public void clickAllCheckboxes(){
        maleCheckbox.click();
        femaleCheckbox.click();
        preferNotToSayCheckbox.click();
    }

    public void clickAllRadioButtons(){
        highSchoolRadioButton.click();
        collegeRadioButton.click();
        gradSchoolRadioButton.click();
    }

    public void clickAllSelectMenuOptions(){
        for(int i = 0; i<=4; i++){
            yearsOfExperienceSelectMenu.click();
            driver.findElement(By.xpath("//option[@value="+ i +"]")).click();
        }
    }

    public void chooseDate(String date){
        this.datePicker.clear();
        this.datePicker.sendKeys();
    }

    public ThanksPage clickSubmit(){
        submitButton.click();
        return new ThanksPage(driver);
    }
}
