import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[][] array1 = {
            {1, 3, 5},
            {},
            {1, 2, 3}
        };

        int[][] array2 = {
            {2, 4, 6},
            {1, 2, 3},
            {}
        };

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Merged array: " + Arrays.toString(mergeArrays(array1[i], array2[i])));
        }
    }
}
