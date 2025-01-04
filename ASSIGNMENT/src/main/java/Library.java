public class Library {
    private final String name;

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayBookInfo(LibraryService libraryService) {
        System.out.println("Library: " + name + " has Book: " + libraryService.getBookTitle());
    }
}

