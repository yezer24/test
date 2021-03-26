package com.dlmu.util;

public class PrintListNode {

	public static void printListNode(ListNode head){
		
		ListNode curNode = head;
		while(curNode != null){
			if(curNode.next == null){
				System.out.print(curNode.data);
			}else{
				System.out.print(curNode.data + " => ");
			}
			
			curNode = curNode.next;
		}
	}
}
