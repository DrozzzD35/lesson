package work_25_03_2025.HomeWork;


public class HomeWork {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push("(");
        stack.push("(");
        stack.push(")");

        stack.printArr();
//        System.out.println(stack.peek() + " ");
    }
}