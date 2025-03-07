package work_06_03_25.godmethod.lesson;

import java.util.ArrayList;
import java.util.List;

public class GodMethod {

    public static void main(String[] args) {
        // Список банковских аккаунтов
        List<work_06_03_25.godmethod.lesson.solution.BankAccount> accounts = new ArrayList<>();

        // Создали несколько счетов
        accounts.add(new work_06_03_25.godmethod.lesson.solution.BankAccount(1001, "Alice", 5000.0));
        accounts.add(new work_06_03_25.godmethod.lesson.solution.BankAccount(1002, "Bob", 10000.0));

        // Начисление средств на баланс №1001
        work_06_03_25.godmethod.lesson.solution.BankAccount accountToDeposit = null;
        for (work_06_03_25.godmethod.lesson.solution.BankAccount acc : accounts) {
            if (acc.getAccountNumber() == 1001) {
                accountToDeposit = acc;
                break;
            }
        }
        if (accountToDeposit != null) {
            double newBalance = accountToDeposit.getBalance() + 2000.0;
            accountToDeposit.setBalance(newBalance);
        }

        // Снятие средств со счёта № 1002
        work_06_03_25.godmethod.lesson.solution.BankAccount accountToWithdraw = null;
        for (work_06_03_25.godmethod.lesson.solution.BankAccount acc : accounts) {
            if (acc.getAccountNumber() == 1002) {
                accountToWithdraw = acc;
                break;
            }
        }

        if (accountToWithdraw != null) {
            double currentBalance = accountToWithdraw.getBalance();
            double amountToWithdraw = 1500.0;
            if (currentBalance >= amountToWithdraw) {
                accountToWithdraw.setBalance(currentBalance - amountToWithdraw);
            }
        }

        // Перевод средств с акк №1001 на акк №1002
        work_06_03_25.godmethod.lesson.solution.BankAccount fromAcc = null;
        work_06_03_25.godmethod.lesson.solution.BankAccount toAcc = null;
        for (work_06_03_25.godmethod.lesson.solution.BankAccount acc : accounts) {
            if (acc.getAccountNumber() == 1001) {
                fromAcc = acc;
            } else if (acc.getAccountNumber() == 1002) {
                toAcc = acc;
            }
        }
        if (fromAcc != null && toAcc != null) {
            double transferAmount = 500.0;
            if (fromAcc.getBalance() >= transferAmount) {
                fromAcc.setBalance(fromAcc.getBalance() - transferAmount);
                toAcc.setBalance(toAcc.getBalance() + transferAmount);
            }
        }

        // Вывод информации о всех счетах
        for (work_06_03_25.godmethod.lesson.solution.BankAccount acc : accounts) {
            System.out.println("Account #" + acc.getAccountNumber()
                    + ", Holder: " + acc.getHolderName()
                    + ", Balance: " + acc.getBalance());
        }
    }
}

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}