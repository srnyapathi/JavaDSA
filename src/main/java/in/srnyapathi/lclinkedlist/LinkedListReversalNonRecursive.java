package in.srnyapathi.lclinkedlist;

public class LinkedListReversalNonRecursive {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;


        while (temp!=null){
            ListNode forward = temp.next;
            temp.next = prev;
            prev = temp;
            temp =  forward;
        }

        return prev;
    }
}
