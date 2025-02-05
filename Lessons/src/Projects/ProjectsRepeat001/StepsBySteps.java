package Projects.ProjectsRepeat001;

import java.util.Scanner;

public class StepsBySteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);


        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                stepTracker.addSteps();
            } else if (command == 2) {
                stepTracker.goalOfSteps();
            } else if (command == 3) {
                stepTracker.printStatistics();
            } else if (command == 4) {
                return;
            }
        }

    }

    static void printMenu() {
        System.out.println("1. Введите количество шагов");
        System.out.println("2. Введите/Измените цель");
        System.out.println("3. Показать статистику");
        System.out.println("4. Выход");
    }
}
