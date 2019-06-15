package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProfilePageWebTests extends TestBase {

    @Test
    public void testProfileTitle() throws InterruptedException {

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
        profileButton.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement titleProfile = driver.findElement(By.id("titleprofile"));
        String titleProfileString = titleProfile.getText();


        //System.out.println("Title profile verification: " + titleProfile.getText().contains("Eliandilerer"));
        //System.out.println("Title profile verification, ver 2.0 - "
        // + titleProfileString.equals("My Profile: " + "Eliandilerer"));

        Assert.assertTrue(titleProfile.getText().contains("Eliandilerer"));



        //driver.quit();
    }

    @Test
    public void testCaseTypeOfUserFamily() throws InterruptedException {

        WebElement loginButton = driver.findElement(By.id("idsignin"));
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

        WebElement profileOwn = driver.findElement(By.id("profile"));
        profileOwn.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement editProfileButton = driver.findElement
                (By.cssSelector("div[class='intro-sign btn btn-gray-border'][id='idbtneditprofile']"));
        editProfileButton.click();
        waitUntilElementClickable(By.id("typeuser2inprofile"), 10);
        //Thread.sleep(4000);

        WebElement chooseFamily = driver.findElement(By.xpath
                ("//label[@class='btn btn-secondary'][@id='typeuser2inprofile']"));
        chooseFamily.click();
        waitUntilElementClickable(By.id("idbtnsaveprofile"), 10);
        //Thread.sleep(4000);

        WebElement saveChangesButton = driver.findElement(By.id("idbtnsaveprofile"));
        saveChangesButton.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement mainPageButton = driver.findElement
                (By.cssSelector("i[title='go main page for search events...']"));
        mainPageButton.click();
        waitUntilElementClickable(By.id("idbtnaddevent"), 10);
        //Thread.sleep(4000);

        WebElement addEventButton = driver.findElement(By.xpath("//i[@title='Add Event...']"));
        addEventButton.click();

        WebElement addNewEventTitle = driver.findElement(By.id("idtitleevent"));
        //System.out.println("Add new event title is visiable - " + addNewEventTitle.isDisplayed());

        Assert.assertTrue(addNewEventTitle.isDisplayed());

        //driver.quit();
    }

    @Test
    public void testCaseTypeOfUserFamilyAndGuest() throws InterruptedException {

        WebElement loginButton = driver.findElement(By.id("idsignin"));
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

        WebElement profileOwn = driver.findElement(By.id("profile"));
        profileOwn.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement editProfileButton = driver.findElement
                (By.cssSelector("div[class='intro-sign btn btn-gray-border'][id='idbtneditprofile']"));
        editProfileButton.click();
        waitUntilElementClickable(By.id("typeuser3inprofile"), 10);
        //Thread.sleep(4000);

        WebElement chooseGuestAndFamily = driver.findElement(By.xpath
                ("//label[@class='btn btn-secondary active'][@id='typeuser3inprofile']"));
        chooseGuestAndFamily.click();
        waitUntilElementClickable(By.id("idbtnsaveprofile"), 10);
        //Thread.sleep(4000);

        WebElement saveChangesButton = driver.findElement(By.id("idbtnsaveprofile"));
        saveChangesButton.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement mainPageButton = driver.findElement
                (By.cssSelector("i[title='go main page for search events...']"));
        mainPageButton.click();
        waitUntilElementClickable(By.id("idbtnaddevent"), 10);
        //Thread.sleep(4000);

        WebElement addEventButton = driver.findElement(By.xpath("//i[@title='Add Event...']"));
        addEventButton.click();

        WebElement addNewEventTitle = driver.findElement(By.id("idtitleevent"));
        System.out.println("Add new event title is visiable - " + addNewEventTitle.isDisplayed());

        Assert.assertTrue(addNewEventTitle.isDisplayed());

        //driver.quit();
    }

    @Test
    public void testCaseTypeOfUserGuest() throws InterruptedException {

        WebElement loginButton = driver.findElement(By.id("idsignin"));
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

        WebElement profileOwn = driver.findElement(By.id("profile"));
        profileOwn.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement editProfileButton = driver.findElement
                (By.cssSelector("div[class='intro-sign btn btn-gray-border'][id='idbtneditprofile']"));
        editProfileButton.click();
        waitUntilElementClickable(By.id("typeuser1inprofile"), 10);
        //Thread.sleep(4000);

        WebElement chooseGuest = driver.findElement(By.xpath
                ("//label[@class='btn btn-secondary'][@id='typeuser1inprofile']"));
        chooseGuest.click();
        waitUntilElementClickable(By.id("idbtnsaveprofile"), 10);
        //Thread.sleep(4000);

        WebElement saveChangesButton = driver.findElement(By.id("idbtnsaveprofile"));
        saveChangesButton.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement mainPageButton = driver.findElement
                (By.cssSelector("i[title='go main page for search events...']"));
        mainPageButton.click();
        waitUntilElementClickable(By.id("ihome"), 10);
        Thread.sleep(4000);

        WebElement addEventButton = driver.findElement(By.xpath("//i[@title='Add Event...']"));
        System.out.println("Add new event title is unvisiable - " + !addEventButton.isDisplayed());

        Assert.assertTrue(!addEventButton.isDisplayed());

        //driver.quit();
    }
}
