package Homework8;

public class Average {
    public static void main(String[] args) {
        printAverage(22, 45, 95);
    }

    public static void printAverage(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Homework8.Average: " + average);
    }
}
