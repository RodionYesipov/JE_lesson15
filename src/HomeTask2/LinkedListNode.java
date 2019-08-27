package HomeTask2;

import java.util.Arrays;

public class LinkedListNode {
    private int size = 0;
    private ListNode first = null;
    private ListNode last = null;

    public static class ListNode{
        int value;
        ListNode next;

        public ListNode(int val) {
            this.value = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void add(int element) {
        ListNode newListNode = new ListNode(element);
        if (size == 0) {
            first = newListNode;
            last = newListNode;
        } else {
            last.next = newListNode;
            last = newListNode;
        }
        size++;
    }

    public int[] toArray() {
            int[] result = new int[size];
        ListNode tmp = first;
        for (int i = 0; i < size; i++) {
            result[i] = tmp.value;
            tmp = tmp.next;
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }
}
