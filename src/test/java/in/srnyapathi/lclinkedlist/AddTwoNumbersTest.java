package in.srnyapathi.lclinkedlist;

import in.srnyapathi.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    /*Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
    * */
    @Test
    void TestCase1() {
        var l1 = new ListNode(2);
        var l2 = new ListNode(5);
        l1.append(4);
        l1.append(3);
        l2.append(6);
        l2.append(4);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        var result = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(result);
    }

    /**
     * l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     */
    @Test
    void TestCase2() {
        var l1 = new ListNode(9);
        l1.append(9);
        l1.append(9);
        l1.append(9);
        l1.append(9);
        l1.append(9);
        l1.append(9);
        var l2 = new ListNode(9);
        l2.append(9);
        l2.append(9);
        l2.append(9);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        var result = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(result);
    }

    @Test
    void TestCase3() {
        var l1 = new ListNode(9);

        var l2 = new ListNode(1);
        //9,9,9,9,9,9,9,9,9
        l2.append(9);
        l2.append(9);
        l2.append(9);
        l2.append(9);
        l2.append(9);
        l2.append(9);
        l2.append(9);
        l2.append(9);
        l2.append(9);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        var result = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(result);
    }


}