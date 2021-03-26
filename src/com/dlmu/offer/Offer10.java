package com.dlmu.offer;

/**
 * @Author: yezer
 * @Time: 2020/11/9
 * @Task: 斐波那契
 */
public class Offer10 {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        }
        int fn0 = 0;
        int fn1 = 1;
        int temp = 0;
        for(int i = 2; i <= n; i++){
            temp = fn0 + fn1;
            fn0 = fn1;
            fn1 = temp% 1000000007; // 每次运算都取模 避免越界
        }
        return temp;
    }


    public static void main(String[] args) {
//        int a = 24;
//        System.out.println(a);
        Offer10 offer = new Offer10();
        int ans = offer.fib(5);
        System.out.println(ans);
    }
}
