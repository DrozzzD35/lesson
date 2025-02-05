package homeWork_25_01_25.task10;

public class MenuItem {
    // Переменные
    private String name;
    private Category category;
    private double price;

    private static int itemsCount;

    //Конструктор
    public MenuItem(String name, double price, Category titleCategory) {
        this.name = name;
        this.price = price;
        itemsCount++;
        setCategory(titleCategory);

    }

    // геттеры и сеттеры

    public static int getItemsCount() {
        return itemsCount;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category titleCategory) {
        if (titleCategory == null) {
            category = Category.MAIN;
            return;
        }
        this.category = titleCategory;
    }

    // вспомогательные методы

    public boolean checkItem() {
        if (getName()==null) {
            System.out.println("Название заказа не может быть пустым");
            return false;
        } else if (getPrice() <= 0) {
            System.out.println("Цена не может быть меньше либо ровна нулю");
            return false;
        } else if (category == null) {
            System.out.println("Категория не может отсутствовать");
            return false;
        }
        return true;
    }

    public double getPrice() {
        return price;
    }
}
