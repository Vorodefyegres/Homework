package Homework10;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.add("Grapes");
        linkedList.add("Banana");

        String targetElement = "Banana";

        int firstIndex = getFirstIndexOfElement(linkedList, targetElement);
        int lastIndex = getLastIndexOfElement(linkedList, targetElement);
        
        System.out.println("Первое вхождение " + targetElement + " на позиции: " + firstIndex);
        System.out.println("Последнее вхождение " + targetElement + " на позиции: " + lastIndex);
    }

    private static int getFirstIndexOfElement(List<String> list, String targetElement) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(targetElement)) {
                return i;
            }
        }
        return -1;
    }

    private static int getLastIndexOfElement(List<String> list, String targetElement) {
        int lastIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(targetElement)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}