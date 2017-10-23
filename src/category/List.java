package category;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Stack;

/**
 * Created by qiantao on 2017/10/23 0023
 */

class List {

    public static class ListNode {
        public int val;
        public ListNode next;
    }

    /**
     * 丛尾到头打印链表
     */
    public static void printListReverse(ListNode node) {
        Stack<ListNode> stack = new Stack<>();
        ListNode head = node;
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            head = stack.peek();
            System.out.println(head.val);
            stack.pop();
        }
    }
}
