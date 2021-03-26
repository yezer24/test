package com.dlmu.offer;

import com.dlmu.util.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @Author: yezer
 * @Time: 2020/11/26
 * @Task: 和为S的两个数的下标
 */
public class Offer57 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }else{
                map.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

    }
}
