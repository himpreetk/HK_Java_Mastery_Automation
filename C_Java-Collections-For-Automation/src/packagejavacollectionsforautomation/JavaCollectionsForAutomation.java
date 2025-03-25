package packagejavacollectionsforautomation;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectionsForAutomation 
{
    public static void main(String[] args) 
    {
        // Using List to Store Test Data
        List<String> testCases = new ArrayList<>();
        testCases.add("Login Test");
        testCases.add("Signup Test");
        testCases.add("Checkout Test");
        
        System.out.println("Test Cases List: " + testCases);
        
        // Iterating Over List
        System.out.println("Iterating over test cases:");
        for (String testCase : testCases) {
            System.out.println("Executing: " + testCase);
        }
        
        // Using Set to Store Unique Test IDs
        Set<Integer> testIds = new HashSet<>();
        testIds.add(101);
        testIds.add(102);
        testIds.add(103);
        testIds.add(101); // Duplicate, won't be added
        
        System.out.println("Unique Test IDs: " + testIds);
        
        // Using HashMap for Storing Test Data
        Map<String, String> testData = new HashMap<>();
        testData.put("username", "test_user");
        testData.put("password", "securePass123");
        
        System.out.println("Test Data HashMap: " + testData);
        
        // Iterating Over Map
        System.out.println("Iterating over test data:");
        for (Map.Entry<String, String> entry : testData.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // Using Streams for Filtering
        List<String> filteredTests = testCases.stream()
                .filter(test -> test.contains("Login"))
                .collect(Collectors.toList());
        
        System.out.println("Filtered Test Cases (Containing 'Login'): " + filteredTests);
    }
}
