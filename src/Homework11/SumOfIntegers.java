package Homework11;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку с целыми числами: ");
        String input = scanner.nextLine();

        try {
            int sum = calculateSumOfIntegers(input);
            System.out.println("Сумма целых чисел в строке равна " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int calculateSumOfIntegers(String input) {
        Scanner scanner = new Scanner(input);
        int sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                scanner.next();
            }
        }

        return sum;
    }
}