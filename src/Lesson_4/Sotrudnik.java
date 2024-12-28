package Lesson_4;

public class Sotrudnik {
    private String fio;
    private String dolzhnost;
    private String email;
    private String telefon;
    private double zarplata;
    private int vozrast;

    public Sotrudnik(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }


    public void printInfo() {
        System.out.println("���: " + fio);
        System.out.println("���������: " + dolzhnost);
        System.out.println("Email: " + email);
        System.out.println("�������: " + telefon);
        System.out.println("��������: " + zarplata);
        System.out.println("�������: " + vozrast);
    }


    public static void main(String[] args) {
        Sotrudnik sotrudnik = new Sotrudnik("������ ���� ��������", "�������", "ivanov@example.com", "+7 123 456 78 90", 50000, 30);
        sotrudnik.printInfo();
    }
}