package Homework10;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));

        boolean areEqual = compareArrayLists(list1, list2);

        if (areEqual) {
            System.out.println("Списки идентичны.");
        } else {
            System.out.println("Списки различаются.");
        }
    }

    private static boolean compareArrayLists(ArrayList<?> list1, ArrayList<?> list2) {
        if (list1 == null || list2 == null) {
            return false;
        }

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;
    }
}