package homeWork_25_01_25.task4;

public enum Genre {
    ROMANCE("Роман"),
    FANTASY("Фантастика"),
    DRAMA("Драма"),
    COMEDY("Комедия");

    private int count = 0;
    private String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        // переменная++ (сначала в блоке кода будет использовано изначальное значение переменной, после выхода из строки переменная увеличиться на 1)
        // ++переменная (сначала в блоке кода будет использовано увеличенное значение переменной на 1)
        return ++count;
    }

}
