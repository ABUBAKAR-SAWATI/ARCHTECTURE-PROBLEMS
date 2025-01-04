public class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void displayLibraryInfo(LibraryService libraryService) {
        System.out.println("Book: " + title + " is available in Library: " + libraryService.getLibraryName());
    }
}

