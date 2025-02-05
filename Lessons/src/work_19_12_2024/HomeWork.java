package work_19_12_2024;

public class HomeWork {
    public static void main() {
        Car toyota = new Car("Тойота", "Тойота Камри", 2010, 0);
        toyota.printInfo();
        toyota.drive(5000);
        toyota.drive(5000);
        toyota.drive(5000);
        toyota.drive(5000);
        toyota.drive(5000);
        toyota.drive(5000);
//
//        Car mercedes = new Car("Мерседес", "Бенз",2015,7546);
//        mercedes.printInfo();
//        mercedes.drive(3000);
//
//        Car bmw = new Car("БМВ", "3 серии", 2013, 3215);
//        bmw.printInfo();
//        bmw.drive(5468);


//        BankAccount petr = new BankAccount("Пётр", 10);
//        petr.deposit(20);
//        petr.withdraw(10);
//        petr.printBalance();

        BankAccount elena = new BankAccount("Елена", 30);
        elena.deposit(15);
        elena.withdraw(20);
        elena.printBalance();


        StudentHomeWork inga = new StudentHomeWork("Инга");
        inga.grades = new int[]{5, 5, 5};
        inga.averageGrade();

        StudentHomeWork vasya = new StudentHomeWork("вася", new int[]{5, 5, 5});
        vasya.averageGrade();
    }

}
