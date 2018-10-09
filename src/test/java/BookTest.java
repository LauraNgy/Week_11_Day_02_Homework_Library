import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("A game of thrones", "George R. R. Martin", "fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("A game of thrones", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("George R. R. Martin", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("fantasy", book.getGenre());
    }
}
