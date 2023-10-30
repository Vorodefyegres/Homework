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
        int n1 = 3, m1 = 8;
        if (n1 >= 0 && n1 < numbers6.length && m1 >= 0 && m1 < numbers6.length) {
            int[] p = new int[m1 - n1 + 1];
            for (int i = n1; i <= m1; i++) {
                p[i - n1] = numbers6[i];
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
        int n2 = 1, m2 = 3;
        if (n2 >= 0 && n2 < numbers7.length && m2 >= 0 && m2 < numbers7.length) {
            int length = m2 - n2 + 1;
            int[] v = new int[length];
            for (int i = n2, j = 0; i <= m2; i++, j++) {
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
        int min1 = numbers8[0];
        int max1 = numbers8[0];

        for (int i = 1; i < numbers8.length; i++) {
            if (numbers8[i] < min1) {
                min1 = numbers8[i];
            }
            if (numbers8[i] > max1) {
                max1 = numbers8[i];
            }
        }

        System.out.println("Минимальный элемент = " + min1);
        System.out.println("Максимальный элемент = " + max1);

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
        int[] number8 = {1, 2, 3, 0, 4, 6};

        for (int i = 0; i < number8.length - 1; i++) {
            for (int j = i + 1; j < number8.length; j++) {
                int num1 = number8[i], num2 = number8[j];
                int order1 = num1, order2 = num2;

                while (order1 >= 10) {
                    order1 /= 10;
                }
                while (order2 >= 10) {
                    order2 /= 10;
                }
                if (order1 < order2) {
                    int t = number8[i];
                    number8[i] = number8[j];
                    number8[j] = t;
                }
            }
        }

        int result = 0;
        for (int number : number8) {
            result = result * 10 + number;
        }

        System.out.println(result);

        // Task 9.1
        int[][] number9 = {{10, 20, 30}, {40, 50, 60}};
        int b2 = number9.length, b3 = number9[0].length;
        int[][] number9New = new int[b3][b2];

        for (int i = 0; i < b2; i++) {
            for (int j = 0; j < b3; j++) {
                number9New[j][i] = number9[i][j];
            }
        }

        for (int i = 0; i < b3; i++) {
            for (int j = 0; j < b2; j++) {
                System.out.print(number9New[i][j] + " ");
            }
            System.out.println();
        }

        // Task 9.2
        int[][] numbers9 = {{4, 2, 1}, {2, 7, 2}
        };

        int a1 = numbers9.length, a2 = numbers9[0].length;
        int[][] numbers9New = new int[a2][a1];
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                numbers9New[j][i] = numbers9[i][j];
            }
        }

        for (int i = 0; i < a2; i++) {
            for (int j = 0; j < a1; j++) {
                System.out.print(numbers9New[i][j] + " ");
            }
            System.out.println();
        }

        // Task 10
        int[][] numbers10 = {{10, 20, 30}, {40, 50, 60}
        };
        int sum = 0;

        for (int i = 0; i < numbers10.length; i++) {
            for (int j = 0; j < numbers10[i].length; j++) {
                sum += numbers10[i][j];
            }
        }
        System.out.println("Сумма = " + sum);

        // Task 11.1
        int[][] numbers11 = {{10, 20, 30}, {40, 50, 60}
        };
        boolean isSquare = true;
        int c1 = numbers11.length;

        for (int i = 0; i < c1; i++) {
            if (numbers11[i].length != c1) {
                isSquare = false;
                break;
            }
        }

        System.out.println(isSquare);

        // Task 11.2
        int[][] numbers12 = {{10, 20}, {40, 50}
        };

        boolean isSquare1 = true;
        int c2 = numbers12.length;

        for (int i = 0; i < c2; i++) {
            if (numbers12[i].length != c2) {
                isSquare1 = false;
                break;
            }
        }

        System.out.println(isSquare1);

        // Task 12
        int n = 5;
        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j]);
                if (j < n - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        }

        // Task 13
        int[][] numbers13 = {{10, 20, 30}, {40, 50, 60}
        };

        int max = numbers13[0][0];
        int min = numbers13[0][0];

        for (int[] row : numbers13) {
            for (int value : row) {
                if  (value > max) {
                    max = value;
                }
                else if (value < min) {
                    min = value;
                }
            }
        }

        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);

        // Additional task 1

        // Additional task 2

        // Additional task 3

        // Additional task 4

        // Additional task 5

        // Additional task 6

        // Additional task 7

    }
}