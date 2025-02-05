package homeWork_25_01_25.task8;

public class Main {
    public static void main(String[] args) {
        Product moloko = new Product("Молоко", "Молочная продукция", 7);
        Product hleb = new Product("Хлеб", "Хлебобулочные изделия", 4);
        Product kefir = new Product("Кефир", "Молочная продукция", 15);
        Product makaroni = new Product("Макароны", "Макаронные изделия", 9);
        Product banan = new Product("Банан", "Фрукты", 13);

        Store store = new Store();
        store.addProduct(makaroni);
        store.addProduct(moloko);
        store.addProduct(hleb);
        store.addProduct(banan);
        store.addProduct(kefir);

        store.printAllProducts();
        System.out.println();
        System.out.println();
        store.findProductsByCategory(store.products, "Молочная продукция");
        System.out.println();
        store.removeProduct(hleb);

    }
}
