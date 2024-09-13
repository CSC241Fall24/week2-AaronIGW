// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    // Recursive method implementation
    public static int fRecursive(int n) {
        if (n < 3) {
            return n;
        }
        // Recursive case
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    // Iterative method implementation
    public static int fIterative(int n) {
        if (n < 3) {
            return n;
        }
        int a = 0, b = 1, c = 2; 
        int result = 0;

        // Loop from 3 to n
        for (int i = 3; i <= n; i++) {
            result = c + 2 * b + 3 * a;
            // Update values
            a = b;
            b = c;
            c = result;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Recursive result for " + n + ": " + fRecursive(n));
        System.out.println("Iterative result for " + n + ": " + fIterative(n));
    }
}
