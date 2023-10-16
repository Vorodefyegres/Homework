public class HomeWork5 {
    public static void main(String[] args) {
        // Task 1
        double length = 7;
        double width = 5;
        if (length == width) {
            System.out.println("Прямоугольник является квадратом.");
        } else {
            System.out.println("Прямоугольник не является квадратом.");
        }
        // Task 2
        double price = 6000;
        double discountRate = 0.10;
        double finalPrice;
        if (price > 5000) {
            finalPrice = price - (price * discountRate);
        } else {
            finalPrice = price;
        }
        System.out.println("Итоговая стоимость покупки: " + finalPrice);
        // Task 3
        int point = 75;
        char grade;
        if (point < 25) {
            grade = 'F';
        } else if (point >= 25 && point < 45) {
            grade = 'E';
        } else if (point >= 45 && point < 50) {
            grade = 'D';
        } else if (point >= 50 && point < 60) {
            grade = 'C';
        } else if (point >= 60 && point <= 80) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("Ваша оценка: " + grade);
        // Task 4
        int number = 579;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            System.out.print(digit);
        }
        System.out.println();
        // Task 5
        int number1 = 11;
        boolean isPrime = isPrimeNumber(number1);
        if (isPrime) {
            System.out.println(number1 + " является простым числом.");
        } else {
            System.out.println(number1 + " не является простым числом.");
        }
    }

    static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        // Task 6

        // Task 7

        // Task 8

        // Task 9
    }
}