package HomeWork_24_12_24.Work7;

/*
Добавьте конструктор в класс для конвертера валют, который вы написали в прошлом уроке.
Значения полей должны передаваться в качестве параметров со следующими названиями:
usd, eur, jpy.
Обратите внимание: для правильной проверки вашего кода порядок параметров
 должен совпадать с порядком объявления полей.
*
* */
public class Work7 {
    public static void main(String[] args) {
        Converter money = new Converter(12, 32, 45);
        System.out.println(money.rateEUR);
        System.out.println(money.rateUSD);
        System.out.println(money.rateJPY);


        Converter money2 = new Converter();
        System.out.println(money.rateEUR);
        System.out.println(money.rateUSD);
        System.out.println(money.rateJPY);

    }
}
