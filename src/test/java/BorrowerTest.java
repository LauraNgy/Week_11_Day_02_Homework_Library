import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Borrower borrower;
    Library library;

    @Before
    public void before() {
        book = new Book("A game of thrones", "George R. R. Martin", "fantasy");
        borrower = new Borrower();
        library = new Library(4);
        library.addBook(book);
    }

    @Test
    public void borrowBook() {
        borrower.borrow(library, book);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower.numberOfBooksBorrowed());
    }

}
