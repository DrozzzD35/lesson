package leetCode.Task_18_10_2025.Task1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([])"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("ghbdtn"));
        System.out.println(solution.isValid("(])"));


    }
}
