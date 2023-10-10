public class HomeWork3 {
    public static void main(String[] args) {
        // Задание 1
        String flowersName = "Roses";
        // Задание 2
        int flowersNumber = 101;
        // Задание 3
        System.out.println(flowersName);
        System.out.println(flowersNumber);
        // Задание 4
        int a = 15;
        int b = 10;
        System.out.println(a + b);
        // Задание 5
        int c = (a + b);
        System.out.println(c);
        // Задание 6
        int x = 5, y = 10, z = 15;
        int sum1 = x + y + z;
        System.out.println(sum1);
        // Задание 7
        int p = 3, q = 3, r = 3, s = 3;
        int sum2 = p + q + r + s;
        System.out.println(sum2);

        //  Задание 1
        double myDouble;
        myDouble = 7;
        myDouble = 5;

        // Создаем константы
        final double PI = 3.14159265359;
        final double GRAVITY = 9.81;
        final String HOMETOWN = "Алматы ";

        // Создаем переменные разных типов данных
        byte myByte = 1;
        short myShort = 1000;
        int myInt = 1000000000;
        long myLong = 1000000000000000L;
        double myDouble2 = 1.5;
        float myFloat = 1.12f;
        boolean myBoolean = true;
        char myChar = 'A';
        String myString = "Интересная задача";

        // Выводим значения переменных в консоль
        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myDouble2: " + myDouble2);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);
        System.out.println("myString: " + myString);

        // Выводим значения констант
        System.out.println("PI: " + PI);
        System.out.println("GRAVITY: " + GRAVITY);
        System.out.println("HOMETOWN: " + HOMETOWN);

        // Расширяющее приведение byte к int
        byte byte1 = 8;
        int int1 = (int)byte1;
        System.out.println("Расширяющее приведение: " + int1);
        // Сужающее приведение double к int
        double m = 10.5;
        int n = (int) m;
        System.out.println("Сужающее приведение: " + n);
    }
}