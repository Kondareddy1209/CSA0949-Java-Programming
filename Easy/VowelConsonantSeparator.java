import java.util.Scanner;

public class VowelConsonantSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Given Word: ");
        String word = scanner.nextLine();
        
        separateVowelsAndConsonants(word);
        
        scanner.close();
    }

    public static void separateVowelsAndConsonants(String word) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        
        for (char ch : word.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels.append(ch).append(" ");
                } else {
                    consonants.append(ch).append(" ");
                }
            }
        }

        System.out.println("Consonants: " + consonants.toString().trim());
        System.out.println("Vowels: " + vowels.toString().trim());
    }

    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
