import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public void borrow(Library library, Book book) {
        library.lend(book);
        this.books.add(book);
    }

    public int numberOfBooksBorrowed() {
        return this.books.size();
    }
}
