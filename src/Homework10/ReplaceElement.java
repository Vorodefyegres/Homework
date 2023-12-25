package Homework10;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        replaceSecondElement(myList, "Grapes");

        System.out.println("Список после замены второго элемента:");
        for (String element : myList) {
            System.out.println(element);
        }
    }
    private static void replaceSecondElement(ArrayList<String> list, String newElement) {
        if (list.size() >= 2) {
            list.set(1, newElement);
        } else {
            System.out.println("Замена невозможна");
        }
    }
}