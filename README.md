# Fibonacci-JUnit

## Table of Contents

1. [Overview](#Overview)
2. [Purpose and Functionality](#Purpose-and-Functionality)
    - Fibonacci.java
    - FibonacciTest.java
3. [Setup Instructions](#Setup-Instructions)
4. [Usage Instructions](#Usage-Instructions)
5. [Example Output](#Example-Output)
6. [Conclusion](#Conclusion)

## Overview

The project consists of two primary components:

1. **Fibonacci.java:** This class contains the methods for calculating Fibonacci numbers recursively and iteratively.
2. **FibonacciTest.java:** This class contains JUnit tests to ensure the correctness and performance of the methods in Fibonacci.java.

This project implements the Fibonacci sequence calculation in Java with both recursive and iterative methods. It also includes JUnit tests to validate the functionality and performance of these methods.

## Purpose and Functionality

### Fibonacci.java

This file defines the **Fibonacci** class with methods for calculating Fibonacci numbers both recursively and iteratively.
```
package Application;

public class Fibonacci {
    
    public int recursiveCallCount = 0;
    
    public int recursiveFib(int n) {
        recursiveCallCount = recursiveCallCount + 1;
        if(n < 2) {
            return n;
        } else {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }
    }
    
    public static int fastFib(int n) throws Exception {
        if(n < 0) {
            throw new Exception("Argument is less than 0.");
        }
        if (n == 0) {
            return 0;
        } else {
            int f1 = 0;
            int f2 = 1;
            while (n > 1) {
                int temp = f1 + f2;
                f1 = f2;
                f2 = temp;
                n = n - 1;
            }
            return f2;
        }
    }
}
```

### FibonacciTest.java

This file defines the FibonacciTest class, which contains JUnit tests to validate the functionality of the Fibonacci methods.
```
package Application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {
    static Fibonacci fib;
    
    // BeforeClass method
    @BeforeClass
    public static void init() {
        fib = new Fibonacci();
    }
    
    // Before method
    @Before
    public void prep() {
        fib.recursiveCallCount = 0;
    }
    
    // Test method
    @Test
    public void testRecursiveFib6() {
        assertEquals(8, fib.recursiveFib(6));
        assertEquals(25, fib.recursiveCallCount);
    }
    
    // Test method
    @Test
    public void testRecursiveFib7() {
        assertEquals(13, fib.recursiveFib(7));
        assertEquals(41, fib.recursiveCallCount);
    }
    
    // Test method
    @Test
    public void testFib6() throws Exception {
        assertEquals(8, Fibonacci.fastFib(6));
    }
    
    // Test method
    @Test(expected = Exception.class)
    public void testFastFibNegative1() throws Exception {
        Fibonacci.fastFib(-1);
    }
}
```

## Setup Instructions

1. Clone or download the project repository.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Ensure you have JUnit 4.x added to your project's classpath.

## Usage Instructions

1. Open the Fibonacci.java file to view or edit the Fibonacci methods.
2. Open the FibonacciTest.java file to view or edit the JUnit tests.
3. Run the JUnit tests to validate the functionality of the Fibonacci methods.

## Example Output

Running the JUnit tests will output results similar to the following:

```
Test Results:
1. testRecursiveFib6: Passed
2. testRecursiveFib7: Passed
3. testFib6: Passed
4. testFastFibNegative1: Passed

All tests passed successfully.
```

If any test fails, the output will indicate which test failed and provide details about the failure.

```
Running Application.FibonacciTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
```

## Conclusion

The Fibonacci-JUnit project successfully implements both recursive and iterative methods for calculating Fibonacci numbers and includes comprehensive JUnit tests to validate their correctness. The test results demonstrate that both methods function as expected for the given test cases. The iterative method (fastFib) efficiently handles larger inputs, while the recursive method provides a straightforward approach for educational purposes. This project serves as a solid foundation for understanding the implementation and testing of algorithms in Java using JUnit.
