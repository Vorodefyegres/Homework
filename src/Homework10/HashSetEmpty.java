package Homework10;

import java.util.HashSet;
import java.util.Set;

public class HashSetEmpty {
    public static void main(String[] args) {
        Set<String> myHashSet = new HashSet<>();

        if (isHashSetEmpty(myHashSet)) {
            System.out.println("HashSet пуст.");
        } else {
            System.out.println("HashSet не пуст.");
        }

        myHashSet.add("Apple");
        myHashSet.add("Banana");

        if (isHashSetEmpty(myHashSet)) {
            System.out.println("HashSet пуст.");
        } else {
            System.out.println("HashSet не пуст.");
        }
    }

    private static boolean isHashSetEmpty(Set<?> set) {
        return set == null || set.isEmpty();
    }
}
