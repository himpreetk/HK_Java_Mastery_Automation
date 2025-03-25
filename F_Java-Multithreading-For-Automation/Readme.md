# Java Multithreading for Automation

## Topics Covered
- Threads
- Runnable Interface
- ExecutorService
- Synchronization
- Parallel Test Execution

## Description
This module demonstrates **multithreading in Java for automation testing**, enabling parallel execution of test cases. It uses **ExecutorService** to manage a pool of threads and execute multiple test cases concurrently.

## Code Examples
### 1. **Using Threads for Parallel Execution**
- Runs multiple test cases concurrently using `ExecutorService`.

### 2. **Thread Synchronization**
- Ensures thread safety while accessing shared resources.

### 3. **Implementing Runnable Interface**
- Uses `Runnable` to define test execution logic in threads.

                 +----------------------+
                 |      User Input       |
                 +----------------------+
                            |
                            v
                 +----------------------+
                 |  MultithreadingAutomation.java |
                 +----------------------+
                            |
  -------------------------------------------------
  |                |                |              |
  v                v                v              v
+----------------+ +----------------+ +----------------+ +----------------+
| Thread-1       | | Thread-2       | | Thread-3       | | Thread-4       |
| (Executes TC-1)| | (Executes TC-2)| | (Executes TC-3)| | (Executes TC-4)|
+----------------+ +----------------+ +----------------+ +----------------+
  |                |                |              |
  v                v                v              v
TestCase-1 <-----+  TestCase-2 <----+  TestCase-3 <----+  TestCase-4 <----+
(Parallel Execution)


## How to Run
1. Copy the `MultithreadingAutomation.java` file into your project.
2. Compile and run the Java program:
   ```sh
   javac MultithreadingAutomation.java
   java MultithreadingAutomation
   ```

## Expected Output
```
TestCase-1 execution started by pool-1-thread-1
TestCase-2 execution started by pool-1-thread-2
TestCase-3 execution started by pool-1-thread-3
TestCase-1 execution completed by pool-1-thread-1
TestCase-4 execution started by pool-1-thread-1
...
```

## Why It’s Useful for Automation?
- **Improves execution time** by running tests in parallel.
- **Enhances efficiency** in large test suites.
- **Utilizes system resources effectively** by managing threads.

---
This repository is part of the **Java for Automation Series** 🚀

