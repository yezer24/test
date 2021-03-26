package com.dlmu.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yezer
 * @Time: 2020/12/2
 * @Task: 滑动窗口的最大值
 */
public class Offer59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || nums == null){
            return new int[-1];
        }
        int i = 0;
        int j = i + k - 1;
        List<Integer> res = new ArrayList<>();
        while(j != nums.length){
            int temp = getMax(nums, i, j);
            res.add(temp);
            i++;
            j++;
        }
        int[] ans = new int[res.size()];
        for (int l = 0; l < res.size(); l++) {
            ans[l] = res.get(l);
        }
        return ans;
    }

    public int getMax(int[] nums, int i, int j){
        int max = nums[i];
        for (int k = i + 1; k <= j ; k++) {
            if(max < nums[k]){
                max = nums[k];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = new Offer59_1().maxSlidingWindow(nums, k);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
