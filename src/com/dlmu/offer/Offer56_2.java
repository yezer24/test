package com.dlmu.offer;

/**
 * @Author: yezer
 * @Time: 2020/11/29
 * @Task: 只有一个数出现一次，其余均出现3次，找出这个数字
 */
public class Offer56_2 {
    public int singleNumber(int[] nums) {//本算法同样适用于数组nums中存在负数的情况
        if (nums.length == 0) {
            return -1;
        }
        int[] bitSum = new int[32];
        int res = 0;
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitSum[i] += num & 1;
                num >>>= 1;
            }
        }
        for (int i = 31; i >= 0; i--) {//这种做法使得本算法同样适用于负数的情况
            res <<= 1;
            res += bitSum[i] % 3;//这两步顺序不能变，否则最后一步会多左移一次
        }
        return res;
    }

}
