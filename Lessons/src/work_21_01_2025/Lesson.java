package work_21_01_2025;

public class Lesson {
    String name;

    protected static Integer age = 15;

    /**
     * 1) public - видно во всем проекте
     * 2) private - доступ ограничен, можно получить через геттеры и сеттеры
     * 3) protected - видно в пакете и в наследниках
     * 4) default - присваивается по умолчанию, видно в пакете
     */
    public static void main(String[] args) {
        User1 user1 = new User1();
        user1.setAge(10);
        user1.setName("Валя");
        Test.anyLogic(user1);
        Test.anyLogic(user1);

        User2 user2 = new User2("Костя", 30);
        User2 user3 = new User2("Аня", 20);
        User2 user4 = new User2("Иван", 10);

        Test.anyLogic2(user2);
        Test.anyLogic2(user3);
        Test.anyLogic2(user4);
        System.out.println(user2.get());
        System.out.println(user3.get());
        System.out.println(user4.get());
    }
}
