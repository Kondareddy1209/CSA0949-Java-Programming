import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 67, 48, 23, 5, 62};
        
        System.out.print("Enter N: ");
        if(sc.hasNextInt()) {
            int N = sc.nextInt();
            if (N <= 0 || N > arr.length) {
                System.out.println("Invalid input for N.");
            } else {
                Arrays.sort(arr);
                System.out.println(N + "th largest number: " + arr[arr.length - N]);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        sc.close();
    }
}
