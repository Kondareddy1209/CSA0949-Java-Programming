import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();
        if (totalDays < 0) {
            System.out.println("Invalid input: Please enter a non-negative number of days.");
        } else {
            int years = totalDays / 365;
            totalDays %= 365;
            int weeks = totalDays / 7;
            totalDays %= 7;
            int days = totalDays;

            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + days);
        }
        
        scanner.close();
    }
}
