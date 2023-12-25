package Homework10;

import java.util.HashMap;
import java.util.Map;

public class HashMapContainsValue {
    public static void main(String[] args) {
        Map<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Apple", 3);
        myHashMap.put("Banana", 2);
        myHashMap.put("Orange", 5);
        int targetValue = 2;

        if (containsValue(myHashMap, targetValue)) {
            System.out.println("HashMap contains value " + targetValue);
        } else {
            System.out.println("HashMap doesn't contain value\n " + targetValue);
        }
    }

    private static boolean containsValue(Map<String, Integer> map, int targetValue) {
        return map.containsValue(targetValue);
    }
}
