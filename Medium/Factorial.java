import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            int result = factorial(n);
            if (result != -1) {
                System.out.println("The factorial of " + n + " is: " + result);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        sc.close();
    }
}
