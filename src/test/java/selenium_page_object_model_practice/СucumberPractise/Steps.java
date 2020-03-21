package selenium_page_object_model_practice.СucumberPractise;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    WebDriver driver;

    @Given("^Open the Chrome and get to Loginpage$")
    public void open_the_Chrome_and_get_to_Loginpage() throws Throwable
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI Leopard Pro\\IdeaProjects\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
    }

    @When("^Enter the Email and Password$")
    public void enter_the_Email_and_Password() throws Throwable
    {
        driver.findElement(By.id("username")).sendKeys("rixej68166@emailnube.com");
        driver.findElement(By.id("password")).sendKeys("еуыееуые");
    }

    @Then("^Login to the account$")
    public void Login_to_the_account() throws Throwable
    {
        driver.findElement(By.tagName("button")).click();
    }


}
