package homeWork_14_06_2025;

import java.util.List;

public class SummaryClass<T extends Number> {

    public void printSum(T a, T b){
        System.out.println(a.doubleValue() + b.doubleValue());
    }

//    public static <T extends Number> void printSum(T a, T b){
//        System.out.println(a.doubleValue() + b.doubleValue());
//    }

}
