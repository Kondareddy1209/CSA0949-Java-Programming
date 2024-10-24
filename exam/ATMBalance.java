import java.util.Scanner;

public class ATMBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = new int[4];
        int[] noteCounts = new int[4];
        int totalBalance = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "st Denomination: ");
            denominations[i] = scanner.nextInt();
            System.out.print("Enter the " + (i + 1) + "st Denomination number of notes: ");
            noteCounts[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            totalBalance += denominations[i] * noteCounts[i];
        }
        System.out.println("Total Available Balance in ATM: " + totalBalance);
    }
}