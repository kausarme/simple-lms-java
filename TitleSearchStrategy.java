import java.util.List;
import java.util.stream.Collectors;

public class TitleSearchStrategy implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String searchString) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(searchString))
                .collect(Collectors.toList());
    }
}
