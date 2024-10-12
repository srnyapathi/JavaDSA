package in.srnyapathi.linkedlist;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new LinkedList(10);
    }

    @Test
    void testAppend() {
        linkedList.append(20);
        assertEquals(2, linkedList.getLength());
        assertEquals(20, linkedList.get(linkedList.getLength() - 1).getValue());
    }

    @Test
    void testRemoveLast() {
        linkedList.append(20);
        LinkedList.Node removedNode = linkedList.removeLast();
        assertEquals(20, removedNode.getValue());
        assertEquals(1, linkedList.getLength());
        assertNull(linkedList.get(linkedList.getLength()));
    }

    @Test
    void testRemoveLastWhenEmpty() {
        linkedList.removeLast();
        LinkedList.Node removedNode = linkedList.removeLast();
        assertNull(removedNode);
    }

    @Test
    void testPrepend() {
        linkedList.prepend(5);
        assertEquals(2, linkedList.getLength());
        assertEquals(5, linkedList.get(0).getValue());
    }

    @Test
    void testRemoveFirst() {
        linkedList.append(20);
        LinkedList.Node removedNode = linkedList.removeFirst();
        assertEquals(10, removedNode.getValue());
        assertEquals(1, linkedList.getLength());
    }

    @Test
    void testRemoveFirstWhenEmpty() {
        linkedList.removeFirst();
        LinkedList.Node removedNode = linkedList.removeFirst();
        assertNull(removedNode);
    }

    @Test
    void testGetValidIndex() {
        linkedList.append(20);
        LinkedList.Node node = linkedList.get(1);
        assertEquals(20, node.getValue());
    }

    @Test
    void testGetInvalidIndex() {
        LinkedList.Node node = linkedList.get(-1);
        assertNull(node);

        node = linkedList.get(100);
        assertNull(node);
    }

    @Test
    void testSetValidIndex() {
        boolean result = linkedList.set(0, 15);
        assertTrue(result);
        assertEquals(15, linkedList.get(0).getValue());
    }

    @Test
    void testSetInvalidIndex() {
        boolean result = linkedList.set(-1, 15);
        assertFalse(result);

        result = linkedList.set(100, 15);
        assertFalse(result);
    }

    @Test
    void testInsertValidIndex() {
        linkedList.append(30);
        boolean result = linkedList.insert(1, 25);
        assertTrue(result);
        assertEquals(25, linkedList.get(1).getValue());
    }

    @Test
    void testInsertInvalidIndex() {
        boolean result = linkedList.insert(-1, 25);
        assertFalse(result);

        result = linkedList.insert(100, 25);
        assertFalse(result);
    }

    @Test
    void testRemoveValidIndex() {
        linkedList.append(20);
        LinkedList.Node removedNode = linkedList.remove(0);
        assertEquals(10, removedNode.getValue());
        assertEquals(1, linkedList.getLength());
    }

    @Test
    void testRemoveInvalidIndex() {
        LinkedList.Node removedNode = linkedList.remove(-1);
        assertNull(removedNode);

        removedNode = linkedList.remove(100);
        assertNull(removedNode);
    }

    @Test
     void testReverse() {
        linkedList.append(20);
        linkedList.append(30);
        linkedList.Reverse();

        assertEquals(30, linkedList.get(0).getValue());
        assertEquals(20, linkedList.get(1).getValue());
        assertEquals(10, linkedList.get(2).getValue());
    }
}
