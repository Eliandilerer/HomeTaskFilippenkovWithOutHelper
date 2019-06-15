package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageWebTests extends TestBase {

    @Test
    public void testLoginPositive() throws InterruptedException {

        WebElement loginButton = driver.findElement(By.id("idsignin"));
        List<WebElement> listButtons = driver.findElements(By.className("navi-item"));
        loginButton.click();

        WebElement loginField = driver.findElement(By.id("logininput"));
        loginField.click();
        loginField.sendKeys("Eliandilerer");

        WebElement passwordField = driver.findElement(By.id("passwordinput"));
        passwordField.click();
        passwordField.sendKeys("superacc99");

        WebElement signInButton = driver.findElement(By.id("signinrequest"));
        signInButton.click();
        waitUntilElementClickable(By.id("profile"), 10);
        //Thread.sleep(4000);

        WebElement profileButton = driver.findElement(By.id("profile"));
        //System.out.println("Profile button is visiable - " + profileButton.isDisplayed());

        //Assert.assertTrue(profileButton.getAttribute("title").contains("Eliandilerer"));
        Assert.assertTrue(profileButton.isDisplayed());

        //driver.quit();
    }

    @Test
    public void testCaseWrongLogin() throws InterruptedException {

        WebElement loginButton = driver.findElement(By.id("idsignin"));
        List<WebElement> listButtons = driver.findElements(By.className("navi-item"));
        loginButton.click();

        WebElement loginField = driver.findElement(By.id("logininput"));
        loginField.click();
        loginField.sendKeys("Eliandilerer");

        WebElement passwordField = driver.findElement(By.id("passwordinput"));
        passwordField.click();
        passwordField.sendKeys("psw");

        WebElement signInButton = driver.findElement(By.id("signinrequest"));
        signInButton.click();

        waitUntilElementAttrContainsText(By.id("wrongloginorpassword"), "class", "danger", 10);
        //Thread.sleep(4000);

        WebElement titleLoginVerification = driver.findElement(By.id("wrongloginorpassword"));
        System.out.println("Title login verification: " + titleLoginVerification.getText());

        WebElement closeSignIn = driver.findElement(By.id("closedsignin"));
        closeSignIn.click();
        waitUntilElementClickable(By.id("idsignin"), 10);
        //Thread.sleep(4000);

        //System.out.println("Name of the middle button in the header of the page is: " + listButtons.get(1).getText());
        //System.out.println("Name of the class in the button <Login> is: " + loginButton.getAttribute("class"));


        WebElement profileButton = driver.findElement(By.id("profile"));
        //System.out.println("Login button is visiable - " + loginButton.isDisplayed());
        //System.out.println("Profile button is unvisiable - " + !profileButton.isDisplayed());

        //Assert.assertTrue(loginButton.isDisplayed());
        //Assert.assertTrue(!profileButton.isDisplayed());

        int counter = 0;

        if(loginButton.isDisplayed())
        {
            counter++;
        }

        if(!profileButton.isDisplayed())
        {
            counter++;
        }

        Assert.assertEquals(counter, 2);

        //driver.quit();
    }


}
