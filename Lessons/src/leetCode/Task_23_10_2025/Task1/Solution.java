package leetCode.Task_23_10_2025.Task1;


public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {

            if (list2.val > list1.val) {
                tail.next = list1;
                list1 = list1.next;

            } else {
                tail.next = list2;
                list2 = list2.next;

            }
            tail = tail.next;

        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummy.next;
    }
}
