package Lesson_1;

public class Task6 {

    public static void checking(int a) {
        if (a >= 0) {
            System.out.println(a + " - Положительное число");
        } else {
            System.out.println(a + " - Отрицательное число");
        }
    }


    public static void main(String[] args) {

        checking(0);
        checking(-4);
        checking(6);
        checking(42343);
        checking(-1232);
    }
}
