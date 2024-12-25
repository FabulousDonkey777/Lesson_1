package Lesson_1;

public class Task12 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        System.out.println("Ёлементы двумерного массива:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


                array[j][j] = 0;
                array[i][array.length - 1 - i] = 0;


                System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }
}