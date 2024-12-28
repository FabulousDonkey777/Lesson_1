package Lesson_4;

public class Park {
    private Attraction attraction1;
    private Attraction attraction2;
    private Attraction attraction3;
    private Attraction attraction4;

    public Park() {
        this.attraction1 = new Attraction("Каруселька", "18-19", 5);
        this.attraction2 = new Attraction("Колесо обозрения", "19-20", 10);
        this.attraction3 = new Attraction("Коняшки", "19-21", 15);
        this.attraction4 = new Attraction("Горка американская", "21-24", 500);
    }

    class Attraction {
        private String name;
        private String schedule;
        private int cost;

        public Attraction(String name, String schedule, int cost) {
            this.name = name;
            this.schedule = schedule;
            this.cost = cost;
        }


        public String getInfo() {
            return "Информация по аттракционам парка:" + " " + name + " " + schedule + " " + cost;
        }


    }


    public void printInfo() {
        System.out.println(attraction1.getInfo());
        System.out.println(attraction2.getInfo());
        System.out.println(attraction3.getInfo());
        System.out.println(attraction4.getInfo());
    }

    public static void main(String[] args) {
        Park park = new Park();
        park.printInfo();
    }
}