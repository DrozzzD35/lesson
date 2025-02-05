package work_19_12_2024;

public class BankAccount {
    String holderName;
    int balance;

    int deposit(int amount) {
        balance += amount;
        System.out.println("Пополнение на сумму: " + amount + " Всего на счету: " + balance);
        return balance;
    }

    int withdraw(int amount) {
        // Твой баланс 500р
        // Ты хочешь снять 5000р
        if (balance < amount) {
            System.out.println("Снятие невозможно");
            return balance;
        }
        balance -= amount;
        System.out.println("Снятие денежных средств в размере: " + amount + " Всего на счету: " + balance);

        return balance;
    }

    void printBalance() {
        System.out.println("У вас на счету: " + balance);
    }

    BankAccount(String newHolderName, int newBalance) {
        holderName = newHolderName;
        balance = newBalance;
    }

}
