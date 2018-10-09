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
        book4 = new Book("A feast for crows", "George R. R. Martin", "fantasy");
        book5 = new Book("A dance with dragons", "George R. R. Martin", "fantasy");
        library = new Library();
    }

    @Test
    public void bookCount() {
        assertEquals(0, library.bookCount());
    }

}
