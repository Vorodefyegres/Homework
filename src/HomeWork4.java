public class HomeWork4 {
    public static void main(String[] args) {
        // Task 1
        int result1 = 10 * 5;
        System.out.println(result1);

        // Task 2
        double result2 = 20 / 2.5;
        System.out.println(result2);

        // Task 3
        int Length = 15;
        int Width = 9;
        int Area = Length * Width;
        int Perimeter = 2 * (Length + Width);
        System.out.println("Площадь: " + Area);
        System.out.println("Периметр: " + Perimeter);

        // Task 4
        int x = 5;
        System.out.println("Префиксная форма: " + (++x));
        x = 5; // "Сбросим" значение переменной x
        System.out.println("Постфиксная форма: " + (x++));

        // Task 5
        int x1 = 10;
        x1 += 5;
        System.out.println(x1);

        // Task 6
        int num1 = 25;
        int num2 = 43;
        boolean Checking = num1 == num2;
        System.out.println(Checking);

        // Task 7
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

        // Task 8
        double Fahrenheit = 95;
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("Градусы Цельсия: " + Celsius);

        // Task 9
        int num = 451;
        num += 10;
        num /= 3;
        num %= 5;
        num += 5;
        num *= 5;
        System.out.println(num);

        // Task 10
        int a1 = 65;
        int b1 = 80;
        boolean Condition1 = a < 50;
        boolean Condition2 = a < b;
        System.out.println("Первое условие: " + Condition1);
        System.out.println("Второе условие: " + Condition2);
    }
}