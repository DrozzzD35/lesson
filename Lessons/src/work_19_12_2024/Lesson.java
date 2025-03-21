package work_19_12_2024;

public class Lesson {


    /*
       Объект имеет состояние (характеристики и данные) и поведение (методы и действия)
     Пример: телефон (состояния: модель, цвет), поведение: звонить
     Создавая класс, мы создаем новый тип данных
     Объект (переменная) - конкретный экземпляр класса, создается через спец слово "new"
    * */
    public static void main(String[] args) {
        Student vasya = new Student("Вася", 22);
        vasya.study();

        Student anay = new Student("Аня", 19);
        anay.study();

        /*
         Упражнение "Круг":
            Создайте класс Circle с полем радиуса radius.
            Добавьте методы для вычисления площади и периметра круга.
        * */
        Circle x = new Circle(15);
        x.square();
        x.perimeter();

        /*
        Упражнение "Книга":
            Создайте класс Book с полями title, author, pages.
            Добавьте метод printInfo(), который выводит информацию о книге.
        * */
        Book alphabet = new Book("Некрасов ", " Алфавит", 56);
        alphabet.printInfo();

/*
        Упражнение "Конструктор класса Person":
            Создайте класс Person с полями name, age.
            Добавьте конструктор, чтобы при создании сразу задавать имя и возраст.
            Создайте в main пару объектов Person и вызовите их методы.
* */
        Person igor = new Person("Игорь", 18);
        igor.sayHello();

        Person liza = new Person("Лиза", 20);
        liza.sayHello();


    }


}
