// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    // Recursive method implementation
    public static int fRecursive(int n) {
 
        if (n < 3) {
            return n;
        }
    
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    // Iterative method implementation
    public static int fIterative(int n) {
       
        if (n < 3) {
            return n;
        }

        
        int f0 = 0, f1 = 1, f2 = 2; 
        int fn = 0; 


        for (int i = 3; i <= n; i++) {
            fn = f2 + 2 * f1 + 3 * f0;
          
            f0 = f1;
            f1 = f2;
            f2 = fn;
        }

        return fn;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(fRecursive(0)); // Expected output: 0
        System.out.println(fRecursive(1)); // Expected output: 1
        System.out.println(fRecursive(2)); // Expected output: 2
        System.out.println(fRecursive(3)); // Expected output: 4
        System.out.println(fRecursive(4)); // Expected output: 11

        System.out.println(fIterative(0)); // Expected output: 0
        System.out.println(fIterative(1)); // Expected output: 1
        System.out.println(fIterative(2)); // Expected output: 2
        System.out.println(fIterative(3)); // Expected output: 4
        System.out.println(fIterative(4)); // Expected output: 11
    }
}
