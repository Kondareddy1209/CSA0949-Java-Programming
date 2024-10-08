import java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0;
        int compositeCount = 0;

        System.out.println("Enter the numbers (enter a negative number to stop):");

        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (isPrime(number)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        System.out.println("Composite numbers: " + compositeCount);
        System.out.println("Prime numbers: " + primeCount);
        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
