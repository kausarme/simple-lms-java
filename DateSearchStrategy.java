import java.util.List;
import java.util.stream.Collectors;

public class DateSearchStrategy implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String searchString) {
        return books.stream()
                .filter(book -> book.getDate().equalsIgnoreCase(searchString))
                .collect(Collectors.toList());
    }
}
