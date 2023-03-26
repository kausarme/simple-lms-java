import java.util.List;

public class LibraryManagementSystemApp {
    public static void main(String[] args) {
        LibraryManagementSystem lms = LibraryManagementSystem.getInstance();

        // Adding books to the library
        lms.addBook(new Book("1", "Java for Beginners", "John Doe", "1990"));
        lms.addBook(new Book("2", "Advanced Java Programming", "Jane Smith", "1990"));
        lms.addBook(new Book("3", "Java Design Patterns", "John Doe", "2001"));
        lms.addBook(new Book("4", "Java Wars Trinity", "Jane Smith", "2010"));
        lms.addBook(new Book("5", "Java Pattern Founder", "Bob Hannes", "2010"));


        // Searching books by title
        SearchStrategy titleSearch = new TitleSearchStrategy();
        List<Book> booksByTitle = lms.searchBooks(titleSearch, "Java Design Patterns");
        System.out.println("Books found by title search:");
        for (Book book : booksByTitle) {
            System.out.println(book);
        }
        System.out.println();

        // Searching books by author
        SearchStrategy authorSearch = new AuthorSearchStrategy();
        List<Book> booksByAuthor = lms.searchBooks(authorSearch, "John Doe");
        System.out.println("Books found by author search:");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }
        System.out.println();

        // Searching books by author
        SearchStrategy dateSearch = new DateSearchStrategy();
        List<Book> booksByDate = lms.searchBooks(dateSearch, "1990");
        System.out.println("Books found by date search:");
        for (Book book : booksByDate) {
            System.out.println(book);
        }
        System.out.println();


        // Checking out and returning a book
        lms.checkOutBook("1");
        System.out.println("Book with ID 1 checked out.");
        System.out.println("Book 1 availability: " + lms.searchBooks(titleSearch, "Java for Beginners").get(0).isAvailable());
        lms.returnBook("1");
        System.out.println("Book with ID 1 returned.");
        System.out.println("Book 1 availability: " + lms.searchBooks(titleSearch, "Java for Beginners").get(0).isAvailable());
    }
}
