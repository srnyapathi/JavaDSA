package in.srnyapathi.linkedlist;

import lombok.Getter;
import lombok.Setter;

/**
 * This class implements a singly linked list that provides various operations
 * like appending, prepending, removing nodes, and reversing the list.
 */
@Getter
@Setter
public class LinkedList {

    /**
     * Represents a node in the linked list.
     * Each node contains a value and a reference to the next node in the list.
     */
    @Getter
    @Setter
    class Node {
        private int value;
        private Node next;

        /**
         * Constructs a new node with a given value.
         *
         * @param value the value to be stored in the node
         */
        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    /**
     * Constructs a linked list with an initial node.
     *
     * @param value the value of the initial node
     */
    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length++;
    }

    /**
     * Appends a new node with the specified value to the end of the linked list.
     *
     * @param value the value to append
     */
    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        length++;
    }

    /**
     * Removes the last node from the linked list.
     *
     * @return the removed node, or null if the list is empty
     */
    public Node removeLast() {
        if (this.length == 0) {
            return null;
        }

        Node temp = this.head;
        Node pre = this.head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        this.tail = pre;
        this.tail.next = null;
        this.length--;

        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }

        return temp;
    }

    /**
     * Prepends a new node with the specified value to the start of the linked list.
     *
     * @param value the value to prepend
     */
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    /**
     * Removes the first node from the linked list.
     *
     * @return the removed node, or null if the list is empty
     */
    public Node removeFirst() {
        if (this.length == 0) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length--;

        if (this.length == 0) {
            this.tail = null;
        }

        return temp;
    }

    /**
     * Retrieves the node at the specified index.
     *
     * @param index the position of the node
     * @return the node at the specified index, or null if the index is out of bounds
     */
    public Node get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Updates the value of the node at the specified index.
     *
     * @param index the position of the node to update
     * @param value the new value for the node
     * @return true if the node was updated, false if the index was invalid
     */
    public boolean set(int index, int value) {
        Node node = get(index);
        if (node != null) {
            node.value = value;
            return true;
        }
        return false;
    }

    /**
     * Inserts a new node with the specified value at the given index.
     *
     * @param index the position at which to insert the new node
     * @param value the value of the new node
     * @return true if the node was successfully inserted, false otherwise
     */
    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) {
            return false;
        }

        if (index == 0) {
            this.prepend(value);
            return true;
        }
        if (index == this.length) {
            this.append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = this.get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
        return true;
    }

    /**
     * Removes the node at the specified index.
     *
     * @param index the position of the node to remove
     * @return the removed node, or null if the index was invalid
     */
    public Node remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        if (index == 0) {
            return this.removeFirst();
        }
        if (index == this.length - 1) {
            return this.removeLast();
        }

        Node previous = this.get(index - 1);
        Node temp = previous.next;

        previous.next = temp.next;
        temp.next = null;
        this.length--;

        return temp;
    }

    /**
     * Reverses the order of nodes in the linked list.
     */
    public void Reverse() {
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        Node before = null;
        Node after;
        for (int i = 0; i < this.length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }

        return slow;

    }

    public Node findKthFromEnd(int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;


    }
}
