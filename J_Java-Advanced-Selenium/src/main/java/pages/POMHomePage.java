package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMHomePage {
    WebDriver driver;
    
    By welcomeMessage = By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]");
    
    public POMHomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getWelcomeMessage() {
        return driver.findElement(welcomeMessage).getText();
    }
}
