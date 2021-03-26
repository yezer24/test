package com.dlmu.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yezer
 * @Time: 2020/12/3
 * @Task: 扑克牌的顺子
 */
public class Offer61 {
    public boolean isStraight(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i = 1;
        res.add(nums[0]);
        while (i != nums.length) {
            if (nums[i] >= nums[i - 1]) {
                res.add(nums[i]);
            }
            i++;
        }
        return res.size() == nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 2, 2, 5};
        System.out.println(new Offer61().isStraight(nums));
    }
}
