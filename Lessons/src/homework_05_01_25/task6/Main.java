package homework_05_01_25.task6;

public class Main {

    public static void main(String[] args) {
        double roubles = 5000; // сумма на счету
        double yearRate = 4; // годовая процентная ставка
        byte numOfMonth = 36; // количество месяцев, на который открыт вклад
        double monthRefill = 1000; // ежемесячное пополнение

        double monthRate = (roubles * yearRate) * 0.01; // вычислите месячную процентную ставку

        for (double i = 0; i <= numOfMonth; i++) { // дополните условие цикла
            double depositInterest = monthRate * 0.01; // вычислите доход от процентов
            roubles += depositInterest;// добавьте доход от процентов
            roubles += monthRefill; // учтите ежемесячное пополнение
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if (roubles >= 41000) { // определите, удалось ли достичь цели
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}
