import java.util.List;

public class LibraryManagementSystem {
    private static LibraryManagementSystem instance;
    private Library library;

    private LibraryManagementSystem() {
        library = new Library();
    }

    public static LibraryManagementSystem getInstance() {
        if (instance == null) {
            instance = new LibraryManagementSystem();
        }
        return instance;
    }

    public void addBook(Book book) {
        library.addBook(book);
    }

    public void removeBook(String id) {
        library.removeBook(id);
    }

    public List<Book> searchBooks(SearchStrategy searchStrategy, String searchString) {
        return library.findBooks(searchStrategy, searchString);
    }

    public void checkOutBook(String id) {
        library.checkOutBook(id);
    }

    public void returnBook(String id) {
        library.returnBook(id);
    }
}
