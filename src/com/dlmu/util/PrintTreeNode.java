package com.dlmu.util;

public class PrintTreeNode {
	//前序遍历二叉树
	public static void printTreeNode(TreeNode root){
		if(root == null){
			return;
		}else{
			System.out.print(root.val + " => ");
		}
		
		printTreeNode(root.left);
		printTreeNode(root.right);
	}
}
