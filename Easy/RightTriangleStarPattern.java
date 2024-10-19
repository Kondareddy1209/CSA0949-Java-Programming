import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        // Loop to print the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            // Move to the next line after printing each row
            System.out.println();
        }
        
        sc.close();
    }
}
