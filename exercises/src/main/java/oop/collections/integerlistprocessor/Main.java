package oop.collections.integerlistprocessor;

import utils.Keyboard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int num;
            try {
                num = Keyboard.readInt("Enter a number: ");
                numbers.add(num);
                System.out.println("Number added correctly!");
            } catch (NumberFormatException e) {
                System.out.println("\u001B[31m" + "That is not an integer" + "\u001B[0m\n");
                break;
            } catch (Exception e) { // Microsoft cosplay
                System.out.println("\u001B[31m" + "Something went wrong..." + "\u001B[0m\n");
                break;
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("The list is empty...");
        } else {
            List<Integer> descendingNumbers = new ArrayList<>(numbers);
            descendingNumbers.sort(new DescendingOrder());

            for (int i = 0; i <= 100; i+=10) {
                System.out.printf("\rLoading: %d%% %s", i ,"=".repeat(i));
                Thread.sleep(150);
            }

            System.out.printf("\rDesc Order List: %s\n", descendingNumbers);

            int numToRemove;
            do {
                try {
                     numToRemove = Keyboard.readInt("What number and its divisors should we remove?: ");
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("[ERROR] " + e.getMessage());
                }
            } while (true);

            boolean numberRemoved = false;

            Iterator<Integer> it = descendingNumbers.iterator();
            while (it.hasNext()) {
                if (it.next() % numToRemove == 0) {
                    it.remove();
                    numberRemoved = true;
                }
            }

            if (!numberRemoved) {
                System.out.println("The number was not found, so it wasn't removed\n");
            } else {
                System.out.println("Number and/or its divisors removed!\n");
            }

            System.out.printf("Final list: %s", descendingNumbers);
        }


    }
}
