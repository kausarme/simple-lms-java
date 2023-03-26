import java.util.List;
import java.util.stream.Collectors;

public class AuthorSearchStrategy implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String searchString) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(searchString))
                .collect(Collectors.toList());
    }
}
