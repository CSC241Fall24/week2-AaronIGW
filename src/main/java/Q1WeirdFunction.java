// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {


    public static int fRecursive(int n) {
      
        if (n < 3) {
            return n;
        }
       
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

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
        int n = 5;
        System.out.println(fRecursive(n));
        System.out.println(fIterative(n));
    }
}

