package com.dlmu.test;

/**
 * 测试
 */
public class Test {

    public static void main(String[] args) {

        int num = 5;
        int res = f(num);
        System.out.println("res = " + res);
    }
    static int i = 3;
    public static int f(int n) {
        if(n == 2){
            return 1;
        }else{
            int ans = f(n - 1);
            System.out.println(i++);
            return ans;
        }
    }


}
