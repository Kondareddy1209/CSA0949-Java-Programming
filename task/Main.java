import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
       
        // Example Books
        library.addBook(new Book("101", "Java Programming", "James Gosling"));
        library.addBook(new Book("102", "Python Programming", "Guido van Rossum"));

        // Example Users
        library.addUser(new User("201", "Alice"));
        library.addUser(new User("202", "Bob"));

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Display available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to borrow: ");
                    String borrowBookId = scanner.next();
                    System.out.print("Enter User ID: ");
                    String borrowUserId = scanner.next();
                    library.borrowBook(borrowBookId, borrowUserId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    String returnBookId = scanner.next();
                    System.out.print("Enter User ID: ");
                    String returnUserId = scanner.next();
                    library.returnBook(returnBookId, returnUserId);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
