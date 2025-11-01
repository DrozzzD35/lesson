package job4j;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfDay("Понедельник")); // Output: 1
        System.out.println(numberOfDay("Monday"));      // Output: 1
        System.out.println(numberOfDay("Вторник"));     // Output: 2
        System.out.println(numberOfDay("Tuesday"));     // Output: 2
        System.out.println(numberOfDay("Среда"));       // Output: 3
        System.out.println(numberOfDay("Wednesday"));   // Output: 3
        System.out.println(numberOfDay("Четверг"));     // Output: 4
        System.out.println(numberOfDay("Thursday"));    // Output: 4
        System.out.println(numberOfDay("Пятница"));     // Output: 5
        System.out.println(numberOfDay("Friday"));      // Output: 5
        System.out.println(numberOfDay("Суббота"));     // Output: 6
        System.out.println(numberOfDay("Saturday"));    // Output: 6
        System.out.println(numberOfDay("Воскресенье")); // Output: 7
        System.out.println(numberOfDay("Sunday"));      // Output: 7
        System.out.println(numberOfDay("Invalid"));     // Output: -1
    }


    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }


}
