package com.mycompany.assignment;

public class ASSIGNMENT {
    // Book class
    static class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    // Library class
    static class Library {
        private String name;

        public Library(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // LibraryService class (Mediator)
    static class LibraryService {
        private Book book;
        private Library library;

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

    // Main method
    public static void main(String[] args) {
        // Create instances of Book and Library
        Book book = new Book("Java Programming");
        Library library = new Library("Central Library");

        // Create LibraryService as a mediator
        LibraryService libraryService = new LibraryService(book, library);

        // Display information using the mediator
        System.out.println("Book: " + libraryService.getBookTitle() + " is available in Library: " + libraryService.getLibraryName());
        System.out.println("Library: " + libraryService.getLibraryName() + " has Book: " + libraryService.getBookTitle());
    }
}


