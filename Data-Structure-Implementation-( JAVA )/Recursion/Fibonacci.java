// Java program to find Fibonacci of Given Number(n) using Recurtion and Iterative approach

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(findFibonacciIterative(30)); // Output=> 832040
        System.out.println(findFibonacciRecursive(30)); // Output=> 832040

    }

    // Method to Find Fib(n) using Recursion
    static long findFibonacciRecursive(int n) {
        if (n < 2)
            return n;
        return findFibonacciRecursive(n - 1) + findFibonacciRecursive(n - 2);
    }

    // Method to Find Fib(n) Iterative
    static long findFibonacciIterative(int n) {
        if (n < 2)
            return n;
        long n1 = 0; // Fib(0)
        long n2 = 1; // Fib(1)
        long temp;

        // we start loop from Fib(2)
        for (int i = 2; i <= n; i++) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        return n2;

    }
}