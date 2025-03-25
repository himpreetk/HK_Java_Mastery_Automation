# Java Unit Testing for Automation

## Overview
This repository covers **Unit Testing in Java** for automation using **JUnit 5** and **TestNG**.

## Topics Covered
- JUnit and TestNG Basics
- Assertions for Validation
- Annotations (`@Test`, `@BeforeEach`, `@AfterEach`)
- Writing Automated Tests for a Simple Calculator

## Code Example: JUnit 5
The example includes a basic **Calculator** class with unit tests written using JUnit 5.

### Code Explanation

#### **1️⃣ Calculator Class (System Under Test)**
This class contains basic arithmetic operations:
```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```
✅ **Purpose:** Defines two methods - `add()` for addition and `subtract()` for subtraction.

#### **2️⃣ CalculatorTest Class (JUnit Tests)**
This class contains test cases to validate the `Calculator` functionality using **JUnit 5**.

```java
public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
```
🔹 `@BeforeEach`: Runs **before each test** to initialize the `Calculator` object.

#### **3️⃣ Writing Test Cases**
Each test case uses **JUnit assertions** to verify expected outputs.

##### Test Case 1: Testing Addition
```java
@Test
void testAddition() {
    assertEquals(10, calculator.add(5, 5));
}
```
✅ This checks if `calculator.add(5, 5)` correctly returns `10`.

##### Test Case 2: Testing Subtraction
```java
@Test
void testSubtraction() {
    assertEquals(2, calculator.subtract(5, 3));
}
```
✅ This checks if `calculator.subtract(5, 3)` correctly returns `2`.

#### **4️⃣ Cleaning Up After Each Test**
```java
@AfterEach
void tearDown() {
    calculator = null;
}
```
🔹 `@AfterEach`: Runs **after each test** to reset resources.

+-------------------+
|   User/TestRunner |
+-------------------+
         │
         ▼
+----------------------+
|  JUnit Test Class    |
| (CalculatorTest.java) |
+----------------------+
         │
         ▼
+----------------------+
|  Calculator Class    |
|  (Business Logic)    |
+----------------------+
         │
         ▼
+----------------------+
|  JUnit Assertions   |
| (assertEquals, etc.) |
+----------------------+
         │
         ▼
+----------------------+
|  JUnit Framework    |
|  (Runs & Verifies)  |
+----------------------+
         │
         ▼
+----------------------+
|  Test Results       |
|  (Pass / Fail)      |
+----------------------+

  
## Steps to Run
1. Clone this repository.
2. Ensure **JUnit 5** dependencies are included in your project.
3. Run the test cases using:
   ```sh
   mvn test  # If using Maven
   ```
   or
   ```sh
   gradle test  # If using Gradle
   ```

## Benefits
✅ Ensures reliability of automation scripts.
✅ Validates functionality through assertions.
✅ Provides structured test execution.

Feel free to explore and modify the code! 🚀

