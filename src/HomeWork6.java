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
        // Task 3

        // Task 4

        // Task 5

        // Task 6

        // Task 7

        // Task 8

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