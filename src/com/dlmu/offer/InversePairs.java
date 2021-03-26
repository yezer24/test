package com.dlmu.offer;

/**
 * @Author: yezer
 * @Time: 2020/11/3
 * @Task: 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个
 *        数字组成一个逆序对。求一个数组的逆序对的总数P
 * @思路： 归并排序 全局变量count记录逆序对个数
 */
public class InversePairs {
    //暴力解法 两个for循环
    public static int getInverseBaoLi(int[] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] > nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    //归并排序
    public static int getInverse(int[] nums){

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {7, 5, 6, 4};

        System.out.println(InversePairs.getInverseBaoLi(nums1));
        System.out.println(InversePairs.getInverseBaoLi(nums2));
        System.out.println(InversePairs.getInverseBaoLi(nums3));
    }
}
