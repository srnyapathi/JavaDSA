package in.srnyapathi.lclinkedlist;

public class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null ){
            return true;
        }

        ListNode fast = head,slow=head;


        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = reverseList(slow);

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;

    }

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
