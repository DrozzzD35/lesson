package work_25_03_2025.HomeWork;


import java.util.Stack;

public class HomeWork {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('(');
        stack.push(']');
        stack.push(')');
        stack.push('{');
        stack.push('}');


        if (stack.peek() == ')') {
            stack.pop();
            if (stack.peek() == '(') {
                stack.pop();
                System.out.println("Обнаружены скобки ()");
            } else {
                System.out.println("Ошибка.Не найдена пара скобки ()");
            }
        } else if (stack.peek() == ']') {
            stack.pop();
            if (stack.peek() == '[') {
                stack.pop();
                System.out.println("Обнаружены скобки []");
            } else {
                System.out.println("Ошибка.Не найдена пара скобки []");
            }
        } else if (stack.peek() == '}') {
            stack.pop();
            if (stack.peek() == '{') {
                stack.pop();
                System.out.println("Обнаружены скобки {}");
            } else {
                System.out.println("Ошибка.Не найдена пара скобки {}");
            }
        } 

        System.out.println("Стек: " + stack);
    }

}





