package leetCode.Task_11_11_2025.Task1;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));


        System.out.println("До");
        solution.printListNode(listNode);
        solution.printListNode(listNode1);
        solution.deleteDuplicates(listNode);
        solution.deleteDuplicates(listNode1);

        System.out.println("После");
        solution.printListNode(listNode);
        solution.printListNode(listNode1);


    }
}
