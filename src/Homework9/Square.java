package Homework9;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideLength = scanner.nextDouble();

        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;
        double diagonalLength = Math.sqrt(2) * sideLength;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal length: " + diagonalLength);

        scanner.close();
    }
}