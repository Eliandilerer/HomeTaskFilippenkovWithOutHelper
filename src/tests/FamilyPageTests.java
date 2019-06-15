package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FamilyPageTests extends TestBase {

    @Test
    public void testCaseValues() throws InterruptedException {

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

        //Thread.sleep(4000);
        waitUntilElementClickable(By.id("profile"), 10);

        //WebElement profileOwn = driver.findElement(By.id("profile"));
        //profileOwn.click();
        //Thread.sleep(4000);

        //WebElement editProfileButton = driver.findElement
         //       (By.cssSelector("div[class='intro-sign btn btn-gray-border'][id='idbtneditprofile']"));
        //editProfileButton.click();
        //Thread.sleep(4000);

        //WebElement chooseFamily = driver.findElement(By.xpath
         //       ("//label[@class='btn btn-secondary active'][@id='typeuser2inprofile']"));
        //chooseFamily.click();
        //Thread.sleep(4000);

        //WebElement saveChangesButton = driver.findElement(By.id("idbtnsaveprofile"));
        //saveChangesButton.click();
        //Thread.sleep(4000);

        //WebElement mainPageButton = driver.findElement
         //       (By.cssSelector("i[title='go main page for search events...']"));
        //mainPageButton.click();
        //Thread.sleep(4000);

        WebElement profileOwn = driver.findElement(By.id("profile"));
        profileOwn.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement confessionValueOwn = driver.findElement(By.id("fieldobjconfession"));
        String confessionValueOwnString = confessionValueOwn.getText();
        System.out.print(confessionValueOwn.getText());

        WebElement profileFamily = driver.findElement(By.id("family"));
        profileFamily.click();
        waitUntilElementClickable(By.id("idbtnaddevent"), 10);
        //Thread.sleep(4000);

        WebElement confessionValueFamily = driver.findElement(By.id("fieldobjconfession"));
        String confessionValueFamilyString = confessionValueFamily.getText();
        System.out.println(" - " + confessionValueFamily.getText());

        profileOwn = driver.findElement(By.id("profile"));
        profileOwn.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement languageValueOwn = driver.findElement(By.xpath("//span[@id='fieldobjlanguages']"));
        String languageValueOwnString = languageValueOwn.getText();
        System.out.print(languageValueOwn.getText());

        profileFamily = driver.findElement(By.id("family"));
        profileFamily.click();
        waitUntilElementClickable(By.id("idbtnaddevent"), 10);
        //Thread.sleep(4000);

        WebElement languageValueFamily = driver.findElement(By.xpath("//span[@id='fieldobjlanguages']"));
        String languageValueFamilyString = languageValueFamily.getText();
        System.out.println(" - " + languageValueFamily.getText());

        profileOwn = driver.findElement(By.id("profile"));
        profileOwn.click();
        waitUntilElementClickable(By.id("idbtnverifyphoneprofile"), 10);
        //Thread.sleep(4000);

        WebElement foodValueOwn = driver.findElement(By.cssSelector("span[id='fieldobjfoodPreferences']"));
        String foodValueOwnString = foodValueOwn.getText();
        System.out.print(foodValueOwn.getText());

        profileFamily = driver.findElement(By.id("family"));
        profileFamily.click();
        waitUntilElementClickable(By.id("idbtnaddevent"), 10);
        //Thread.sleep(4000);

        WebElement foodValueFamily = driver.findElement(By.cssSelector("span[id='fieldobjfoodPreferences']"));
        String foodValueFamilyString = foodValueFamily.getText();
        System.out.println(" - " + foodValueFamily.getText());

        //System.out.println("Values of confession in guest's and family's profiles are equal - " +
        //confessionValueOwnString.equals(confessionValueFamilyString));
        //System.out.println("Values of language in guest's and family's profiles are equal - " +
        //languageValueOwnString.equals(languageValueFamilyString));
        //System.out.println("Values of food in guest's and family's profiles are equal - " +
        //foodValueOwnString.equals(foodValueFamilyString));

        //Assert.assertTrue(confessionValueOwnString.equals(confessionValueFamilyString));
        //Assert.assertTrue(languageValueOwnString.equals(languageValueFamilyString));
        //Assert.assertTrue(foodValueOwnString.equals(foodValueFamilyString));

        int counter = 0;

        if(confessionValueOwnString.equals(confessionValueFamilyString))
        {
            counter++;
        }
        if(languageValueOwnString.equals(languageValueFamilyString))
        {
            counter++;
        }
        if(foodValueOwnString.equals(foodValueFamilyString))
        {
            counter++;
        }

        Assert.assertEquals(counter, 3);

    }
}
