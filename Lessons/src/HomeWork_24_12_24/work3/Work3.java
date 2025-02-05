package HomeWork_24_12_24.work3;


/*
 * Переменная называется homka, но хомяка все еще зовут Байт. Измените имя хомяка на Хомку, а
 * заодно отредактируйте и другие атрибуты: пусть ему будет 1 год, он будет весить 420 грамм, а
 * его цвет будет не рыжий, а чёрный.*/
public class Work3 {
    public static void main(String[] args) {
        Hamster homka = new Hamster("Байт", 2, 300, "Рыжий");
        // Присвойте полям новые значения
        homka.name = "Хомка";
        homka.age = 1;
        homka.weight = 420;
        homka.color = "Чёрный";


        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " + homka.weight);
        System.out.println("Цвет: " + homka.color);
    }
}



