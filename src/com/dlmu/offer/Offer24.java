package com.dlmu.offer;

import com.dlmu.util.ListNode;
import com.dlmu.util.PrintListNode;

import java.util.Stack;

/**
 * @Author: yezer
 * @Time: 2020/11/15
 * @Task: 翻转链表
 */
public class Offer24 {
    //   1 -> 2 -> 3 -> 4 -> null
    //null <- 1 <- 2 <- 3 <- 4
    public ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        ListNode pre = null;

        while(curNode != null){
            ListNode temp = curNode.next; //暂存curNode的后继 => 否则会丢失;
            curNode.next = pre;
            pre = curNode;
            curNode = temp;
        }
        //curNode = null   ==>  返回pre
        return pre;
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

        ListNode newHead = new Offer24().reverseList(l1);
        PrintListNode.printListNode(newHead);
    }
}
