public class HomeWork5 {
    public static void main(String[] args) {
        // Task 1
        byte length = 7;
        byte width = 5;
        if (length == width) {
            System.out.println("Sqare");
        } else {
            System.out.println("Not Sqare");
        }
        // Task 2
        double sum = 10000;
        if (sum >= 5000) {
            sum *= 0.9;
        }
        System.out.println(sum);
        // Task 3
        int grade = 75;
        char letter;
        if (grade <= 25) {
            letter = 'F';
        } else if (grade > 25 && grade <= 45) {
            letter = 'E';
        } else if (grade > 45 && grade <= 50) {
            letter = 'D';
        } else if (grade > 50 && grade <= 60) {
            letter = 'C';
        } else if (grade > 60 && grade <= 80) {
            letter = 'B';
        } else if (grade > 80 && grade <= 100) {
            letter = 'A';
        } else {
            System.out.println("Incorrect value");
        }

        System.out.println("Ваша оценка: " + grade);
        // Task 4
        int n = 579;
        while (n > 0) {
            int r = n % 10;
            n /= 10;
            System.out.print(r);
        }
        System.out.println();
        // Task 5
        int num = 11;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
        // Task 6
        // i)
        for (int i = 0; i < 4; i++) {
            System.out.println("**********");
        }
        System.out.println();
        // ii)
        String s = "";
        for (int j = 0; j < 5; j++) {
            s += "*";
            System.out.println(s);
        }
        System.out.println();
        // iii)
        String q = "";
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                q = q + i;
            else
                q = i + q + i;
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println(q);
        }
        // Task 7
        int a = 3, m = 6;
        int result = 0;
        for (int i = a + 1; i < m; i++) {
            result += i;
        }
        System.out.println(result);
        // Task 8
        int salary = 300000;
        char grade1 = 'B';
        double bonus = 0;
        switch (grade1) {
            case 'A':
                bonus = 0.5;
                break;
            case 'B':
                bonus = 0.25;
                break;
            default:
                bonus = 0;
        }
        System.out.println(salary + salary * bonus);
        // Task 9
        int h = 10;
        int p1 = 0, p2 = 1;
        System.out.print(p1 + " ");
        if (n > 0)
            System.out.print(p2 + " ");
        for (int f = 2; f < h; f++) {
            int result1 = p1 + p2;
            System.out.print(result1 + " ");
            p1 = p2;
            p2 = result1;
        }
        // Additional task 1
        int l = 7;
        if (l % 2 == 0) {
            System.out.println(l + " even");
        } else {
            System.out.println(l + " odd");
        }
        // Additional task 2
        int r1 = 12;
        int r2 = 11;
        if (r1 > r2) {
            System.out.println(r1 + " > " + r2);
        } else if (r1 < r2) {
            System.out.println(r1 + " < " + r2);
        } else {
            System.out.println(r1 + " = " + r2);
        }
        // Additional task 3
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - leap year");
        } else {
            System.out.println(year + " - not leap year");
        }
        // Additional task 4
        int dayNumber = 4;
        String dayName = "";

        if (dayNumber == 1) dayName = "Monday";
        else if (dayNumber == 2) dayName = "Tuesday";
        else if (dayNumber == 3) dayName = "Wednesday";
        else if (dayNumber == 4) dayName = "Thursday";
        else if (dayNumber == 5) dayName = "Friday";
        else if (dayNumber == 6) dayName = "Saturday";
        else if (dayNumber == 7) dayName = "Sunday";

        if (!dayName.isEmpty()) {
            System.out.println(dayName);
        } else {
        }
        // Additional task 5
        double x = 3.5;
        double y = -2.8;

        if (x > 0 && y > 0) {
            System.out.println("Point is in the first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Point is in the second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Point is in the third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Point is in the fourth quadrant");
        } else if (x == 0 && y != 0) {
            System.out.println("Point lies on the Y axis");
        } else if (x != 0 && y == 0) {
            System.out.println("Point lies on the X axis");
        } else if (x == 0 && y == 0) {
            System.out.println("Point is the origin");
        }
        // Additional task 6
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
