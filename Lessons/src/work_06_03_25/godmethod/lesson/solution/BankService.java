package work_06_03_25.godmethod.lesson.solution;

import java.util.ArrayList;
import java.util.List;

public class BankService {

    private List<BankAccount> accounts;

    public BankService() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    private BankAccount findAccount(int accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        BankAccount bankAccount = findAccount(accountNumber);
        if (bankAccount != null) {
            bankAccount.deposit(amount);
        }
    }

    public void withDraw(int accountNumber, double amount) {
        BankAccount bankAccount = findAccount(accountNumber);
        if (bankAccount != null) {
            bankAccount.withDraw(amount);
        }
    }

    public void transfer(int fromAccNumber, int toAccNumber, double amount) {
        BankAccount fromAcc = findAccount(fromAccNumber);
        BankAccount toAcc = findAccount(toAccNumber);
        if (fromAcc != null && toAcc != null && fromAcc.getBalance() >= amount) {
            fromAcc.withDraw(amount);
            toAcc.deposit(amount);
        }
    }

    public void printAllAccounts(){
        for (BankAccount acc : accounts) {
            System.out.println("Account #" + acc.getAccountNumber()
                    + ", Holder: " + acc.getHolderName()
                    + ", Balance: " + acc.getBalance());
        }
    }

}
