package packagejavaexceptionhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;

// Custom Exception Class
class AutomationException extends Exception {
    public AutomationException(String message) {
        super(message);
    }
}

public class JavaExceptionHandling {
    public static void main(String[] args) {
        WebDriver driver = null;
        
        try {
            // Initialize WebDriver (Assuming ChromeDriver is set up)
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\testerr\\D_Java-Exception-Handling\\Resources\\chromedriver.exe");
            driver = new ChromeDriver();
            
            // Open a webpage
            driver.get("https://google.com");
            
            // Simulating an exception (Element not found)
            throw new NoSuchElementException("Element not found on page");
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            // Ensure driver quits even if an exception occurs
            if (driver != null) {
                driver.quit();
                System.out.println("Driver closed successfully.");
            }
        }
        
        // Example of using custom exception
        try {
            validateTestData(null);
        } catch (AutomationException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
    
    // Method to validate test data
    public static void validateTestData(String data) throws AutomationException {
        if (data == null || data.isEmpty()) {
            throw new AutomationException("Test data is invalid or empty");
        }
    }
}
