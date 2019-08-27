package HomeTask2;

import java.util.*;

/**
Задан отсортированный список который состоит из ListNode.
Написать метод deleteDuplicates, который вернет список без дупликатов.

public class ListNode {
int val;
ListNode next;
ListNode(int x) { val = x; }
 }
public ListNode deleteDuplicates(ListNode head) { ...}

        Example:
        Input: 1->1->2->3->3
        Output: 1->2->3
***/

public class Main {

    public static LinkedListNode deleteDuplicates(LinkedListNode linkedListNode){
        int[] listNodeArr = Arrays.stream(linkedListNode.toArray()).distinct().toArray();
        LinkedListNode result = new LinkedListNode();

        for (int i = 0; i < listNodeArr.length; i++) {
            result.add(listNodeArr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedListNode linkedListNode = new LinkedListNode();

        linkedListNode.add(1);
        linkedListNode.add(1);
        linkedListNode.add(2);
        linkedListNode.add(3);
        linkedListNode.add(3);
        linkedListNode.add(4);
        linkedListNode.add(5);
        linkedListNode.add(5);
        System.out.println("Given ListNode:\n" + linkedListNode);
        //
        System.out.println("Without duplicates:\n" + deleteDuplicates(linkedListNode));
    }
}
