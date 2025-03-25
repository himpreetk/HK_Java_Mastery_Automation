package packageJavaUnitTestingForAutomation;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class JavaUnitTestingForAutomationForCalculator {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }
}

