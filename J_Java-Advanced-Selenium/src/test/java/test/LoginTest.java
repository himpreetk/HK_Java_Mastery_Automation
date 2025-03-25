//Test Execution - LoginTest.java
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.POMHomePage;
import pages.POMloginPage;
import utils.ExcelReader;

import java.io.IOException;

public class LoginTest {
 WebDriver driver;
 POMloginPage loginPage;
 POMHomePage homePage;
 
 @BeforeClass
 public void setup() {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\testerr\\J_Java-Advanced-Selenium\\resources\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://practicetestautomation.com/practice-test-login/");
     driver.manage().window().maximize();
     
     loginPage = new POMloginPage(driver);
     homePage = new POMHomePage(driver);
 }
 
 @Test
 public void testLogin() throws IOException {
     String username = ExcelReader.getData("src/resources/Testdata.xlsx", 1, 0);
     String password = ExcelReader.getData("src/resources/Testdata.xlsx", 1, 1);
     
     loginPage.enterUsername(username);
     loginPage.enterPassword(password);
     loginPage.clickLogin();
     
     Assert.assertEquals(homePage.getWelcomeMessage(), "Welcome User!");
 }
 
 @AfterClass
 public void tearDown() {
     driver.quit();
 }
}
