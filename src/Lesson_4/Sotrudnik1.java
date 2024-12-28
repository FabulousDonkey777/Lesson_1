package Lesson_4;

public class Sotrudnik1 {
    private String fio;
    private String dolzhnost;
    private String email;
    private String telefon;
    private double zarplata;
    private int vozrast;

    public Sotrudnik1(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }


    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + dolzhnost);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + telefon);
        System.out.println("Зарплата: " + zarplata);
        System.out.println("Возраст: " + vozrast);
        System.out.println();
    }


    public static void main(String[] args) {

        Sotrudnik1[] sotrudnikiArray = new Sotrudnik1[5];
        sotrudnikiArray[0] = new Sotrudnik1("Иванов Иван Иванович", "Инженер", "ivanov@mailbox.com", "892312312", 30000, 30);
        sotrudnikiArray[1] = new Sotrudnik1("Петров Петр Петрович", "Менеджер", "petrov@mailbox.com", "892312313", 40000, 28);
        sotrudnikiArray[2] = new Sotrudnik1("Сидоров Сидор Сидорович", "Директор", "sidorov@mailbox.com", "892312314", 60000, 45);
        sotrudnikiArray[3] = new Sotrudnik1("Кузнецов Николай Николаевич", "Аналитик", "kuznetsov@mailbox.com", "892312315", 35000, 35);
        sotrudnikiArray[4] = new Sotrudnik1("Смирнова Анна Андреевна", "Разработчик", "smirnova@mailbox.com", "892312316", 50000, 27);
        for (Sotrudnik1 a : sotrudnikiArray) {
            a.printInfo();
        }
    }
}