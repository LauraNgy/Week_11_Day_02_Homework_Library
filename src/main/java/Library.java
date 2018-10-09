import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
