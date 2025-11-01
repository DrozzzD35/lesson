package leetCode.Task_17_10_2025.Task2;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] strings = {"flower", "flow", "flight"};
        String[] strings2 = {"собака", "гоночный автомобиль", "автомобиль"};
        String[] strings3 = {"ab", "a"};


        System.out.println(solution.longestCommonPrefix(strings));
        System.out.println(solution.longestCommonPrefix(strings2));
        System.out.println(solution.longestCommonPrefix(strings3));
    }
}
