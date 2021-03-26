package com.dlmu.offer;

import com.dlmu.util.ListNode;
import com.dlmu.util.PrintListNode;

import java.util.List;
import java.util.Stack;

/**
 * @Author: yezer
 * @Time: 2020/11/15
 * @Task: 链表的倒数第K个节点
 */
public class Offer22 {

//    public ListNode getKthFromEnd1(ListNode head, int k) {
//        Stack<ListNode> stack = new Stack<>();
//        ListNode curNode = head;
//        while(curNode != null){
//            stack.push(curNode);
//            curNode = curNode.next;
//        }
//        for (int i = 0; i < k-1; i++) {
//            stack.pop();
//        }
//        return stack.peek();
//    }
//    public ListNode getKthFromEnd2(ListNode head, int k) {
//        ListNode curNode = head;
//        int count = getLength(curNode);
//        //先让指针走n-k个步长
//        for (int i = 0; i < count-k; i++) {
//            curNode = curNode.next;
//        }
//        return curNode;
//    }
//
//    public int getLength(ListNode curNode){
//        int count = 0;
//        while(curNode != null){
//            count++;
//            curNode = curNode.next;
//        }
//        return count;
//    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(k-1 > 0){
            p2 = p2.next;
            k--;
        }
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        PrintListNode.printListNode(l1);
        System.out.println();
        ListNode newHead = new Offer22().getKthFromEnd(l1, 2);
        PrintListNode.printListNode(newHead);
    }
}
