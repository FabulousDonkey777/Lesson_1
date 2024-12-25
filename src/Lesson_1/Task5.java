package Lesson_1;

public class Task5 {

    public static void main(String[] args) {

        System.out.println(InRange(5, 8));
        System.out.println(InRange(10, 3));
        System.out.println(InRange(15, 10));
        System.out.println(InRange(1, 19));
        System.out.println(InRange(20, 3));
    }

    public static boolean InRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
