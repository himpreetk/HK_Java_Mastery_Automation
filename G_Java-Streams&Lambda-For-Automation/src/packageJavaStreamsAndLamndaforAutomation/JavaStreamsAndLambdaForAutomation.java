package packageJavaStreamsAndLamndaforAutomation;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsAndLambdaForAutomation {
    public static void main(String[] args) {
        // Sample test data (List of test case results)
        List<String> testResults = Arrays.asList("PASS", "FAIL", "PASS", "PASS", "FAIL", "PASS");

        // Using Streams to filter passed test cases
        List<String> passedTests = testResults.stream()
                .filter(result -> result.equals("PASS"))
                .collect(Collectors.toList());

        // Displaying the filtered results
        System.out.println("Passed Test Cases: " + passedTests);

        // Using Lambda to print each test case result
        testResults.forEach(result -> System.out.println("Test Result: " + result));
    }
}
