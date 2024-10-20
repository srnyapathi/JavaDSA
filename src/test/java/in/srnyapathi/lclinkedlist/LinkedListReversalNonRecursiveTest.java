package in.srnyapathi.lclinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListReversalNonRecursiveTest {

    @Test
    void simpleCase(){
        LinkedListReversalNonRecursive soln = new LinkedListReversalNonRecursive();
        ListNode ll = new ListNode(1);
        System.out.println(soln.reverseList(ll));

    }

    @Test
    void BigOne(){
        LinkedListReversalNonRecursive soln = new LinkedListReversalNonRecursive();
        ListNode ll = new ListNode(1);
        ll.append(2);
        ll.append(4);
        ll.append(7);
        ll.append(9);
        var reversedLl = soln.reverseList(ll);
        assertEquals(9,reversedLl.val);
    }

}