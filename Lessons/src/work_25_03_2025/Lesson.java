package work_25_03_2025;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Lesson {

    public static void main(String[] args) {
        /*
        push() - добавление элемента в стек
        pop() - удаляет с вершины стэка элемент
        peek() или top() - чтение (получение без удаления) элемента с вершины
          */

        //Stack<String> stack = new Stack<>();
        Deque<String> stack = new ArrayDeque<>();

        stack.push("Apple1");
        stack.push("Apple2");
        stack.push("Apple3");

        System.out.println("Стек после добавления: " + stack);

        System.out.println("Просмотр без удаления: " + stack.peek());

        System.out.println("Извлечение: " + stack.pop());

        System.out.println("Стек после извлечения: " + stack);

        System.out.println("Стек пустой? "+ stack.isEmpty());

    }
}
