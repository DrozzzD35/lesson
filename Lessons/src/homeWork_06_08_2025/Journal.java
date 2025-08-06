package homeWork_06_08_2025;

public class Journal implements Library {
    private String name;
    private int year;

    public Journal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public void shortTime() {
        System.out.println("Журнал " + name + " " + year + " года выдаётся на 3 дня");


    }

    @Override
    public void averageTime() {
        System.out.println("Журнал " + name + " " + year + " года выдаётся на 8 дней");


    }

    @Override
    public void longTime() {
        System.out.println("Журнал " + name + " " + year + " года выдаётся на 11 дней");


    }
}
