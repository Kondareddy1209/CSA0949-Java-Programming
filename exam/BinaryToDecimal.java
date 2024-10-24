import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        String binaryNumber = scanner.nextLine();
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
