package work_25_03_2025.HomeWork;


import java.util.Stack;

public class HomeWork {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String input = "(){}[]";

        for (char symbol : input.toCharArray()) {

            if (symbol == '(' || symbol == '[' || symbol == '{') {
                stack.push(symbol);
            } else if (symbol == ')' || symbol == ']' || symbol == '}') {

                if (stack.isEmpty()) {
                    System.out.println("Некорректный ввод");
                    return;
                }

                char top = stack.pop();

                if (!((top == '(' && symbol == ')') || (top == '[' && symbol == ']') || (top == '{' && symbol == '}'))) {
                    System.out.println("Некорректный ввод");
                    return;
                }
            }

        }

    }


    private static void checkString() {
        Stack<Character> stack = new Stack<>();

        String input = "[)[{}]";

        for (char symbol : input.toCharArray()) {

            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);

            } else if (symbol == ')' || symbol == ']' || symbol == '}') {

                if (stack.isEmpty()) {
                    System.out.println("Некорректное выражение");
                    return;
                }

                char top = stack.pop();

                if (!isMatching(top, symbol)) {
                    System.out.println("Некорректное выражение");
                    return;
                }

            }
        }
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }

}





