package Lesson_1;

public class Task8 {


    public static void print(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String text = "ABC";
        int number = 10;
        print(text, number);
    }
}