package work_06_03_25.godmethod.lesson.solution;


public class Main {

    public static void main(String[] args) {
        BankService bankService = new BankService();

        // Создали несколько счетов
        bankService.addAccount(new work_06_03_25.godmethod.lesson.solution.BankAccount(1001, "Alice", 5000.0));
        bankService.addAccount(new work_06_03_25.godmethod.lesson.solution.BankAccount(1002, "Bob", 10000.0));

        // Начисление средств на баланс №1001
        bankService.deposit(1001, 2000.0);

        // Снятие средств со счёта № 1002
        bankService.withDraw(1002, 1500.0);

        // Перевод средств с акк №1001 на акк №1002
        bankService.transfer(1001, 1002, 500.0);

        // Вывод информации о всех счетах
        bankService.printAllAccounts();

    }
}
