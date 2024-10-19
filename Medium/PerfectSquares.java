import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = (int) Math.ceil(Math.sqrt(lower)); i <= Math.floor(Math.sqrt(upper)); i++) {
            int square = i * i;
            if (sumOfDigits(square) < 10) {
                result.add(square);
            }
        }

        System.out.println(result);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
