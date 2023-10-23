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
        int x = 10;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);

        // Task 5
        int x1 = 10;
        x1 += 5;
        System.out.println(x1);

        // Task 6
        int num1 = 25;
        int num2 = 43;
        boolean isEqual = num1 == num2;
        System.out.println(isEqual);

        // Task 7
        int a = 16;
        int b = 8;
        int c = a + b;
        int d = a - b;
        int m = a * b;
        int f = a / b;
        int module = a % b;

        System.out.println("Сумма: " + c);
        System.out.println("Разность: " + d);
        System.out.println("Умножение: " + m);
        System.out.println("Деление: " + f);
        System.out.println("Деление по модулю: " + module);

        // Task 8
        double Fahrenheit = 95;
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("Градусы Цельсия: " + Celsius);

        // Task 9
        int num = 451;
        int result3 = (Math.abs((451 + 10) / 3) + 5) * 5;
        System.out.println(result3);

        // Task 10
        int a1 = 65;
        int b1 = 80;
        boolean c1 = a < 50;
        boolean c2 = a < b;
        System.out.println(c1 && c2);
    }
}