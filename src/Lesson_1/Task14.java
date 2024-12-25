package Lesson_1;

import java.util.Scanner;

public class Task14 {
    public static void printArray(int len, int initialValue) {
        if (len < 0) {
            System.out.print("Длина массива должна быть положительной. Перезапустите программу");
        } else {
            int[] a = new int[len];
            for (int i = 0; i < len; i++) {
                a[i] = initialValue;
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива и чем хотите заполнить");
        int g = scanner.nextInt();
        int f = scanner.nextInt();
        printArray(g, f);
        scanner.close();
    }
}

