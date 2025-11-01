package leetCode.Task_11_10_2025.Task1;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,1,2};


        System.out.println("Количество уникальных элементов: " + solution.removeDuplicates(a));

        for (int i = 0; i < a.length; i++) {
            System.out.println("Индекс: " + i + " равен - " + a[i]);

        }
    }
}
