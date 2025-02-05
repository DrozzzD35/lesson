package homeWork_25_01_25.task8;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Остаток товаров после удаления: ");
        System.out.println();
        printAllProducts();
    }

    public void findProductsByCategory(List<Product> products, String category) {
        for (Product product : products) {
            if (product.getCategory() == null) {
                continue;
            } else if (product.getCategory().equals(category)) {
                System.out.println("Найден продукт: ");
                System.out.println("Название товара: " + product.getName());
                System.out.println("Категория товара: " + product.getCategory());
                System.out.println("Цена товара: " + product.getPrice());
                System.out.println();
            }
        }
    }

    public void printAllProducts() {
        for (Product product : products) {
            if (!(product.getName() == null && product.getCategory() == null && product.getPrice() == 0)) {
                System.out.println("Название товара: " + product.getName());
                System.out.println("Категория товара: " + product.getCategory());
                System.out.println("Цена товара: " + product.getPrice());
                System.out.println();
            }
        }
        System.out.println("Количество товаров: " + Product.getTotalProductsCreated());
    }
}
