package oop.collections.integersetprocessor;

import utils.Keyboard;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>(new AscendingOrder());

        while (true) {
            int num;
            try {
                num = Keyboard.readInt("Enter a number: ");
                if (!integerSet.add(num)) {
                    System.out.println("Number already exists in TreeSet");
                } else {
                    System.out.println("Number added correctly!");
                }
            } catch (NumberFormatException e) {
                System.out.println("\u001B[31m" + "That is not an integer" + "\u001B[0m\n");
                break;
            }
        }

        System.out.println(integerSet);


    }
}
