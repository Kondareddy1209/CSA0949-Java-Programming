import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the given number: ");
        int number = input.nextInt();
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        int[] factors = new int[number];
        int factorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[factorCount] = i;
                factorCount++;
            }
        }
        System.out.println("Number of factors = " + factorCount);
        if (n <= factorCount && n > 0) {
            System.out.println(n + "th factor of " + number + " = " + factors[n - 1]);
        } else {
            System.out.println("Invalid value for N.");
        }
        input.close();
    }
}
