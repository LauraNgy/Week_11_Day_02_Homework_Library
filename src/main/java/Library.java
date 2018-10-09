import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Integer> booksByGenre;
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
       this.books = new ArrayList<>();
       this.booksByGenre = new HashMap<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if ( this.capacity > bookCount() ) {
            String genre = book.getGenre();
            if (booksByGenre.containsKey(genre)) {
                int bookCount = booksByGenre.get(genre);
                bookCount ++;
                booksByGenre.put(genre, bookCount);
            }
            else {
                booksByGenre.put(genre, 1);
            }
            this.books.add(book);
        }
    }


    public int checkCapacity() {
        return this.capacity;
    }

    public void lend(Book book) {
        this.books.remove(book);
    }

    public HashMap getBooksByGenre() {
        return this.booksByGenre;
    }
}
