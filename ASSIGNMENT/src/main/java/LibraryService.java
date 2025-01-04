public class LibraryService {
    private final Book book;
    private final Library library;

    public LibraryService(Book book, Library library) {
        this.book = book;
        this.library = library;
    }

    public String getBookTitle() {
        return book.getTitle();
    }

    public String getLibraryName() {
        return library.getName();
    }
}

