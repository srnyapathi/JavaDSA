package in.srnyapathi.lclinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListReversalRecursionTest {
    @Test
    void simpleCase(){
        LinkedListReversalRecursion soln = new LinkedListReversalRecursion();
        ListNode ll = new ListNode(1);
        System.out.println(soln.reverseList(ll));

    }

    @Test
    void BigOne(){
        LinkedListReversalRecursion soln = new LinkedListReversalRecursion();
        ListNode ll = new ListNode(1);
        ll.append(2);
        ll.append(4);
        ll.append(7);
        ll.append(9);
        var reversedLl = soln.reverseList(ll);
        assertEquals(9,reversedLl.val);
    }
}