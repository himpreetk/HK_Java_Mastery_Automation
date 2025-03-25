package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMloginPage {
    WebDriver driver;
    
    // Locators
    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.id("submit");
    
    // Constructor
    public POMloginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    // Methods
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }
    
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
