package homeWork_25_01_25.task3;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;
    private static int totalAccount = 0;

    public BankAccount(double balance, String ownerName, int accountNumber) {

        setBalance(balance);

        if (ownerName.isEmpty()) {
            System.out.println("Имя аккаунта " + accountNumber + " не может быть пустым");
            System.out.println();
            return;
        } else {
            this.ownerName = ownerName;
        }

        if (accountNumber <= 0) {
            System.out.println("Номер аккаунта " + ownerName + " не может иметь нулевое отрицательное значение");
            System.out.println();
            return;
        } else {
            this.accountNumber = accountNumber;
        }

        totalAccount++;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (ownerName == null) {
            return amount;
        } else if (balance < amount) {
            System.out.println("На аккаунте " + ownerName + " недостаточно средств для снятия");
            return amount;
        }
        return balance -= amount;
    }

    public void printTotalAccount() {
        System.out.println("Количество аккаунтов в банке: " + totalAccount);
        System.out.println();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            System.out.println("Номер аккаунта " + ownerName + " не может иметь нулевое отрицательное значение");
            System.out.println();

        } else {
            this.accountNumber = accountNumber;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName.isEmpty()) {
            System.out.println("Имя аккаунта " + accountNumber + " не может быть пустым");
            System.out.println();

        } else {
            this.ownerName = ownerName;
        }
        totalAccount++;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("У владельца " + ownerName + " баланс не может быть отрицательным");
            System.out.println();
        } else {
            this.balance = balance;
        }
    }

    public static int getTotalAccount() {
        return totalAccount;
    }


    BankAccount() {
    }

    public void printAccount() {
        if (balance == 0) {
            return;
        }
        if (ownerName == null) {
            return;
        }
        if (accountNumber == 0) {
            return;
        }
        System.out.println("Имя владельца счёта: " + ownerName);
        System.out.println("Баланс счёта: " + balance);
        System.out.println("Номера аккаунта: " + accountNumber);
        System.out.println();

    }
}
