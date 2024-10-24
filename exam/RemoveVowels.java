import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Remove vowels from the string
        String result = input.replaceAll("[aeiouAEIOU]", "");
        
        // Display the result
        System.out.println("The string without vowels is: " + result);
    }
}