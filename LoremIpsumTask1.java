package GrowTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoremIpsumTask1 {

    @Test
    public void checkPresenceOfWordFish() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI Leopard Pro\\IdeaProjects\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://lipsum.com/");
        chromeDriver.findElement(By.xpath("//a[contains(@class , 'ru')]")).click();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String searchedWord = "рыба";
        String line = chromeDriver.findElement(By.xpath("//div[@id='Panes']/div[1]/p")).getText();
        Assert.assertTrue(line.contains(searchedWord));
    }

    @Test
    public void countNumberOfLoremWordIncludingParagraph() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI Leopard Pro\\IdeaProjects\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://lipsum.com/");
        chromeDriver.findElement(By.xpath("//input[@id='generate']")).click();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        int actualNumberOfFoundParagraphs = 0;
        int amountOfGeneralisations = 10;
        int numberOfParapraphsOnPage = 5;
        for (int n = 0; n < amountOfGeneralisations; n++) {
            for (int i = 1; i <= numberOfParapraphsOnPage; i++) {
                String paragraph = chromeDriver.findElement(By.xpath("//p[" + i + "]")).getText();
                if (paragraph.contains("lorem") || paragraph.contains("Lorem")) actualNumberOfFoundParagraphs++;
            }
            chromeDriver.navigate().back();
            chromeDriver.findElement(By.xpath("//input[@id='generate']")).click();
            chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        boolean checker = false;
        int expectedNumberOfFoundParagraphs = 3;
        if (actualNumberOfFoundParagraphs >= expectedNumberOfFoundParagraphs) checker = true;
        Assert.assertTrue(checker);
    }
}
