import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Given Number: ");
        String input = sc.next();

        Set<String> permutations = new HashSet<>();
        permute(input, 0, input.length() - 1, permutations);

        System.out.println("Permutations are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    private static void permute(String str, int l, int r, Set<String> permutations) {
        if (l == r) {
            permutations.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, permutations);
                str = swap(str, l, i); // backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
