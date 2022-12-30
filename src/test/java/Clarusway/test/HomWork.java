package Clarusway.test;

import Clarusway.utilities.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomWork  {
    //        Create tests that depend on each other
//        Create beforeClass and set up settings.
//        By creating interdependent tests;
//        First go to Facebook.
//        Then go to Google depending on Facebook,
//        Then go to Amazon depending on Google
//        Close the driver.
    WebDriver driver;
@BeforeClass
public void start(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();

}
@AfterClass
public void tearDown(){
    driver.quit();
}
    @Test
    public void gofacebook(){
        driver.get("https://facebook.com");
    }
    @Test(dependsOnMethods ={"gofacebook"} )
    public void gogoogle() {
        driver.get("https://google.com");
    }
    @Test(dependsOnMethods = {"gogoogle"})
    public void goAmazon(){
        driver.get("https://amazon.com");
    }
}