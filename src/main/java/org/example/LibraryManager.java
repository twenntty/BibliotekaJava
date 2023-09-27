package org.example;
public class LibraryManager {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Book 1", "Author 1", "ISBN1", 2020));
        library.addBook(new Book("Book 2", "Author 2", "ISBN2", 2019));

        System.out.println("All Books in Library:");
        library.displayBooks();

        String searchTitle = "Book 1";
        Book foundBook = library.findBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Found book: \n" + foundBook);
        } else {
            System.out.println("Book with title '" + searchTitle + "' not found.");
        }

        String isbnToDelete = "ISBN2";
        boolean isDeleted = library.removeBookByIsbn(isbnToDelete);
        if (isDeleted) {
            System.out.println("Book with ISBN '" + isbnToDelete + "' has been deleted.");
        } else {
            System.out.println("Book with ISBN '" + isbnToDelete + "' not found.");
        }

        System.out.println("All Books in Library after deletion:");
        library.displayBooks();
    }
}