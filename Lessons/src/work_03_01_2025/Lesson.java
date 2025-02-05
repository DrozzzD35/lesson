package work_03_01_2025;

public class Lesson {

    static int a = 100;

    public static void main(String[] args) {
        Student petr = new Student("Петр", 18);
        int a = 10;
        print(a);
        sayHello("Вася");
        sayHello("Аня");
        sayHello("Петя");
    }

    public static void print(int zhopa) {
        a += zhopa;
    }

    private static void sayHello(String name) {
        System.out.println("Привет " + name);
    }
}
