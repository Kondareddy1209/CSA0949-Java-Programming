import java.util.ArrayList;

public class User {
    private String userId;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public ArrayList<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}
