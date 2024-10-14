import java.util.Scanner;
public class CollegeUsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total users in the college: ");
        int totalUsers = input.nextInt();
        System.out.print("Enter number of staff users: ");
        int staffUsers = input.nextInt();
        int nonTeachingStaff = staffUsers / 3;
        int studentUsers = totalUsers - (staffUsers + nonTeachingStaff);
        System.out.println("Student Users: " + studentUsers);
        input.close();
    }
}
