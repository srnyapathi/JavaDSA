package in.srnyapathi.lclinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListPalindromeTest {

    @Test
    void edgeCase(){
        ListNode ll = new ListNode(0);
        var solution= new LinkedListPalindrome();
        assert solution.isPalindrome(ll);
    }

    @Test
    void edgeCase2(){
        ListNode ll = new ListNode(1);
        ll.append(0);
        ll.append(0);
        var solution= new LinkedListPalindrome();
        assertFalse( solution.isPalindrome(ll));
    }

    @Test
    void edgeCase3(){
        ListNode ll = new ListNode(1);
        ll.append(0);
        ll.append(1);
        var solution= new LinkedListPalindrome();
        assertTrue( solution.isPalindrome(ll));
    }

    @Test
    void edgeCase5(){
        ListNode ll = new ListNode(1);
        ll.append(2);
        ll.append(2);
        ll.append(1);
        var solution= new LinkedListPalindrome();
        assertTrue( solution.isPalindrome(ll));
    }
}