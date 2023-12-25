package Homework11;

public class ProfessorSmithAssistant {

    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println("Результат деления: " + result);

            result = divide(5, 0);
            System.out.println("Строка не будет выполнена, произошло исключение");

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо");
        }
        return x / y;
    }
}