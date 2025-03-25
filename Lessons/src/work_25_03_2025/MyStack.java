package work_25_03_2025;

public class MyStack {

    private String[] arr;
    private int capacity;
    private int top;

    public MyStack(int size) {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public void push(String value) {
        if (top == capacity - 1) {
            System.out.println("Стек уже заполнен");
            return;
        }

        arr[++top] = value;

        /*
            capacity = 3;
            top = -1
            arr = [0, 0, 0]

            Integer[] arr = new Integer[3] => [null, null, null]

            value = 666

            -1 == 2 ? нет
            arr[++top] = value; => arr[0] = 666;
            arr[top] = value; => arr[-1] = 666; ошибка
            arr[top++] = value; => arr[-1] = 666; top = 0

          */

    }

    //  0   1  2       0   1          0              0    1
    // [10, 5, 12] => [10, 5, 12] => [10, 5, 12] => [10, 666, 12]
    public String pop() {
        if (isEmpty()) {
            System.out.println("Стек пустой. Нельзя удалить элемент");
            return "";
        }
        return arr[top--];
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Стек пустой");
            return "";
        }
        return arr[top];
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
        } else {
            System.out.println("Стек: ");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        stack.push("Apple1");
        stack.push("Apple2");
        stack.push("Apple3");

        System.out.println("Стек после добавления: ");
        stack.print();

        System.out.println("Просмотр без удаления: " + stack.peek());

        System.out.println("Извлечение: " + stack.pop());

        System.out.println("Стек после извлечения: ");
        stack.print();

        System.out.println("Стек пустой? " + stack.isEmpty());
    }
}
