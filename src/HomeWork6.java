public class HomeWork6 {
    public static void main(String[] args) {
        // Task 1
        int[] arr1 = {1, 3, 4, 1, 5, 5};
        int sum2= 0;
        for (int i : arr1) {
            sum2 += i;
        }

        double sum3 = (double) sum2 / arr1.length;
        System.out.println(sum3);

        // Task 2
        int[] arr2 = {1, 3, 4, 1, 5, 5};
        System.out.print("Дубликаты = ");

        for (int i = 0; i < arr2.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j])
                System.out.print(arr2[i] + ", ");
            }
        }

        System.out.println();
        // Task 3.1
        int[] arr = {1, 3, -6, 23, 14, 2};
        int a = 23;
        boolean q = false;

        for (int i : arr) {
            if (i == a) {
                q = true;
                break;
            }
        }
        System.out.println(q);

        // Task 3.2
        int[] arr3 = {1, 3, -6, 23, 14, 2};
        int w = 4;
        boolean s = false;

        for (int i : arr3) {
            if (i == w) {
                s = true;
                break;
            }
        }

        System.out.println(s);

        // Task 4.1
        int[] arr4 = {1, 3, -6, 23, 14, 2};
        int x = 23, y = -1;

        for (int i : arr4) {
            if (arr4[i] == x) {
                y = i;
                break;
            }
        }

        System.out.println("Индекс = " + y);

        // Task 4.2
        int[] array = {1, 3, -6, 23, 14, 2};
        int r = 5, f = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == r) {
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
        int[] arr5 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n1 = 3, m1 = 8;
        if (n1 >= 0 && n1 < arr5.length && m1 >= 0 && m1 < arr5.length) {
            int[] p = new int[m1 - n1 + 1];
            for (int i = n1; i <= m1; i++) {
                p[i - n1] = arr5[i];
            }
            for (int i = 0; i < p.length; i++) {
                System.out.print(p[i]);
                if (i < p.length - 1) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
        // Task 5.2
        int[] array1 = {1, 3, -6, 23, 14, 2};
        int n2 = 1, m2 = 3;
        if (n2 >= 0 && n2 < array1.length && m2 >= 0 && m2 < array1.length) {
            int length = m2 - n2 + 1;
            int[] v = new int[length];
            for (int i = n2, j = 0; i <= m2; i++, j++) {
                v[j] = array1[i];
            }
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i]);
                if (i < v.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        // Task 6
        int[] arr6 = {1, 3, -6, 23, 14, 2};
        int min1 = arr6[0], max1 = arr6[0];

        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] < min1) {
                min1 = arr6[i];
            }
            if (arr6[i] > max1) {
                max1 = arr6[i];
            }
        }

        System.out.println("Минимальный элемент = " + min1);
        System.out.println("Максимальный элемент = " + max1);

        // Task 7
        int[] arr7 = {1, 3, -6, 23, 14, 2};
        int small1 = arr7[0], small2 = arr7[0];

        for (int i : arr7) {
            if (i < small1 ) {
                small2 = small1 ;
                small1  = i;
            } else if (i < small2 && i != small1 ) {
                small2 = i;
            }
        }

        System.out.println("Наименьший элемент = " + small1 );
        System.out.println("Второй наименьший элемент = " + small2);

        // Task 8
        int[] arr8 = {1, 2, 3, 0, 4, 6};

        for (int i = 0; i < arr8.length - 1; i++) {
            for (int j = i + 1; j < arr8.length; j++) {
                int num1 = arr8[i], num2 = arr8[j];
                int order1 = num1, order2 = num2;

                while (order1 >= 10) {
                    order1 /= 10;
                }
                while (order2 >= 10) {
                    order2 /= 10;
                }
                if (order1 < order2) {
                    int t = arr8[i];
                    arr8[i] = arr8[j];
                    arr8[j] = t;
                }
            }
        }

        int result = 0;
        for (int number : arr8) {
            result = result * 10 + number;
        }

        System.out.println(result);

        // Task 9.1
        int[][] arr9 = {{10, 20, 30}, {40, 50, 60}};
        int[][] arrNew = new int[arr9[0].length][arr9.length];

        for (int i = 0; i < arr9.length; i++) {
            for (int j = 0; j < arr9[0].length; j++) {
                arrNew[j][i] = arr9[i][j];
            }
        }

        for (int i = 0; i < arr9[0].length; i++) {
            for (int j = 0; j < arr9.length; j++) {
                System.out.print(arrNew[i][j] + " ");
            }
            System.out.println();
        }

        // Task 9.2
        int[][] array2 = {{4, 2, 1}, {2, 7, 2}};
        int a1 = array2.length, a2 = array2[0].length;
        int[][] arrayNew = new int[a2][a1];
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                arrayNew[j][i] = array2[i][j];
            }
        }

        for (int i = 0; i < a2; i++) {
            for (int j = 0; j < a1; j++) {
                System.out.print(arrayNew[i][j] + " ");
            }
            System.out.println();
        }

        // Task 10
        int[][] arr10 = {{10, 20, 30}, {40, 50, 60}};
        int sum = 0;

        for (int i = 0; i < arr10.length; i++) {
            for (int j = 0; j < arr10[i].length; j++) {
                sum += arr10[i][j];
            }
        }
        System.out.println("Сумма = " + sum);

        // Task 11.1
        int[][] arr11 = {{10, 20, 30}, {40, 50, 60}};
        boolean isSquare = true;
        int c1 = arr11.length;

        for (int i = 0; i < c1; i++) {
            if (arr11[i].length != c1) {
                isSquare = false;
                break;
            }
        }

        System.out.println(isSquare);

        // Task 11.2
        int[][] array3 = {{10, 20}, {40, 50}};
        boolean isSquare1 = true;
        int c2 = array3.length;

        for (int i = 0; i < c2; i++) {
            if (array3[i].length != c2) {
                isSquare1 = false;
                break;
            }
        }

        System.out.println(isSquare1);

        // Task 12
        int n = 5;
        int[][] arr12 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr12[i][j] = (i + 1) * (j + 1);
                System.out.print(arr12[i][j]);
                if (j < n - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

        // Task 13
        int[][] arr13 = {{10, 20, 30}, {40, 50, 60}};
        int max = arr13[0][0], min = max;

        for (int[] row : arr13) {
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
        int[][] arr14 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int t  = 20, x1 = -1, y1 = x1;
        boolean k = false;

        for (int i = 0; i < arr14.length; i++) {
            for (int j = 0; j < arr14[i].length; j++) {
                if (arr14[i][j] == t) {
                    x1 = i;
                    y1 = j;
                    k = true;
                    break;
                }
            }
            if (k) {
                break;
            }
        }

        if (k) {
            System.out.println("Элемент " + t + " найден в строке " + x1 + " и столбце " + y1 + ".");
        } else {
            System.out.println("Элемент " + t + " не найден в массиве.");
        }

        // Additional task 2
        int[][] arr15 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int i = 0; i < arr15.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < arr15[i].length; j++) {
                sum1 += arr15[i][j];
            }
            double medium = (double) sum1 / arr15[i].length;
            System.out.println("Среднее значение в строке " + i + " = " + medium);
        }

        // Additional task 3
        int[][] arr16 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int num2 = arr16.length, num3 = arr16[0].length;
        int[][] matrix = new int[num3][num2];

        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num3; j++) {
                matrix[j][i] = arr16[i][j];
            }
        }

        for (int i = 0; i < num3; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Additional task 4
        int[][] arr17 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int max2 = arr17[0][0], min2 = arr17[0][0];

        for (int i = 0; i < arr17.length; i++) {
            for (int j = 0; j < arr17[i].length; j++) {
                if (arr17[i][j] > max2) {
                    max2 = arr17[i][j];
                }
                if (arr17[i][j] < min2) {
                    min2 = arr17[i][j];
                }
            }
        }

        System.out.println("Max  = " + max2);
        System.out.println("Min = " + min2);

        // Additional task 5
        int[][] arr18 = {{45, 23, 10}, {56, 72, 15}, {32, 89, 47}};

        for (int i = 0; i < arr18.length; i++) {
            for (int j = 0; j < arr18[i].length - 1; j++) {
                for (int k1 = 0; k1 < arr18[i].length - 1 - j; k1++) {
                    if (arr18[i][k1] > arr18[i][k1 + 1]) {
                        int temp = arr18[i][k1];
                        arr18[i][k1] = arr18[i][k1 + 1];
                        arr18[i][k1 + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < arr18.length; i++) {
            for (int j = 0; j < arr18[i].length; j++) {
                System.out.print(arr18[i][j] + " ");
            }
            System.out.println();
        }
        // Additional task 6
        int[][] arr19 = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        boolean symmetric = true;

        for (int i = 0; i < arr19.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr19[i][j] != arr19[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) {
                break;
            }
        }

        if (symmetric) {
            System.out.println("Матрица симметрична");
        } else {
            System.out.println("Матрица не симметрична");
        }
        // Additional task 7
        int[][] originalMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int num4 = originalMatrix.length;
        int num5 = originalMatrix[0].length;
        int[][] rotatedMatrix = new int[num5][num4];

        for (int i = 0; i < num4; i++) {
            for (int j = 0; j < num5; j++) {
                rotatedMatrix[j][num4 - i - 1] = originalMatrix[i][j];
            }
        }

        for (int i = 0; i < num5; i++) {
            for (int j = 0; j < num4; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}