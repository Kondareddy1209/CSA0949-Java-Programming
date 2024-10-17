public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // All books are available when created
    }

    // Getters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available; // Update availability status
    }

    // toString method for better output readability
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}
