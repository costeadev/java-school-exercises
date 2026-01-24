package my_tests;

import java.util.ArrayList;

public class OrderList {
    public static void main(String[] args) {

        int[] unorderedList = {5, 3, 6, 4, 32, 33};

        ArrayList<Integer> orderedList = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();

        for (int listNum : unorderedList) {
            tempList.add(listNum);
        }

        while (!tempList.isEmpty()) {
            int tempMin = tempList.get(0); // Treat the first element as a temporary min

            // Find the real minimum by finding a smaller number each time
            for (int listNum : tempList) {
                if (listNum < tempMin) {
                    tempMin = listNum;
                }
            }

            orderedList.add(tempMin); // Add the minimum to our final array
            tempList.remove(Integer.valueOf(tempMin)); // Remove it from the tempArray
        }

        System.out.println(orderedList);
    }
}

