package home_work_08_03_25;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 число:");
        int a = scanner.nextInt();
        System.out.println("Введите 2 число:");
        int b = scanner.nextInt();

        System.out.println("Выберите операцию: сложение, вычитание, умножение, деление (+, -, *, / или %) ");
        System.out.println("Побитовые операции:  (&, |, ^, <<, >>, >>>)");
        String operator = scanner.next();
        switch (operator){
        case "+" -> {
            System.out.println("Результат: " + (a + b));
        }
        case "%" -> {
            if (b==0){
                System.out.println("Ошибка. Операция остаток при деление на 0 невозможна");
                return;
            }
            System.out.println("Результат: " + (a % b));
        }
        case "-" -> {
            System.out.println("Результат: " + (a - b));
        }
        case "*" -> {
            System.out.println("Результат: " + (a * b));
        }
        case "/" -> {
            if (b==0){
                System.out.println("Ошибка. Деление на 0 невозможно ");
                return;
            }
            System.out.println("Результат: " + (a / b));
        }
        case "&" -> {
            System.out.println("Результат: " + (a & b));
        }
        case "|" -> {
            System.out.println("Результат: " + (a | b)); // как это вписать - \| ?
        }
        case "^" -> {
            System.out.println("Результат: " + (a ^ b));
        }
        case "<<" -> {
            System.out.println("Результат: " + (a << b));
        }
        case ">>" -> {
            System.out.println("Результат: " + (a >> b));
        }
        case ">>>" -> {
            System.out.println("Результат: " + (a >>> b));
        }
        default -> {
            System.out.println("Неверно указана команда");
        }

    }


}

}

