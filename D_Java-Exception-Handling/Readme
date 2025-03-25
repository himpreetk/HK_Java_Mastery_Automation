# Java Exception Handling for Automation

## Topics Covered
- Try-Catch
- Finally
- Throws
- Custom Exceptions

## Description
This module covers exception handling in Java with a focus on Selenium WebDriver. It demonstrates handling common exceptions such as `NoSuchElementException`, using `try-catch-finally` blocks, and defining custom exceptions for better error handling in test automation.

## Code Examples
### 1. **Handling WebDriver Exceptions**
- Demonstrates using `try-catch` to handle `NoSuchElementException`.
- Ensures the WebDriver quits properly in the `finally` block.

### 2. **Using `throws` for Exception Propagation**
- Shows how to declare exceptions using `throws`.

### 3. **Custom Exception Handling**
- Demonstrates creating a `AutomationException` class for handling specific test failures.

        +--------------------------------------+
        |      Main Method Execution          |
        +--------------------------------------+
                        |
                        v
        +--------------------------------------+
        |  Initialize WebDriver (ChromeDriver)|
        |  Load Example Webpage               |
        +--------------------------------------+
                        |
                        v
        +--------------------------------------+
        |  Simulate Exception (NoSuchElement) |
        |  Catch and Handle Exception         |
        +--------------------------------------+
                        |
                        v
        +--------------------------------------+
        |  Finally Block: Quit WebDriver      |
        |  Ensure Resource Cleanup            |
        +--------------------------------------+
                        |
                        v
        +--------------------------------------+
        |  Validate Test Data Function        |
        |  Throws Custom AutomationException  |
        +--------------------------------------+
                        |
                        v
        +--------------------------------------+
        |  Catch and Handle Custom Exception  |
        |  Print Error Message to Console     |
        +--------------------------------------+
                        |
                        v
        +--------------------------------------+
        |        Console Output Display       |
        +--------------------------------------+


## How to Run
1. Ensure you have **Selenium WebDriver** and **ChromeDriver** configured.
2. Update the `chromedriver` path in the Java file.
3. Compile the Java file:
   ```sh
   javac JavaExceptionHandling.java
   ```
4. Run the program:
   ```sh
   java JavaExceptionHandling
   ```

## Expected Output
```
Caught NoSuchElementException: Element not found on page
Driver closed successfully.
Custom Exception Caught: Test data is invalid or empty
```

## Why It’s Useful for Automation?
- Prevents script failures due to unexpected exceptions.
- Ensures proper resource management (e.g., closing WebDriver).
- Improves error debugging and reporting in test automation frameworks.

---
This repository is part of the **Java for Automation Series** 🚀

