package Homework10;

import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("Apple", 3);
        sourceMap.put("Banana", 2);
        sourceMap.put("Orange", 5);

        Map<String, Integer> destinationMap = copyHashMap(sourceMap);

        System.out.println("Original HashMap: " + sourceMap);
        System.out.println("Copy HashMap: " + destinationMap);
    }

    private static Map<String, Integer> copyHashMap(Map<String, Integer> sourceMap) {
        return new HashMap<>(sourceMap);
    }
}