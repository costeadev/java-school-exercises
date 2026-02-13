package oop.inheritance.book;

import java.util.UUID;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, int pages, String genre) {
        super(title, author, pages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + " (%s)".formatted(genre);
    }
}