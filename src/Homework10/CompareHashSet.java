package Homework10;

import java.util.HashSet;
import java.util.Set;

public class CompareHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
        set2.add("Banana");
        set2.add("Grapes");
        set2.add("Orange");

        Set<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);

        System.out.println("HashSet 1: " + set1);
        System.out.println("HashSet 2: " + set2);
        System.out.println("Общие элементы: " + commonElements);
    }
}