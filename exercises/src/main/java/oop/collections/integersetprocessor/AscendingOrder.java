package oop.collections.integersetprocessor;

import java.util.Comparator;

public class AscendingOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}
