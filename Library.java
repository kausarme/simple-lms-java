import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String id) {
        books.removeIf(book -> book.getId().equals(id));
    }

    public List<Book> findBooks(SearchStrategy searchStrategy, String searchString) {
        return searchStrategy.search(books, searchString);
    }

    public void checkOutBook(String id) {
        books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .ifPresent(Book::checkOut);
    }

    public void returnBook(String id) {
        books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .ifPresent(Book::returnBook);
    }
}
