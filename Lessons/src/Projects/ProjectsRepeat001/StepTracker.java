package Projects.ProjectsRepeat001;

import java.util.Scanner;

public class StepTracker {
    MonthData[] monthData;
    Scanner scanner;
    int goalOfSteps;
    Converter converter;


    StepTracker(Scanner scanner) {
        this.monthData = new MonthData[12];
        this.scanner = scanner;
        this.goalOfSteps = 10000;
        this.converter = new Converter();

        for (int i = 0; i < monthData.length; i++) {
            monthData[i] = new MonthData();
        }
    }

    void addSteps() {
        Integer monthOfSteps = monthOfSteps();
        if (monthOfSteps == null) return;


        Integer dayOfSteps = dayOfSteps();
        if (dayOfSteps == null) return;


        Integer printUserSteps = printUserSteps();
        if (printUserSteps == null) return;

        monthData[monthOfSteps].days[dayOfSteps] = printUserSteps;
    }


    private Integer monthOfSteps() {
        System.out.println("Введите число месяца (1-12):");
        int monthOfSteps = scanner.nextInt();
        if (monthOfSteps < 1 || monthOfSteps > 12) {
            System.out.println("Не корректно указан месяц");
            return null;
        }
        return monthOfSteps - 1;
    }

    private Integer dayOfSteps() {
        System.out.println("Введите день месяца (1-30):");
        int dayOfSteps = scanner.nextInt();
        if (dayOfSteps < 1 || dayOfSteps > 30) {
            System.out.println("Не корректно указан день");
            return null;
        }
        return dayOfSteps -1;
    }

    private Integer printUserSteps() {
        System.out.println("Введите количество шагов:");
        int printUserSteps = scanner.nextInt();
        if (printUserSteps < 0) {
            System.out.println("Число не может быть отрицательным");
            return null;
        }
        return printUserSteps;
    }


    void goalOfSteps() {
        System.out.println("Введите какую цель вы хотите достичь");
        int newGoal = scanner.nextInt();
        if (newGoal > 0) {
            goalOfSteps = newGoal;
        } else if (newGoal < 0) {
            System.out.println("Цель не может иметь отрицательное значение");
        }
    }

    void printStatistics() {
        Integer month = monthOfSteps();
        if (month == null) return;

        MonthData monthDataStatic = monthData[month];


        int maxSteps = monthDataStatic.maxSteps();
        int sumSteps = monthDataStatic.sumSteps();
        int averageSteps = monthDataStatic.averageSteps();
        int bestSeriesOfSteps = monthDataStatic.bestSeriesOfSteps(goalOfSteps);
        int converterToKm = converter.converterToKm(sumSteps);
        int converterToCalories = converter.converterToCalories(sumSteps);

        System.out.println("Максимальное количество сделанных шагов в день: " + maxSteps);
        System.out.println("Сумма сделанных шагов за месяц: " + sumSteps);
        System.out.println("Среднее количество шагов за месяц: " + averageSteps);

        if (bestSeriesOfSteps == 1 || bestSeriesOfSteps == 21) {
            System.out.println("Цель достигнута в течении " + bestSeriesOfSteps + " дня");
        } else {
            System.out.println("Цель достигнута в течении " + bestSeriesOfSteps + " дней");
        }

        System.out.println("Пройдено километров: " + converterToKm);
        System.out.println("Потеряно калорий: " + converterToCalories);


    }


}



