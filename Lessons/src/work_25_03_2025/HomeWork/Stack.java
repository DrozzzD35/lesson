package work_25_03_2025.HomeWork;

public class Stack {
    private String[] arr;
    private int capacity;
    private int top;

    public Stack(int size) {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Операция невозможна. Стек пуст");
            return "";
        }
        return arr[top--];
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Операция невозможна. Стек пуст");
            return "";
        }
        return arr[top];
    }

    public void printArr() {
        if (isEmpty()) {
            System.out.println("Операция невозможна. Стек пуст");
            return;
        } else {
            checkArr();
            System.out.println("Стек: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


    public boolean checkArr() {
        String squareBracket = "]";
        String curlyBracket = "}";
        String bracket = ")";
        String symbol = "";
        for (int i = top; i >= 0; i--) {
            if (arr[i] == ")") {
                if (arr[i] == "(") {
                    System.out.println("Найдена пара");
                    return true;
                }
            }
        }
        return false;
    }


    public void push(String symbol) {
        if (top >= capacity - 1) {
            System.out.println("Операция невозможна. Стек полон");
            return;
        }
        arr[++top] = symbol;
    }
}
