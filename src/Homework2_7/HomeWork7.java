package Homework2_7;

public class HomeWork7 {
    public static void main(String[] args) {

        // find Min
        int x = 25, y = 37, n = 29;
        int minNumber = findMin(x, y, n);

        System.out.println("Наименьшее значение: " + minNumber);

        // find Homework8.Average
        int x1 = 25, y2 = 45, m = 65;
        double average = findAverage(x1, y2, m);

        System.out.println("Среднее значение: " + average);

        // count Vowels
        String letters = "DarTech123";
        int vowels = countVowels(letters);
        System.out.println("Количество гласных в строке: " + vowels);

        // word Count
        String input = "Java is good to learn Object Oriented programming.";
        int wordCount = countWords(input);
        System.out.println("Количество слов в строке: " + wordCount);

        // count Two
        int num = 1254212;
        int count = countTwo(num);
        System.out.println("Количество цифр 2 в числе: " + count);

        // all Vowels
        String letter = "AIEEE";
        boolean result = allVowels(letter);
        System.out.println(result);

        // calculate Area
        int numberOfSides = 5;
        double sideLength = 6.0;
        double area = calculateArea(numberOfSides, sideLength);
        System.out.println("Площадь пятиугольника равна " + area);

        // sum
        int number = 252;
        int sum = calculateSumOfDigits(number);
        System.out.println("Сумма = " + sum);

        // findMax
        int[] numbers = {1, 2, 3};
        int maxNumber = findMax(numbers);
        System.out.println("Максимальное число: " + maxNumber);

        // formatTime
        int totalSeconds = 365;
        System.out.println("Форматированное время: " + formatTime(totalSeconds));

        // isPalindrome
        String radar = "radar";
        String helloWorld = "Hello, World!";

        System.out.println(radar + " is a palindrome: " + isPalindrome(radar));
        System.out.println(helloWorld + " is a palindrome: " + isPalindrome(helloWorld));

        // findGCD
        int num1 = 6;
        int num2 = 8;

        System.out.println("НОД " + num1 + " и " + num2 + ": " + findGCD(num1, num2));

        // printArray
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {1.1, 2.2, 3.3};
        Character[] charArray = {'a', 'b', 'c'};

        System.out.println("Int Array:");
        printArray(intArray);

        System.out.println("Double Array:");
        printArray(doubleArray);

        System.out.println("Char Array:");
        printArray(charArray);

        // getDaysInMonth
        int month = 2;
        int year = 2023;
        int daysInMonth = getDaysInMonth(month, year);
        System.out.println("Количество дней в " + month + " месяце " + year + " года: " + daysInMonth);

        // calculateDistance
        double a1 = 1.0, b1 = 2.0;
        double a2 = 4.0, b2 = 6.0;
        double distance = calculateDistance(a1, b1, a2, b2);
        System.out.println("Расстояние между точками: " + distance);

        // printNumbers
        int N = 5;
        System.out.println("Числа от 1 до " + N + " в порядке возрастания:");
        printNumbers(N);

        System.out.println();
        // printFibonacci
        int N1 = 6;
        System.out.println("N-ное число Фибоначчи " + N1 + ": " + fibonacci(N1));

        // nonNegative
        double base = 2.0;
        int exponent = 3;
        System.out.println(base + " в степени " + exponent + " равно " + power(base, exponent));

        // findMax
        int[] numbers1 = {3, 4, 5, 6};
        int result1 = findMax(numbers1, 0);
        System.out.println("Наибольший элемент в массиве: " + result1);

        // calculateSum
        int[] numbers2 = {2, 1, 4, 5, 9};
        int result2 = calculateSum(numbers2, 0);
        System.out.println("Сумма элементов массива: " + result2);
    }
    public static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
    public static double findAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouyAEIOUY";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
    public static int countWords(String words) {
        int count = 1;
        for (int i = 0; i < words.length(); i++) {
            char textChar = words.charAt(i);
            if (textChar == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countTwo(int num) {
        int count = 0;

        while (num > 0) {
            int number = num % 10;
            if (number == 2) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
    public static boolean allVowels(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                return false;
            }
        }
        return true;
    }
    public static double calculateArea(int numberOfSides, double sideLength) {
        double apothem = sideLength / (2 * Math.tan(Math.PI / numberOfSides));
        double area = (numberOfSides * sideLength * apothem) / 2;
        return area;
    }
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            max = Math.max(max, num);
        }
        return max;
    }
    public static String formatTime(int sec) {
        if (sec < 0) {
            throw new IllegalArgumentException("Не может быть отрицательным");
        }
        return String.format("%02d:%02d:%02d", sec / 3600, sec % 3600 / 60, sec % 60);
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\W", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
    public static void printArray(Object array) {
        if (array instanceof int[]) {
            for (int element : (int[]) array) {
                System.out.print(element + " ");
            }
        } else if (array instanceof double[]) {
            for (double element : (double[]) array) {
                System.out.print(element + " ");
            }
        } else if (array instanceof char[]) {
            for (char element : (char[]) array) {
                System.out.print(element + " ");
            }
        } else if (array instanceof Integer[]) {
            for (Integer element : (Integer[]) array) {
                System.out.print(element + " ");
            }
        } else if (array instanceof Double[]) {
            for (Double element : (Double[]) array) {
                System.out.print(element + " ");
            }
        } else if (array instanceof Character[]) {
            for (Character element : (Character[]) array) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1) {
            throw new IllegalArgumentException("Некорректные значения");
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Некорректный месяц");
        }
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
    public static int findMax(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        } else {
            int maxInRest = findMax(array, index + 1);
            return Math.max(array[index], maxInRest);
        }
    }
    public static int calculateSum(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        } else {
            return array[index] + calculateSum(array, index + 1);
        }
    }
}