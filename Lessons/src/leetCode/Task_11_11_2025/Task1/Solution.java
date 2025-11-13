package leetCode.Task_11_11_2025.Task1;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }


        }

        return head;


    }

    public void printListNode(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();

    }


}
