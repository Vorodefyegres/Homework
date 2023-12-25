package Homework10;
import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        System.out.println("Список цветов:");
        for (String color : colorList) {
            System.out.println(color);
        }
    }
}
