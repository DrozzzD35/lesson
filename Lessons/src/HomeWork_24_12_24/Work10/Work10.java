package HomeWork_24_12_24.Work10;

import HomeWork_24_12_24.Work9.DinnerAdvisor;

import java.util.Scanner;


/*

Завершите работу над кодом финансового приложения — соберите в отдельный класс код,
 касающийся трат пользователя. Назовите этот класс ExpensesManager
 (англ. «менеджер по расходам») и опишите его, действуя по пунктам:
Объявите одно поле — массив трат double[] expenses.
Объявите конструктор без параметров, а внутри него инициализируйте массив так же,
 как это происходит сейчас в классе Work10, — в нём должно храниться семь значений.
Перенесите в ExpensesManager код методов saveExpense,
 findMaxExpense и printAllExpenses.
 Удалите перед названием методов слова public и static.
В классе Work10 должно остаться взаимодействие с пользователем — печать меню,
 вопросов пользователю, а также считывание его ответов: команд, значений зарплаты,
  дней и трат.
Параметры метода saveExpense внутри класса ExpensesManager изменятся:
 теперь он должен принимать остаток на счёте moneyBeforeSalary,
 размер траты expense и номер дня недели day, за который нужно её учесть.
Уберите из методов findMaxExpense и printAllExpenses параметр double[] expenses.
 Теперь он стал полем класса, и его не нужно передавать.
Создайте объект класса ExpensesManager и вызовите его методы внутри класса Work10.

* */
public class Work10 {

    public static void main(String[] args) {
//         Должно стать полем нового класса

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5,88.7,0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager(); // Здесь создайте объект класса ExpensesManager

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                // Печать вопросов и считывание ответов оставьте в классе Work10
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, day , expense);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("Самая большая сумма расходов на этой неделе составила " + expensesManager.findMaxExpense() + " руб.");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    // Перенесите в ExpensesManager код методов saveExpense, findMaxExpense и printAllExpenses


    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("0 - Выход");
    }

}
