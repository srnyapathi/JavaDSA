package in.srnyapathi.lclinkedlist;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var t1 = l1;
        var t2 = l2;
        int pow = 0;
        double num1 = 0;
        while (t1 != null) {
            num1 = num1 + (t1.val * Math.pow(10, pow++));
            t1 = t1.next;

        }
        System.out.println(num1);

        double num2 = 0;
        pow = 0;
        while (t2 != null) {
            num2 = num2 + (t2.val * Math.pow(10, pow++));
            t2 = t2.next;

        }
        System.out.println(num2);

        int total = (int) (num1 +  num2);


        ListNode result = new ListNode(total % 10);
        total = total / 10;

        // Pointer to the current node in the result list
        ListNode current = result;

        // Continue dividing the total and adding new nodes for each digit
        while (total > 0) {
            current.next = new ListNode(total % 10); // Create a new node for the next digit
            current = current.next; // Move to the new node
            total = total / 10; // Update the total
        }
        return result;
    }

}
