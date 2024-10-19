import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        word = word.toUpperCase();
        Character[] chars = new Character[word.length()];
        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.charAt(i);
        }
        Arrays.sort(chars, Collections.reverseOrder());
        
        System.out.print("Alphabetical Order: ");
        for (char c : chars) {
            System.out.print(c + " ");
        } 
        scanner.close();
    }
}
