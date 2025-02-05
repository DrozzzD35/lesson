package Practice.Lesson2;

public class Test {
    public static void main(String[] args) {
        String[][] names = {{" Мистер", " Миссис", " Мисс"}, {" Смит", " Джонс"}};
        // Мистер Смит
        System.out.println(names[0][0] + names[1][0]);
        // Мисс Джонс
        System.out.println(names[0][2] + names[1][1]);
        System.out.println(names.length);
    }
}
