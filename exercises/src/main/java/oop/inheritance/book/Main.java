package oop.inheritance.book;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Textbook mathBook = new Textbook("Algebra 101", "Smith", 300, "Math");
        Textbook physicsBook = new Textbook("Physics Basics", "Doe", 250, "Physics");
        Novel fantasyBook = new Novel("Dragon Tales", "Lee", 400, "Fantasy");
        Novel mysteryBook = new Novel("Hidden Secrets", "Adams", 350, "Mystery");

        library.addBook(mathBook);
        library.addBook(physicsBook);
        library.addBook(fantasyBook);
        library.addBook(mysteryBook);

        BookManager manager = new BookManager(library);

        // Check if a book exists
        System.out.println("Does mathBook exist? " + manager.bookExists(mathBook.getId())); // true

        // Find all textbooks about Math
        System.out.println("Textbooks about Math: " + manager.findTextbooksBySubject("Math"));

        // Find all novels in Fantasy genre
        System.out.println("Fantasy novels: " + manager.findNovelsByGenre("Fantasy"));

        // Count all books in library
        System.out.println("Total books in library: " + library.getAllBooks().size());

        // Iterate over all books safely
        System.out.println("All books in library:");
        for (Book b : library.getAllBooks()) {
            System.out.println(b);
        }

    }
}
