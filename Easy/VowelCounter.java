import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a statement:");
        String statement = scanner.nextLine();
        
        int vowelCount = countVowels(statement);
        
        System.out.println("Number of vowels = " + vowelCount);
        
        scanner.close();
    }

    public static int countVowels(String statement) {
        int count = 0;
        String vowels = "AEIOUaeiou"; // Both uppercase and lowercase vowels
        
        for (char ch : statement.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        
        return count;
    }
}
