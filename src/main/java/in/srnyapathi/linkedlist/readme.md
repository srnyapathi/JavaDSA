
# Understanding Linked Lists

A **Linked List** is a linear data structure where elements, known as **nodes**, are connected by links. Unlike arrays, where elements are stored in contiguous memory locations, linked lists store elements in different memory locations, with each node pointing to the next one in the sequence.

A linked list consists of:
- **Nodes**: These are the individual elements that hold data and a reference (or link) to the next node.
- **Head**: This is the first node in the list.
- **Tail**: This is the last node in the list, which doesn’t point to any other node (its next reference is `null`).

There are different types of linked lists:
1. **Singly Linked List**: Each node points only to the next node.
2. **Doubly Linked List**: Each node has pointers to both the next and the previous nodes.
3. **Circular Linked List**: The last node points back to the head, forming a circle.

We’ll focus on a **Singly Linked List**, which is implemented in your code.

---

## Code Breakdown (from your repository)

Let’s go over the key concepts in your `LinkedList` class and break them down step-by-step for beginners.

### 1. Node Class
This class defines what each element (node) in the linked list looks like.

```java
@Getter
@Setter
class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }
}
```

- **`value`**: This stores the data in the node (in this case, an integer).
- **`next`**: This is a reference to the next node in the list.
- **Why it’s important**: A node is the fundamental building block of a linked list. Each node connects to the next one, forming the list.

---

### 2. LinkedList Class
The `LinkedList` class manages the overall list, allowing you to perform operations like adding, removing, and accessing nodes.

```java
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length++;
    }
}
```

- **`head`**: Points to the first node in the list.
- **`tail`**: Points to the last node in the list.
- **`length`**: Keeps track of how many nodes are in the list.

**Constructor**: When you create a new linked list, you pass in an initial value. This value becomes the data for the first node, which is both the head and the tail of the list.

---

## Key Operations in the Linked List

Let’s go over each operation your `LinkedList` class supports, so it’s clear for beginners.

### 3. append(int value)

```java
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
```

- **Purpose**: Adds a new node to the **end** of the linked list.
- **How it works**: If the list is empty, the new node becomes both the head and the tail. If not, it updates the tail’s `next` reference to point to the new node and updates the tail to be the new node.
- **Example**: 
  - Start with an empty list: \`[]\`
  - Append \`5\`: \`[5]\` (5 is both head and tail)
  - Append \`10\`: \`[5, 10]\` (tail is now 10)

---

### 4. prepend(int value)

```java
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
```

- **Purpose**: Adds a new node to the **beginning** of the list.
- **How it works**: If the list is empty, the new node is set as both head and tail. Otherwise, the new node is inserted before the current head, and the head is updated to this new node.
- **Example**:
  - Start with \`[5]\`
  - Prepend \`2\`: \`[2, 5]\` (head is now 2)

---

### 5. removeLast()

```java
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
```

- **Purpose**: Removes the last node from the list.
- **How it works**: It traverses the list to find the second-to-last node, updates the tail to point to this node, and disconnects the last node. If the list is empty, it returns \`null\`.
- **Example**:
  - Start with \`[2, 5, 10]\`
  - Remove last: \`[2, 5]\` (tail is now 5)

---

### 6. removeFirst()

```java
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
```

- **Purpose**: Removes the first node from the list.
- **How it works**: It sets the head to point to the second node, effectively removing the first node. If the list becomes empty, it sets both head and tail to \`null\`.
- **Example**:
  - Start with \`[2, 5]\`
  - Remove first: \`[5]\` (head is now 5)

---

### 7. get(int index)

```java
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
```

- **Purpose**: Retrieves the node at the specified index.
- **How it works**: It starts from the head and traverses the list until it reaches the index. If the index is out of bounds, it returns \`null\`.
- **Example**:
  - Start with \`[5, 10]\`
  - Get node at index 1: returns node with value \`10\`

---

### 8. reverse()

```java
public void reverse() {
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
```

- **Purpose**: Reverses the order of the nodes in the list.
- **How it works**: It changes the direction of the \`next\` references, making the tail the new head and reversing the links between all nodes.
- **Example**:
  - Start with \`[2, 5, 10]\`
  - Reverse: \`[10, 5, 2]\` (head is now 10, tail is 2)

