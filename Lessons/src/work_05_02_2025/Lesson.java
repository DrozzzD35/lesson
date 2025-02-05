package work_05_02_2025;

import java.util.Scanner;

public class Lesson {

    /**
     * switch(выражение){
     * case значение1:
     * действие1
     * break;
     * case значение2:
     * действие2
     * break;
     * case значение3:
     * действие3
     * break;
     * ....
     * default:
     * если никуда не попали, то выполняем эти действия
     * break;
     * }
     */
    public static void main(String[] args) {
        //byLesson();
        dayOfWeek();
    }

    private static void byLesson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер команды: ");
        int input = scanner.nextInt();

//        switch (input){
//            case 1:
//            case 2:
//                System.out.println("Выполняем логику при 2");
//                break;
//            case 3:
//                System.out.println("Выполняем логику при 3");
//                break;
//            default:
//                System.out.println("Непонятная команда");
//                break;
//        }

        switch (input) {
            case 1 -> System.out.println("Выполняем логику при 1");
            case 2 -> System.out.println("Выполняем логику при 2");
            case 3 -> System.out.println("Выполняем логику при 3");
            case 4 -> {
                System.out.println("Много действий");
                System.out.println("Выполняем логику при 3");
            }
            default -> System.out.println("Непонятная команда");
        }

        scanner.close();
    }


    /*
     Написать программу, которая спрашивает у пользователя день недели (число от 1 до 7)
      и выводит на экран, какой это день — будний или выходной.
     */

    public static void dayOfWeek() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите день недели (1-7): ");
        int numberDay = scanner.nextInt();

        switch (numberDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будний день");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Неверно указан день");
                break;
        }
    }
}
