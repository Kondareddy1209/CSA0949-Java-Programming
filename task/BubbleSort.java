import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] testCases = {
            {5, 2, 9, 1, 5, 6},
            {1, 2, 3, 4, 5},
            {3, 5, 2, 2, 8},
            {10},
            {}
        };
        for (int[] testCase : testCases) {
            System.out.print("Original array: " + Arrays.toString(testCase) + " -> ");
            bubbleSort(testCase);
            System.out.println("Sorted array: " + Arrays.toString(testCase));
        }
    }
}
