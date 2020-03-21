package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckButtonMyVersion {

    @Test
    public void checkButtonsByClick() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI Leopard Pro\\IdeaProjects\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/buttons");

        for (WebElement x : driver.findElements(By.xpath("//div[contains(@class,'form-group row')]//button"))) {
            x.click();
        }
        driver.findElement(By.xpath("//div[@class='btn-group show']//a[1]")).click();
        driver.findElement(By.xpath("//div[@class='btn-group']/div/button")).click();
        driver.findElement(By.xpath("//div[@class='btn-group show']//a[2]")).click();

    }
}
