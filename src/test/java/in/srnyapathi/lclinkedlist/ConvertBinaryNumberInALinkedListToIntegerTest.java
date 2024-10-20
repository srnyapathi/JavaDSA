package in.srnyapathi.lclinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertBinaryNumberInALinkedListToIntegerTest {
    @Test
    public void testGetDecimalValue() {
        ConvertBinaryNumberInALinkedListToInteger converter = new ConvertBinaryNumberInALinkedListToInteger();

        // Example: Binary 101 -> 5 in decimal
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;

        int result = converter.getDecimalValue(node1);
        assertEquals(5, result);

        // Example: Binary 111 -> 7 in decimal
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(1);
        node4.next = node5;
        node5.next = node6;

        result = converter.getDecimalValue(node4);
        assertEquals(7, result);

        // Example: Binary 0 -> 0 in decimal
        ListNode node7 = new ListNode(0);

        result = converter.getDecimalValue(node7);
        assertEquals(0, result);
    }
}