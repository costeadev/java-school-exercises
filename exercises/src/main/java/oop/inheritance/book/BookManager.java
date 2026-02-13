package oop.inheritance.book;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookManager {

    private final Library library;

    public BookManager(Library library) {
        this.library = library;
    }

    public boolean bookExists(UUID id) {
        return library.contains(id);
    }

    public List<Textbook> findTextbooksBySubject(String subject) {
        List<Textbook> result = new ArrayList<>();
        for (Book b : library.getAllBooks()) {
            if (b instanceof Textbook tb && tb.getSubject().equals(subject)) {
                result.add(tb);
            }
        }
        return result;
    }

    public List<Novel> findNovelsByGenre(String genre) {
        List<Novel> result = new ArrayList<>();
        for (Book b : library.getAllBooks()) {
            if (b instanceof Novel n && n.getGenre().equals(genre)) {
                result.add(n);
            }
        }
        return result;
    }
}