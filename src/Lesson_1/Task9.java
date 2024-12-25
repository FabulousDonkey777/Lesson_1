package Lesson_1;

public class Task9 {

    public static boolean Year(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }
    public static void main(String[] args) {
        int[] years = {220, 19120, 20300, 23, 1600, 800, 37487, 243000, 1996};
        for (int b : years) {
            System.out.println(b + " is a leap year: " + Year(b));
        }
    }
}
