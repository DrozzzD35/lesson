package work_23_12_2024;


import java.util.Scanner;

/*
 Вам нужно дописать код приложения, которое анализирует финансовые планы пользователя и помогает скорректировать их.
 Программа считывает из консоли значения зарплаты, планируемых трат на транспорт и еду, а также сумму возможных сбережений.
 Эти значения сохраняются в соответствующих переменных. Метод correctExpenses сравнивает планируемые траты с зарплатой,
 печатает размер излишка или недостатка средств и выдаёт рекомендации.
Объявите метод correctExpenses, который принимает значения переменных из главного метода в качестве аргументов.
Дополните строки печати корректными значениями и исправьте ошибку в теле метода, связанную с видимостью одной из переменных.
* */
public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую зарплату вы получите в этом месяце?");
        int salary = scanner.nextInt();
        System.out.println("Сколько планируете потратить на транспорт?");
        int transportMoney = scanner.nextInt();
        System.out.println("Сколько запланировано на супермаркеты?");
        int foodMoney = scanner.nextInt();
        System.out.println("Какую сумму хотите отложить?");
        int savings = scanner.nextInt();

        correctExpenses(transportMoney, foodMoney, savings, salary); // Вызовите метод correctExpenses с правильными аргументами

        // Напечатайте запланированные траты
        System.out.println("Вы планировали потратить: транспорт — " + transportMoney + ", "
                + "еда — " + foodMoney + ", "
                + "сбережения — " + savings + ".");
    }

    public static void correctExpenses(int transportMoney, int foodMoney, int savings, int salary) {

        // Объявите метод correctExpenses
        // Тело метода дано ниже

        int expensesSum = transportMoney + foodMoney + savings; // Считаем расходы
        int leftMoney = salary - expensesSum; // Считаем излишек средств
        if (expensesSum > salary) { // Проверяем, не превышают ли расходы зарплату
            int lackMoney = expensesSum - salary; // Считаем, сколько не хватает

            // Пока не начнёт хватать денег на транспорт — сокращаем траты на 100 рублей
            while ((salary - foodMoney) < transportMoney) {
                foodMoney = foodMoney - 100;
            }
            // Если не хватает денег на жизнь — не откладываем
            if (transportMoney + foodMoney + savings > salary) {
                savings = 0;
            }

            // Печатаем рекомендации
            System.out.println("Придётся пересмотреть планы, вам не хватает " + lackMoney);
            System.out.println("Рекомендуемые траты: "
                    + "еда — " + foodMoney+", "
                    + "сбережения — " + savings+".");
        } else {
            System.out.println("В этом месяце дебет с кредитом сошлись!");
            System.out.println("Свободных средств " + leftMoney);
        }
    }

}
