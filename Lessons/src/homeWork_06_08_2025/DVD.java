package homeWork_06_08_2025;

public class DVD implements Library {
    private String name;
    private int year;

    public DVD(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public void shortTime() {
        System.out.println("Фильм " + name + " " + year + " года выдаётся на 2 дня");

    }

    @Override
    public void averageTime() {
        System.out.println("Фильм " + name + " " + year + " года выдаётся на 5 дня");


    }

    @Override
    public void longTime() {
        System.out.println("Фильм " + name + " " + year + " года выдаётся на 10 дня");


    }
}
