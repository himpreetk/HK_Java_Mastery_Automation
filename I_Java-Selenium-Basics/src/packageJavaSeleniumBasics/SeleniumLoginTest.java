package packageJavaSeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SeleniumLoginTest {
    public static void main(String[] args) {
        // Set the path for ChromeDriver (Adjust the path as needed)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\testerr\\I_Java-Selenium-Basics\\Resources\\chromedriver.exe");
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open login page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        
        // Maximize window
        driver.manage().window().maximize();
        
        // Locate elements and perform actions
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("submit"));
        
        usernameField.sendKeys("student");
        passwordField.sendKeys("Password123");
        loginButton.click();
        
        // Implement explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("has-text-align-center")));
        
        // Validate successful login
        if (driver.getCurrentUrl().contains("logged-in-successfully")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }
        
        // Close the browser
        driver.quit();
    }
}
