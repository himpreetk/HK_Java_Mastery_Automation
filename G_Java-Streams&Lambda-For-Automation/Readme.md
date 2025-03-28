# Java Streams and Lambda for Automation

## Topics Covered
- Functional Programming
- Stream API
- Lambda Expressions

## Description
This module demonstrates **Java Streams and Lambda Expressions** in automation testing. It shows how to use the **Stream API** to filter test results and how **Lambda Expressions** simplify iteration over collections.

## Code Examples
### 1. **Filtering Test Data using Streams**
- Uses `Stream API` to filter passed test cases from a list of test results.

### 2. **Lambda Expressions in Iteration**
- Uses `forEach()` with a Lambda to print test results.

                    +----------------------+
                    |      User Input       |
                    +----------------------+
                                |
                                v
                 +------------------------------+
                 |  StreamsAndLambdaExample.java |
                 +-------------------------------+
                            |
           ------------------------------------------
                      |                |                    
                      v                v                    
            +----------------+ +----------------+
           | Stream API    | | Lambda Expression |
           | (Filters Data)| | (Prints Results)  |
           +----------------+ +----------------+
                     |                |
                     v                v
                  +---------------------+
                 | Processed Data Output |
                 | (Filtered Test Cases) |
                 +---------------------+


## How to Run
1. Copy the `StreamsAndLambdaExample.java` file into your project.
2. Compile and run the Java program:
   ```sh
   javac StreamsAndLambdaExample.java
   java StreamsAndLambdaExample
   ```

## Expected Output
```
Passed Test Cases: [PASS, PASS, PASS, PASS]
Test Result: PASS
Test Result: FAIL
Test Result: PASS
Test Result: PASS
Test Result: FAIL
Test Result: PASS
```

## Why It’s Useful for Automation?
- **Improves efficiency** in processing large test data.
- **Enhances readability** with functional programming.
- **Reduces boilerplate code** using Lambda expressions.

---
This repository is part of the **Java for Automation Series** 🚀

