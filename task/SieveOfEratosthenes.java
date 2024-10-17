import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void findPrimes(int n) {
        if (n < 2) {
            System.out.println("There are no prime numbers less than 2.");
            return;
        }
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        System.out.print("Prime numbers up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        findPrimes(10);
        findPrimes(50);
        findPrimes(1);
    }
}
