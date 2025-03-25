package packagejavamultithreadingforautomation;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task representing a test case
class TestCase implements Runnable {
    private String testName;

    public TestCase(String testName) {
        this.testName = testName;
    }

    @Override
    public void run() {
        System.out.println(testName + " execution started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulating test execution time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(testName + " execution completed by " + Thread.currentThread().getName());
    }
}

public class JavaMultithreadingForAutomation {
    public static void main(String[] args) {
        // Creating a thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        // Submitting test cases for parallel execution
        for (int i = 1; i <= 5; i++) {
            executorService.execute(new TestCase("TestCase-" + i));
        }
        
        // Shutting down the executor
        executorService.shutdown();
    }
}
