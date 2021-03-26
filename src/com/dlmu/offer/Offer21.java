package com.dlmu.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yezer
 * @Time: 2020/11/15
 * @Task: 将奇数挪到偶数前面
 */
public class Offer21 {

    public int[] getNum(int[] nums){

        int i=0, j=nums.length-1, temp;

        while(i < j){
            while(i < j && (nums[i]&1) == 1){
                i++;
            }
            while(i < j && (nums[j]&1) == 0){
                j--;
            }
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] temp = new Offer21().getNum(nums);
       for (int num : temp) {
           System.out.print(num + " ");
       }
    }
}
