package com.dlmu.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yezer
 * @Time: 2020/11/29
 * @Task: 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 */
public class Offer57_2 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        if(target < 3){
            return res.toArray(new int[0][0]);
        }

        int left = 1;
        int right = 2;
        int curSum = left + right;
        while(left < right && right < target){
            while(curSum > target && left < target/2){
                curSum -= left;
                left ++;
            }
            if(curSum == target){
                int[] arr = new int[right - left + 1];
                for (int i = left; i < right + 1; i++) {
                    arr[i - left] = i;
                }
                res.add(arr);
            }
            right++;
            curSum += right;
        }
        return res.toArray(new int[res.size()][]);
    }
}
