package in.srnyapathi.lclinkedlist;

import lombok.ToString;

@ToString
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void append(int newVal) {
        ListNode newNode = new ListNode(newVal);
        ListNode current = this;

        // Traverse to the end of the list
        while (current.next != null) {
            current = current.next;
        }

        // Append the new node
        current.next = newNode;
    }
}
