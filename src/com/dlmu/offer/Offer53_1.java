package com.dlmu.offer;

/**
 * @Author: yezer
 * @Time: 2020/11/27
 * @Task: 统计一个数字在排序数组中出现的次数。
 */
public class Offer53_1 {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= target){
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        //若数组中无target，提前返回
        if(j >= 0 && nums[j] != target){
            return 0;
        }
        int right = i;
        i = 0; j = nums.length - 1;
        while(i <= j){
            int m = (i + j) / 2;
            if(nums[m] >= target){
                j = m - 1;
            }else{
                i = m + 1;
            }
        }
        int left = j;
        return right - left - 1;

    }

    public static void main(String[] args) {

    }
}
