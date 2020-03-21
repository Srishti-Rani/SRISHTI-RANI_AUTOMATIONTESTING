package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckCheckBoxes {
    WebDriver driver;

    @BeforeTest
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI Leopard Pro\\IdeaProjects\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
    }

    @DataProvider(name = "XpathLocators")
    public Object[][] getXpathLocatorsForCheckboxes() {
        return new Object[][]{
                {"//input[@id = \"checkbox-1\"]"}, {"//input[@id = \"checkbox-2\"]"}, {"//input[@id = \"checkbox-3\"]"}
        };
    }

    @DataProvider(name = "CssLocators")
    public Object[][] getCssLocatorsForCheckboxes() {
        return new Object[][]{
                {"input#checkbox-1"}, {"input#checkbox-2"}, {"input#checkbox-3"}
        };
    }

    @Test(dataProvider = "XpathLocators")
    public void checkXpathLocators(String locator) {

        driver.findElement(By.xpath(locator)).click();
    }

    @Test(dataProvider = "CssLocators")
    public void checkCssLocators(String locator) {

        driver.findElement(By.cssSelector(locator)).click();
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
