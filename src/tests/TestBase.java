package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void startApp() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        //Thread.sleep(4000);
        waitUntilElementClickable(By.id("idsignin"),20);
        driver.manage().window().maximize();

        WebElement closeIntro = driver.findElement(By.id("closedIntro"));
        closeIntro.click();
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();

    }

    public void waitUntilElementClickable(By locator, int time)
    {
        try
        {
            new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(locator));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void waitUntilElementVisable(By locator, int time)
    {
        try
        {
            new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void waitUntilElementAttrContainsText(By locator, String attribute, String value, int time)
    {
        try
        {
            new WebDriverWait(driver, time).until(ExpectedConditions.attributeContains(locator, attribute, value));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
