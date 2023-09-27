import org.example.Library;
import org.example.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LibraryManagerTest {

    @Test
    public void testLibraryManagerOperations() {

        Library library = new Library();

        library.addBook(new Book("Book 1", "Author 1", "ISBN1", 2020));
        library.addBook(new Book("Book 2", "Author 2", "ISBN2", 2019));

        String searchTitle = "Book 1";
        Book foundBook = library.findBookByTitle(searchTitle);
        Assertions.assertNotNull(foundBook);
        Assertions.assertEquals(searchTitle, foundBook.getTitle());

        String isbnToDelete = "ISBN2";
        boolean isDeleted = library.removeBookByIsbn(isbnToDelete);
        Assertions.assertTrue(isDeleted);
        Assertions.assertNull(library.findBookByTitle("Book 2"));
    }
}
