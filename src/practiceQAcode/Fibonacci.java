package practiceQAcode;



public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // You can change this value to generate a different number of Fibonacci numbers

        System.out.println("Fibonacci sequence for first " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

