public class FibonacciSeries {

    public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("The number of terms must be positive.");
            return;
        }
        int a = 0, b = 1;
        System.out.print(a + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fibonacci(5);
        fibonacci(1);
        fibonacci(0);
        fibonacci(10);
    }
}
