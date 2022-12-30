package Clarusway.test;

import Clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeWork2 extends BaseTest {
    @Test
    public void test() {
//    Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
//    Type username student into Username field
        WebElement userNamebox = driver.findElement(By.cssSelector("[id=\"username\"]"));
        userNamebox.sendKeys("student");
//    Type password Password123 into Password field
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("Password123");
//    Puch Submit button.
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
//    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
//    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement text = driver.findElement(By.cssSelector("[class=\"post-title\"]"));
//    Verify button Log out is displayed on the new page.
        WebElement logoutButton = driver.findElement(By.cssSelector("[class=\"post-content\"]"));
        Assert.assertTrue(logoutButton.isDisplayed());
    }

    @Test
    public void test2() {
//        Test Case2: Negative Username Test
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
//        Type username incorrectUser into Username field.
        WebElement userNamebox = driver.findElement(By.cssSelector("[id=\"username\"]"));
        userNamebox.sendKeys("incorrectUser");
//        Type password Password123 into Password field.
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("Password123");
//        Puch Submit button.
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
//        Verify error message is displayed.
        WebElement erroMessage = driver.findElement(By.cssSelector("[id=\"error\"]"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(erroMessage.isDisplayed());
//        Verify error message text is Your username is invalid!
        softAssert.assertTrue(erroMessage.getText().contains("Your username is invalid!"));
        softAssert.assertAll();


    }
    @Test
    public void test3(){
//        Test Case3: Negative Password Test
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");
//        Type username student into Username field.
        WebElement userNamebox = driver.findElement(By.cssSelector("[id=\"username\"]"));
        userNamebox.sendKeys("student");
//        Type password incorrectPassword into Password field.
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("incorrectPassword");
//        Puch Submit button.
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
//        Verify error message is displayed.
        WebElement erroMessage = driver.findElement(By.cssSelector("[id=\"error\"]"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(erroMessage.isDisplayed());
//        Verify error message text is Your password is invalid!
        softAssert.assertTrue(erroMessage.getText().contains("Your password is invalid!"));
        softAssert.assertAll();
    }


}
