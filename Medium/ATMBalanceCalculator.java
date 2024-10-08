import java.util.Scanner;

public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize denominations array
        int[] denominations = new int[4];
        int[] noteCounts = new int[4];
        
        // Get user input for denominations and their corresponding note counts
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "st Denomination: ");
            denominations[i] = scanner.nextInt();
            
            System.out.print("Enter the " + (i + 1) + "st Denomination number of notes: ");
            noteCounts[i] = scanner.nextInt();
        }
        
        // Calculate total available balance
        int totalBalance = calculateTotalBalance(denominations, noteCounts);
        
        // Display the result
        System.out.println("Total Available Balance in ATM: " + totalBalance);
        
        scanner.close();
    }

    public static int calculateTotalBalance(int[] denominations, int[] noteCounts) {
        int total = 0;
        for (int i = 0; i < denominations.length; i++) {
            total += denominations[i] * noteCounts[i];
        }
        return total;
    }
}
