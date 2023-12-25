package Homework11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите вещественное число: ");
            double number = scanner.nextDouble();

            if (number < 0) {
                System.out.println("Нельзя извлекать квадратный корень из отрицательного числа.");
            } else {
                double squareRoot = Math.sqrt(number);
                System.out.println("Квадратный корень числа " + number + " равен: " + squareRoot);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите корректное вещественное число.");
        } finally {
            scanner.close();
        }
    }
}