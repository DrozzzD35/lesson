package leetCode.Task_11_11_2025.Task1;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode listNode1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));

        System.out.println(solution.deleteDuplicates(listNode));
        System.out.println(solution.deleteDuplicates(listNode1));



    }
}
