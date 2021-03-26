package com.dlmu.offer;

/**
 * @Author: yezer
 * @Time: 2020/11/28
 * @Task: 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 * 要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
public class Offer56_1 {

    public int[] singleNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        int temp = 1;
        while((ans & temp) == 0){
            temp <<= 1;
        }
        int[] arr = new int[2];
        for (int num : nums) {
            if((temp & num) == 0){
                arr[0] ^= num;
            }else{
                arr[1] ^= num;
            }
        }

        return arr;
    }
    public static void main(String[] args) {

    }
}
