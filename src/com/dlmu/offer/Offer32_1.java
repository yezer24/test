package com.dlmu.offer;

import com.dlmu.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: yezer
 * @Time: 2020/11/25
 * @Task: 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 思路：BFS
 */
public class Offer32_1 {

    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<Integer> list = new ArrayList<Integer>();

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        root.left = r2;
        root.right = r3;
        r3.left = r4;
        r3.right = r5;

        int[] nums = new int[10];
        nums = new Offer32_1().levelOrder(root);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
