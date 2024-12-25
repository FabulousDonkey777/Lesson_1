package Lesson_1;

public class Task7 {

    public static boolean Negative(int a) {
        return a < 0;
    }


    public static void main(String[] args) {
        System.out.println("Число -40 отрицательное? " + Negative(-50));
        System.out.println("Число 242 отрицательное? " + Negative(242));
        System.out.println("Число 0 отрицательное? " + Negative(0));

    }
}
