# Java Advanced Selenium

## Overview
This project demonstrates advanced Selenium concepts, including **Page Object Model (POM), Data-Driven Testing using Excel, and Test Execution with TestNG**. The framework is designed for maintainable and scalable test automation.

## Features
- **Page Object Model (POM)**: Separates UI interactions from test logic.
- **Data-Driven Testing**: Reads login credentials from an Excel file.
- **Test Execution with TestNG**: Implements test cases with assertions.

## Project Structure
```
Java-Advanced-Selenium/
│── src/
│   ├── main/
│   │   ├── pages/
│   │   │   ├── LoginPage.java
│   │   │   ├── HomePage.java
│   │   └── utils/
│   │       ├── ExcelReader.java
│   ├── test/
│   │   ├── tests/
│   │   │   ├── LoginTest.java
│   ├── resources/
│   │   ├── testdata.xlsx
│── pom.xml (Maven dependencies)
│── README.md (Project explanation)
```

## Code Explanation

### **LoginPage.java**
- Defines locators for **username, password, and login button**.
- Provides methods to **enter credentials and click login**.
- Example:
  ```java
  public void login(String user, String pass) {
      username.sendKeys(user);
      password.sendKeys(pass);
      loginButton.click();
  }
  ```

### **HomePage.java**
- Contains a method to retrieve the **welcome message** after successful login.
- Example:
  ```java
  public String getWelcomeMessage() {
      return welcomeText.getText();
  }
  ```

### **ExcelReader.java**
- Reads **test data from an Excel file** using Apache POI.
- Extracts values from **specific rows and columns**.
- Example:
  ```java
  public String getCellData(int row, int col) {
      return sheet.getRow(row).getCell(col).getStringCellValue();
  }
  ```

### **LoginTest.java**
- Sets up a Selenium **WebDriver session**.
- Reads test credentials from **Excel**.
- Automates login steps using **POM methods**.
- Validates login success with an **assertion on welcome message**.
- Closes the browser after execution.
- Example:
  ```java
  @Test
  public void testLogin() {
      LoginPage loginPage = new LoginPage(driver);
      loginPage.login("testUser", "password123");
      Assert.assertEquals(homePage.getWelcomeMessage(), "Welcome, testUser!");
  }
  ```

           [User Input] --> [Test Data Source] --> [Test Runner]
                                   |                    |
                                   v                    v
                         [Page Object Model] ---> [Web Interaction]
                                   |                    |
                                   v                    v
                            [Assertions] ---------> [Test Result]
                                  |
                                  v
                        [Report Generation]


## How to Run
1. Install **Maven, TestNG, Apache POI**, and **Selenium WebDriver**.
2. Update the **ChromeDriver path** in `LoginTest.java`.
3. Run the test using:
   ```sh
   mvn test
   ```

## Dependencies
Include the following dependencies in `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.x.x</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.x.x</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Future Enhancements
- Implement **Cucumber BDD**.
- Add **parallel test execution**.
- Extend with **multiple test scenarios**.

---
**Author**: Himpreet Kaur  
For more QA automation projects, visit my GitHub profile.

