import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Given Number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        if (number == 0 || number < 0) {
            System.out.println("Invalid Input: Number must be a positive integer.");
            return;
        }
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.abs(number); i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Number of factors = " + factors.size());
        if (N > 0 && N <= factors.size()) {
            System.out.println(N + "th factor of " + number + " = " + factors.get(N - 1));
        } else {
            System.out.println("Nth factor does not exist.");
        }
    }
}