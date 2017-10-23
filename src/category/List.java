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
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().val);
        }
    }
}
