import java.util.Scanner;
public class PrimeNumbers {
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    static int findNthPrime(int n) {
        int count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) count++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N to find the nth prime number: ");
        int n = scanner.nextInt();
        int nthPrime = findNthPrime(n);
        System.out.println(n + "rd Prime number is " + nthPrime);
        System.out.print("Next " + n + " prime numbers after " + nthPrime + " are: ");
        int count = 0, num = nthPrime + 1;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        scanner.close();
    }
}
