/* Java OOP for Automation - Basic Program */
package packageJavaOOPForAutomation;

//Class and Object Example
class TestCase {
 String testName;
 boolean status;

 // Constructor
 public TestCase(String testName) {
     this.testName = testName;
     this.status = false;
 }

 // Method to execute test
 public void executeTest() {
     status = true;
     System.out.println(testName + " executed successfully.");
 }
}

//Inheritance Example
class UITestCase extends TestCase {
 public UITestCase(String testName) {
     super(testName);
 }
}

//Polymorphism Example
class APITestCase extends TestCase {
 public APITestCase(String testName) {
     super(testName);
 }

 // Overriding executeTest method
 public void executeTest() {
     System.out.println("Executing API Test: " + testName);
     super.executeTest();
 }
}

//Abstraction Example
abstract class TestScenario {
 abstract void setup();
 abstract void teardown();
}

class LoginTestScenario extends TestScenario {
 void setup() {
     System.out.println("Setting up Login Test...");
 }

 void teardown() {
     System.out.println("Tearing down Login Test...");
 }
}

public class JavaOOPForAutomation {
 public static void main(String[] args) {
     // Creating Object
     TestCase test1 = new TestCase("Login Test");
     test1.executeTest();

     // Using Inheritance
     UITestCase uiTest = new UITestCase("Homepage UI Test");
     uiTest.executeTest();

     // Using Polymorphism
     APITestCase apiTest = new APITestCase("User API Test");
     apiTest.executeTest();

     // Using Abstraction
     TestScenario loginScenario = new LoginTestScenario();
     loginScenario.setup();
     loginScenario.teardown();
 }
}
