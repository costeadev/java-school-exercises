package oop.collections.nightclubrecord;

public class Record {

    private final String author;
    private final String title;

    public Record(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Record record)) return false;
        return this.author.equals(record.getAuthor()) && this.title.equals(record.getTitle());
    }

    @Override
    public int hashCode() {
        return 31 * author.hashCode() + title.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s - %s", author, title);
    }
}
