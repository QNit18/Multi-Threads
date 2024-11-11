package DataSharingBetweenThreads;

public class Main {
    public static void main(String[] args) {
        int x = 10;  // Local variable stored in the stack
        int result = factorial(x);
        System.out.println("Factorial of " + x + " is " + result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
