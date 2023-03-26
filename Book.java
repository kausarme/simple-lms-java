public class Book {
    private final String id;
    private final String title;
    private final String author;
    private final String date;
    private boolean available;

    public Book(String id, String title, String author, String date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkOut() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", available=" + available +
                '}';
    }
}
