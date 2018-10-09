import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Library library;

    @Before
    public void before() {
        book1 = new Book("A game of thrones", "George R. R. Martin", "fantasy");
        book2 = new Book("A clash of kings", "George R. R. Martin", "fantasy");
        book3 = new Book("A storm of swords", "George R. R. Martin", "fantasy");
        book4 = new Book("A feast for crows", "George R. R. Martin", "fiction");
        book5 = new Book("A dance with dragons", "George R. R. Martin", "fiction");
        library = new Library(4);
    }

    @Test
    public void bookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBook() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkCapacity() {
        assertEquals(4, library.checkCapacity());
    }

    @Test
    public void overCapacityBookRefused() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void lend() {
        library.addBook(book1);
        library.addBook(book2);
        library.lend(book2);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void booksByGenre() {
       library.addBook(book1);
       library.addBook(book2);
       library.addBook(book5);
        assertEquals(2, library.getBooksByGenre().get(book1.getGenre()));
        assertEquals(2, library.getBooksByGenre().get(book2.getGenre()));
        assertEquals(1, library.getBooksByGenre().get(book5.getGenre()));
    }

}
