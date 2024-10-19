import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = sc.nextLine();
        
        int specialCharCount = 0;
        for (char ch : statement.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }
        
        System.out.println("Number of special characters: " + specialCharCount);
        sc.close();
    }
}
