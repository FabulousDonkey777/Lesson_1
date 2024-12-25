package Lesson_1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадратного массива: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - 1 - i] = 1;
        }

        System.out.println("Массив с единицами на диагоналях:");
        printArray(array);
        scanner.close();
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}