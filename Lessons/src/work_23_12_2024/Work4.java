package work_23_12_2024;

import java.util.Scanner;

/*

Завершите декомпозицию финансового приложения — в методе main(String[] args) всё ещё сосредоточено слишком много задач.
 Вынесите обработку трат в отдельные методы: объявите, реализуйте и вызовите их.
Метод saveExpense должен сохранять значение расходов, введённое пользователем, и возвращать новое значение остатка средств.
        У него будет три параметра: Scanner scanner — для считывания ввода из консоли, double moneyBeforeSalary — для значения суммы на счёте,
        double[] expenses — для массива расходов.
Метод printAllExpenses должен печатать траты пользователя. Он ничего не возвращает и имеет один параметр — массив расходов.
Метод findMaxExpense должен находить максимальное значение в списке трат за неделю и возвращать её в качестве результата при вызове.
        Печать максимальной траты должна остаться в главном методе. У этого метода один параметр — массив расходов.

* */
public class Work4 {


    public static void main(String[] args) {
        double[] expenses = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                convert(scanner, moneyBeforeSalary);
            } else if (command == 2) {
                getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                moneyBeforeSalary = saveExpense(scanner, moneyBeforeSalary, expenses); // Перенесите код ниже в метод saveExpense
                // Вызовите метод с помощью такой строки:
                // moneyBeforeSalary = saveExpense(scanner, moneyBeforeSalary, expenses);

            } else if (command == 4) {
                printAllExpenses(expenses);// Перенесите обработку команды в метод printAllExpenses, здесь вызовите его

            } else if (command == 5) {
                double maxExpense = findMaxExpense(expenses);
                ;// Перенесите поиск максимальной траты в метод findMaxExpense

                // Печать должна остаться здесь — для получения максимальной траты нужно вызвать метод
                System.out.println("Самая большая сумма расходов на этой неделе составила " + maxExpense + " руб.");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static double saveExpense(Scanner scanner, double moneyBeforeSalary, double[] expenses) {
        System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
        int day = scanner.nextInt();
        System.out.println("Введите размер траты:");
        double expense = scanner.nextDouble();
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    public static void printAllExpenses(double[] expenses) {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }


    // Объявите и реализуйте здесь метод printAllExpenses

    public static double findMaxExpense(double[] expenses) {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }


    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("0 - Выход");
    }

    public static void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
            } else {
                System.out.println("Окей, пора в Макдак!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Отлично! Заказывайте крабов!");
            } else {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
            }
        }
    }

    public static void convert(Scanner scanner, double moneyBeforeSalary) {
        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;

        System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
        System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
        int currency = scanner.nextInt();
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }

}
