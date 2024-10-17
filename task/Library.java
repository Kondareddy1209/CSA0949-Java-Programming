import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void borrowBook(String bookId, String userId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId) && book.isAvailable()) {
                for (User user : users) {
                    if (user.getUserId().equals(userId)) {
                        book.setAvailable(false);
                        user.borrowBook(book);
                        System.out.println("Book borrowed successfully.");
                        return;
                    }
                }
            }
        }
        System.out.println("Book or User not found or Book is not available.");
    }

    public void returnBook(String bookId, String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                for (Book book : user.getBorrowedBooks()) {
                    if (book.getBookId().equals(bookId)) {
                        book.setAvailable(true);
                        user.returnBook(book);
                        System.out.println("Book returned successfully.");
                        return;
                    }
                }
            }
        }
        System.out.println("Book or User not found.");
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}
