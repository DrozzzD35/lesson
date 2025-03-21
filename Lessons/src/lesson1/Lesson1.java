package lesson1;

public class Lesson1 {

    // Точка входа в программу и она именно такая!
    public static void main(String [] args) {
        Cat barsik = new Cat();
        String name = barsik.name;
        printHello();
        printGoodbye();
        printSum(1,5);
        printSum(18,58);
        printSum(11,56);
        printSum(1,2);
        printSum(1,8);
        getSum(2,3);

        /*
         переменные
         int, String, double

         Объявленное переменной: [тип данных] [название переменной]
         Инициализация переменной: = [какое-то значение]
        * */

        /*int sum;
        sum = 10;
        sum = getSum(5,5);*/
    }

    // public - модификатор доступа (например, private)
    /*
        Понятие "класс" и "экземпляр класса"
     static - принадлежность к классу, а не к экземпляру

     Сигнатура метода:
     специальные слова такие как: public\static не относятся к сигнатуре метода
     [тип возвращаемых данных] [название метода]([тип переменной]...)
     void - не возвращает тип.


    * */
    //
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    /*
     Создать 2 метода, которые ничего не возвращают, один метод пишет "Привет, мир!", второй метод "Пока, мир!"
    * */
    public static void printHello(){
        System.out.println("Hello World!");

    }
    public static void printGoodbye(){
        System.out.println("Goodbye World!");
    }

     /*
     if (условие){
        тело if
     }else if(условие){
        тело else if
     }else if(условие2){
        тело else if
     }else{
        тело else
     }

    дальнейший код
    * */

    private static void testIf() {
        int number = 10;
        if (number > 5) {
            System.out.println("Число больше 5");
        } else if (number > 2) {
            System.out.println("Число больше 2");
        } else {
            System.out.println("Число меньше 2");
        }
    }

}


