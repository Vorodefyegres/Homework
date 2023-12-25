package Homework10;

import java.util.LinkedList;
import java.util.List;

public class ReplaceElements {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        System.out.println("Список до замены:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        replaceTwoElements(linkedList, 1, "Mango", 3, "Strawberry");

        System.out.println("\nСписок после замены:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }

    private static void replaceTwoElements(List<String> list, int index1, String value1, int index2, String value2) {
        if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {
            list.set(index1, value1);
            list.set(index2, value2);
        } else {
            System.out.println("Замена невозможна");
        }
    }
}
