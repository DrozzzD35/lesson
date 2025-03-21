package work_21_03_2025;

import java.util.List;

public class Lesson {

    public static void main(String[] args) {
//        Apple apple = new Apple();
//        Cat cat = new Cat();
//        Box<Apple> boxApple = new Box<>(apple);
//        Box<Cat>  boxCat = new Box<>(cat);
//
//        Integer[] intArray = {1, 2, 3};
//        String[] stringArray = {"Ann", "Vasay", "Peter"};
//
//        printArray(intArray);
//        printArray(stringArray);


        List<Integer> intList = List.of(1, 2, 3);
        List<String> stringList = List.of("Ann", "Vasay", "Peter");

        printList(intList);
        printList(stringList);
    }

    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }

    public static void printList(List<?> list){
        for(Object element : list){
            System.out.println(element);
        }
    }

    public static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }





}
