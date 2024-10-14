import java.util.Scanner;
public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int compositeCount = 0;
        for (int num : array) {
            if (isComposite(num)) {
                compositeCount++;
            }
        }
        System.out.println("Number of Composite Numbers = " + compositeCount);
    }
    public static boolean isComposite(int num) {
        if (num < 4) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
