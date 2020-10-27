// Java program to find Factorial of Given Number(n) using Recurtion and Iterative approach

public class Factorial {
    // Main function
    public static void main(String[] args) {

        System.out.println(findFactorialRecursive(10)); // output=> 3628800
        System.out.println(findFactorialIterative(10)); // output=> 3628800
    }

    // function to find factorial using recursion
    static long findFactorialRecursive(int n) {
        if (n == 2)
            return n;
        return n * findFactorialRecursive(n - 1);
    }

    // function to find factorial Iterative
    static long findFactorialIterative(int n) {
        long factorial = 2;
        for (int i = n; i > 2; i--) {
            factorial *= i;
        }
        return factorial;
    }
}