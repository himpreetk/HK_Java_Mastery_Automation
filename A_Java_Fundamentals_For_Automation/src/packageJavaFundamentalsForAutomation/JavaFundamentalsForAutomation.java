/* Java Fundamentals for Automation - Basic Program */

package packageJavaFundamentalsForAutomation;

public class JavaFundamentalsForAutomation 
{
    // 1. Function to check if a number is even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }

    public static void main(String[] args) 
    {
        // Variables and Data Types
        int number = 10;
        double decimalNumber = 10.5;
        char letter = 'A';
        boolean flag = true;

        //2. Operators (Addition & Multiplication)
        int sum = number + 5;
        int product = number * 2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // If-Else Control Flow
        checkEvenOdd(number);

        // Loops
        System.out.println("Loop Example - Printing Numbers 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Switch Case Example
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
