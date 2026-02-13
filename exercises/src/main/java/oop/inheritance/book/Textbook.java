package oop.inheritance.book;

import java.util.UUID;

public class Textbook extends Book {

    private final String subject;

    public Textbook(String title, String author, int pages, String subject) {
        super(title, author, pages);
        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Subject required");
        }
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
       return super.toString() + " [Subject: " + subject + "]";
    }
}
