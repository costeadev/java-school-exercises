package oop.collections.nightclubrecord;

import java.util.HashSet;
import java.util.Set;

public class Nightclub {

    private final String theme;
    private final Set<Record> records;

    public Nightclub(String theme) {
        this.theme = theme;
        records = new HashSet<>();
    }

    public String getTheme() {
        return theme;
    }

    public Set<Record> getRecords() {
        return records;
    }

    @Override
    public String toString() {
        return String.format("%s Nightclub: %d records", theme, records.size());
    }
}
