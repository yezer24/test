package com.dlmu.offer;

import com.dlmu.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: yezer
 * @Time: 2020/11/25
 * @Task: 之字遍历
 */
public class Offer32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new LinkedList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //奇偶分类
                if((res.size() % 2) == 0){
                    temp.addLast(node.val);
                }else {
                    temp.addFirst(node.val);
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(temp);
        }
        return res;
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


        List<List<Integer>> list = new Offer32_3().levelOrder(root);
        for (List num : list) {
            System.out.println(num);
        }
    }
}
