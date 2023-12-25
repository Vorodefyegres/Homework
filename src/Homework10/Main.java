package Homework10;

public class Main {
    public static void main(String[] args) {
        for (Colors color : Colors.values()) {
            System.out.println(color);
        }

        for (Weekday day : Weekday.values()) {
            printDayType(day);
        }
    }

    private static void printDayType(Weekday day) {
        if (day.isWeekDay()) {
            System.out.println(day + " is a weekday.");
        } else {
            System.out.println(day + " is a holiday.");
        }
    }
}