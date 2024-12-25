package Lesson_1;

public class Task114 {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
        System.out.println();
        System.out.println(InRange(5, 8));
        System.out.println(InRange(10, 3));
        System.out.println(InRange(15, 10));
        System.out.println(InRange(1, 19));
        System.out.println(InRange(20, 3));
        System.out.println();
        checking(0);
        checking(-4);
        checking(6);
        checking(42343);
        checking(-1232);
        System.out.println();
        System.out.println("Число -40 отрицательное? " + Negative(-50));
        System.out.println("Число 242 отрицательное? " + Negative(242));
        System.out.println("Число 0 отрицательное? " + Negative(0));
        System.out.println();
        String text = "ABC";
        int number = 10;
        print(text, number);
        System.out.println();
        int[] years = {220, 19120, 20300, 23, 1600, 800, 37487, 243000, 1996};
        for (int b : years) {
            System.out.println(b + " is a leap year: " + Year(b));
        }
        System.out.println();
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println();
        int[] array2 = new int[100];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }

        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }

        for (int num : array3) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        int n = 5;
        int[][] array4 = new int[n][n];

        for (int i = 0; i < n; i++) {
            array4[i][i] = 1;
            array4[i][n - 1 - i] = 1;
        }


        printArray(array4);
        System.out.println();
        System.out.println();
        int g =5;
        int f = 6;
        printArray(g, f);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 15;
        int b = -343;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 150;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5354;
        int b = 23553;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean InRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checking(int a) {
        if (a >= 0) {
            System.out.println(a + " - Положительное число");
        } else {
            System.out.println(a + " - Отрицательное число");
        }
    }

    public static boolean Negative(int a) {
        return a < 0;
    }

    public static void print(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean Year(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    public static void printArray(int[][] array4) {
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();

        }
    }
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
}



