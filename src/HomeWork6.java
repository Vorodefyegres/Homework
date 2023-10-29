public class HomeWork6 {
    public static void main(String[] args) {
        // Task 1
        int[] numbers1 = {1, 3, 4, 1, 5, 5};
        int total= 0;
        for (int number1 : numbers1) {
            total += number1;
        }

        double average1 = (double) total / numbers1.length;
        System.out.println(average1);

        // Task 2
        int[] numbers2 = {1, 3, 4, 1, 5, 5};
        System.out.print("Дубликаты = ");
        for (int i = 0; i < numbers2.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < numbers2.length; j++) {
                if (numbers2[i] == numbers2[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.print(numbers2[i] + ", ");
            }
        }

        System.out.println();
        // Task 3.1
        int[] numbers = {1, 3, -6, 23, 14, 2};
        int a = 23;
        boolean q = false;
        for (int number : numbers) {
            if (number == a) {
                q = true;
                break;
            }
        }

        System.out.println(q);

        // Task 3.2
        int[] numbers3 = {1, 3, -6, 23, 14, 2};
        int w = 4;
        boolean s = false;

        for (int number : numbers3) {
            if (number == w) {
                s = true;
                break;
            }
        }

        System.out.println(s);

        // Task 4.1
        int[] numbers4 = {1, 3, -6, 23, 14, 2};
        int x = 23;
        int index = -1;
        for (int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] == x) {
                index = i;
                break;
            }
        }

        System.out.println("Индекс = " + index);

        // Task 4.2
        int[] numbers5 = {1, 3, -6, 23, 14, 2};
        int r = 5;
        int f = -1;
        for (int i = 0; i < numbers5.length; i++) {
            if (numbers5[i] == r) {
                f = i;
                break;
            }
        }

        if (f != -1) {
            System.out.println("Индекс = " + f);
        } else {
            System.out.println("Не найдено");
        }
        // Task 5.1
        int[] numbers6 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3, m = 8;
        if (n >= 0 && n < numbers6.length && m >= 0 && m < numbers6.length) {
            int[] p = new int[m - n + 1];
            for (int i = n; i <= m; i++) {
                p[i - n] = numbers6[i];
            }
            System.out.print("[");
            for (int i = 0; i < p.length; i++) {
                System.out.print(p[i]);
                if (i < p.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        // Task 5.2
        int[] numbers7 = {1, 3, -6, 23, 14, 2};
        int n1 = 1, m1 = 3;
        if (n1 >= 0 && n1 < numbers7.length && m1 >= 0 && m1 < numbers7.length) {
            int length = m1 - n1 + 1;
            int[] v = new int[length];
            for (int i = n1, j = 0; i <= m1; i++, j++) {
                v[j] = numbers[i];
            }
            System.out.print("[");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i]);
                if (i < v.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        // Task 6
        int[] numbers8 = {1, 3, -6, 23, 14, 2};
        int min = numbers8[0];
        int max = numbers8[0];

        for (int i = 1; i < numbers8.length; i++) {
            if (numbers8[i] < min) {
                min = numbers8[i];
            }
            if (numbers8[i] > max) {
                max = numbers8[i];
            }
        }

        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);

        // Task 7
        int[] numbers0 = {1, 3, -6, 23, 14, 2};
        int small1 = numbers0[0];
        int small2 = numbers0[0];

        for (int h : numbers0) {
            if (h < small1 ) {
                small2 = small1 ;
                small1  = h;
            } else if (h < small2 && h != small1 ) {
                small2 = h;
            }
        }

        System.out.println("Наименьший элемент = " + small1 );
        System.out.println("Второй наименьший элемент = " + small2);

        // Task 8
        int[] numbers9 = {1, 2, 3, 0, 4, 6};

        for (int i = 0; i < numbers9.length - 1; i++) {
            for (int j = i + 1; j < numbers9.length; j++) {
                int num1 = numbers9[i];
                int num2 = numbers9[j];
                int order1 = num1;
                int order2 = num2;

                while (order1 >= 10) {
                    order1 /= 10;
                }

                while (order2 >= 10) {
                    order2 /= 10;
                }

                if (order1 < order2) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        int result = 0;
        for (int number : numbers) {
            result = result * 10 + number;
        }

        System.out.println(result);
        // Task 9

        // Task 10

        // Task 11

        // Task 12

        // Task 13

        // Additional task 1

        // Additional task 2

        // Additional task 3

        // Additional task 4

        // Additional task 5

        // Additional task 6

        // Additional task 7

    }
}