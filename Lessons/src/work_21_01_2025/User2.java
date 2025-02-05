package work_21_01_2025;

public class User2 {

    public static String faterName = "Отец Афанасий";

    private String name;
    private int age;

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String get(){
        return User2.faterName;
    }
}
