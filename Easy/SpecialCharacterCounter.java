import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();
        
        printSpecialCharacters(line);
        
        scanner.close();
    }

    public static void printSpecialCharacters(String line) {
        StringBuilder specialCharacters = new StringBuilder();
        int count = 0;

        for (char ch : line.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacters.append(ch).append(' ');
                count++;
            }
        }

        System.out.println("Special Characters: " + specialCharacters.toString().trim());
        System.out.println("Number of Special Characters: " + count);
    }
}
