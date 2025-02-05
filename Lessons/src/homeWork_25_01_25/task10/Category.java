package homeWork_25_01_25.task10;

public enum Category {
    DRINK("Напитки"),
    MAIN("Главное блюдо"),
    DESSERT("Десерт");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
