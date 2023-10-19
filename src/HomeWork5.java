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

        System.out.println("------");
        // Task 2
        double sum = 10000;
        double discount = 0.1;
        if (sum > 5000) {
            sum = sum - (sum * discount);
        }
        System.out.println(sum);

        System.out.println("------");
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

        System.out.println("------");
        // Task 4
        int n = 579;
        while (n > 0) {
            int r = n % 10;
            n /= 10;
            System.out.print(r);
        }
        System.out.println();

        System.out.println("------");
        // Task 5
        int num = 11;
        boolean isPrime = true;
        for (int i = 2; i < num; i++ ) {
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

        System.out.println("------");
        // Task 6
        // i)
        for (int i = 0; i < 4; i++) {
            System.out.println("**********");
        }
        System.out.println();
        // ii)
        String s = "*";
        for (int j = 0; j < 4; j++) {
            s += "*";
            System.out.println(s);
        }
        System.out.println();
        // iii)

        // Task 7

        // Task 8

        // Task 9

    }
}