package com.dlmu.offer;

import com.dlmu.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: yezer
 * @Time: 2020/11/25
 * @Task: 返回值不同，同一层的节点放到一个数组
 */
public class Offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();

            for (int i = queue.size(); i > 0 ; i--) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            list.add(temp);
        }
        return list;
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


        List<List<Integer>> list = new Offer32_2().levelOrder(root);
        for (List num : list) {
            System.out.println(num);
        }
    }
}
