# Reverse Sublist in Linked List

Given a linked list with head node with start and end positions with in the linked list our task is to revers those 


```
Example:
1->2->3->4->5->6->null
start: 3
End: 5
```

We should get an output like

```
Example:
1->2->5->4->3->6->null
```

# We need to use 3 pointer approach 
1. We need to keep track of three pointers 
2. Start off at the second element and place it in the front
3. Go to the next element place it in the front
```
Example :
4 -> 3 ->5
5 -> 4 ->3
```

To accomplish this we always need pointer to the first of the list  and working pointer
```
Example :
1   ->  2   ->  3   ->  4   ->  5   ->  6   ->  null
        ^   
    nodeBeforeSublist
```
We need access to part of the list that we need to cut from the current sublist.
```
Example :
1   ->  2   ->  3   ->  4   ->  5   ->  6   ->  null
                ^       
            workingPointer
```
```
Example :
1   ->  2   ->  3   ->  4   ->  5   ->  6   ->  null
                        ^       
                nodeToBeExtracted
```
This is the next node of the working pointer 

1. Get nodeToBeExtracted = workingpointer.next
2. next pointer of the working pointer to skip the node to be extracted 
   workingpointer.next= nodeToBeExtracted-> next






