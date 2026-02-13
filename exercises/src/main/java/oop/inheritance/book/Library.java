package oop.inheritance.book;

import org.w3c.dom.Text;

import java.util.*;

public class Library {

    private final Map<UUID, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        if (book == null) throw new IllegalArgumentException("Book cannot be null");

        UUID id = book.getId();
        if (books.containsKey(id)) {
            throw new IllegalArgumentException("Book already exists in the library");
        }

        books.put(id, book);
    }

    public Optional<Book> getById(UUID id) {
        return Optional.ofNullable(books.get(id));
    }

    public boolean contains(UUID id) {
        return books.containsKey(id);
    }

    public Collection<Book> getAllBooks() {
        return Collections.unmodifiableCollection(books.values());
    }

    public int countTextbooks() {
        int count = 0;
        for (Book book : books.values()) {
            if (book instanceof Textbook) count++;
        }
        return count;
    }

    public int countNovels() {
        int count = 0;
        for (Book book : books.values()) {
            if (book instanceof Novel) count++;
        }
        return count;
    }
}