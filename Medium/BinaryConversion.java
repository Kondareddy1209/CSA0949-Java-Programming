import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        
        try {
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal Number: " + decimal);
            System.out.println("Octal Number: " + Integer.toOctalString(decimal));
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number format.");
        }
        sc.close();
    }
}
