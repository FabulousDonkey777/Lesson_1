package Lesson_1;

public class Task7 {

    public static boolean Negative(int a) {
        return a < 0;
    }


    public static void main(String[] args) {
        System.out.println("����� -40 �������������? " + Negative(-50));
        System.out.println("����� 242 �������������? " + Negative(242));
        System.out.println("����� 0 �������������? " + Negative(0));

    }
}
