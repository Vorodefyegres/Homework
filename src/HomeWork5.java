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

        System.out.println("------");
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

        System.out.println("------");
        // Task 7
        int a = 3, m = 6;
        int result = 0;
        for (int i = a + 1; i < m; i++) {
            result += i;
        }
        System.out.println(result);

        System.out.println("------");
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

        System.out.println("------");
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
    }
}