public class HomeWork4 {
    public static void main(String[] args) {
        // Задание 1. Напишите программу для умножения 10 на 5 и вывода результата в консоль
        int result1 = 10 * 5;
        System.out.println(result1);

        // Задание 2. Напишите программу для деления 20 на 2.5 и вывода результата в консоль.
        double result2 = 20 / 2.5;
        System.out.println(result2);

        // Задание 3. Напишите программу для вычисления площади и периметра прямоугольника.
        int Length = 15;
        int Width = 9;
        int Area = Length * Width;
        int Perimeter = 2 * (Length + Width);
        System.out.println("Площадь: " + Area);
        System.out.println("Периметр: " + Perimeter);

        // Задание 4. Увеличить значение x на 1 с помощью префиксной и постфиксной форм.
        int x = 5;
        System.out.println("Префиксная форма: " + (++x));
        x = 5; // "Сбросим" значение переменной x
        System.out.println("Постфиксная форма: " + (x++));

        // Задание 5. Исп. оператор присваивания сложения, чтобы добавить значение 5 к переменной x1.
        int x1 = 10;
        x1 += 5;
        System.out.println(x1);

        // Задание 6. Напишите программу для проверки равенства двух чисел 25 и 43.
        int num1 = 25;
        int num2 = 43;
        boolean Checking = num1 == num2;
        System.out.println(Checking);

        // Задание 7. Напишите программу для сложения, вычитания, умножения, деления, деления по модулю.
        int a = 16;
        int b = 8;
        int c = a + b;
        int difference = a - b;
        int Multiplication = a * b;
        int Fission = a / b;
        int Module = a % b;

        System.out.println("Сумма: " + c);
        System.out.println("Разность: " + difference);
        System.out.println("Умножение: " + Multiplication);
        System.out.println("Деление: " + Fission);
        System.out.println("Деление по модулю: " + Module);

        // Задание 8. Напишите программу для преобразования градусов Фаренгейта в градусы Цельсия.
        double Fahrenheit = 95;
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("Градусы Цельсия: " + Celsius);

        // Задание 9
        int num = 451;
        num += 10;
        num /= 3;
        num %= 5;
        num += 5;
        num *= 5;
        System.out.println(num);

        // Задание 10. Проверить, верны ли условия 'a1 < 50' и 'a1 < b1'.
        int a1 = 65;
        int b1 = 80;
        boolean Condition1 = a < 50;
        boolean Condition2 = a < b;
        System.out.println("Первое условие: " + Condition1);
        System.out.println("Второе условие: " + Condition2);
    }
}