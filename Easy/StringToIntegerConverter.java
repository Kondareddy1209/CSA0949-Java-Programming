import java.util.Scanner;

public class StringToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("String: ");
        String inputString = scanner.nextLine();
        
        try {
            // Convert the string to an integer
            int outputInteger = Integer.parseInt(inputString);
            
            // Print the output
            System.out.println("Output Integer: " + outputInteger);
        } catch (NumberFormatException e) {
            // Handle the case where the string is not a valid integer
            System.out.println("Invalid input: Please enter a valid integer string.");
        }
        
        scanner.close();
    }
}
