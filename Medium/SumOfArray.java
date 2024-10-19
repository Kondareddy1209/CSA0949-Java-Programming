import java.util.Scanner;

class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        try {
            int sum = 0;
            for (int i = 0; i <= size; i++) { // This loop will cause exception at i = size
                sum += numbers[i];
            }
            System.out.println("Sum: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access index out of bounds!");
        }
    }
}
