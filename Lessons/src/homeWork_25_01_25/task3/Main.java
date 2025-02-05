package homeWork_25_01_25.task3;

public class Main {
    public static void main(String[] args) {
        BankAccount rex = new BankAccount(10, "Rex", 1);
        BankAccount jerry = new BankAccount(15, "", 2);
        BankAccount alex = new BankAccount(20, "Alex", 0);
        BankAccount tom = new BankAccount(25,"Tom",4);

        BankAccount henry = new BankAccount();
        henry.setAccountNumber(5);
        henry.setOwnerName("Henry");

        BankAccount robert = new BankAccount();
        robert.setAccountNumber(6);
        robert.setOwnerName("Роберт");


        BankAccount bankAccount = new BankAccount();
        System.out.println("До пополнения/снятия");
        System.out.println();
        rex.printAccount();
        jerry.printAccount();
        alex.printAccount();
        tom.printAccount();
        henry.printAccount();
        robert.printAccount();

        bankAccount.printTotalAccount();

        rex.deposit(13);
        jerry.withdraw(1.5);
        System.out.println("После пополнения/снятия");
        System.out.println();

        rex.printAccount();
        jerry.printAccount();

        rex.withdraw(30);
        henry.withdraw(25);

        rex.printAccount();
        henry.printAccount();

        bankAccount.printTotalAccount();





    }
}
