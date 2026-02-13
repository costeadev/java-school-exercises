package oop.inheritance.book;

import java.util.Objects;
import java.util.UUID;

public class Book {
    private final UUID id;
    private final String title;
    private final String author;
    private final int pages;

    protected Book(String title, String author, int pages) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("Title required");
        if (author == null || author.isBlank()) throw new IllegalArgumentException("Author required");
        if (pages <= 0) throw new IllegalArgumentException("Pages must be positive");

        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return id.equals(book.id);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "%s by %s (%d pages)".formatted(title, author, pages);
    }
}
