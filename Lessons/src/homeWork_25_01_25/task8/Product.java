package homeWork_25_01_25.task8;

public class Product {
    private String name;
    private String category;
    private int price;
    private static int totalProductsCreated = 0;

    public Product(String name, String category, int price) {
        if (name.isEmpty()) {
            System.out.println("Имя не может отсутствовать");
            System.out.println();
            return;
        } else if (category.isEmpty()) {
            System.out.println("Категория не может отсутствовать");
            System.out.println();
            return;
        } else if (price <= 0) {
            System.out.println("Цена не может быть нулевой или отрицательной");
            System.out.println();
            return;
        }
        this.name = name;
        this.category = category;
        this.price = price;
        totalProductsCreated++;
    }

    public static int getTotalProductsCreated() {
        return totalProductsCreated;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

}
