package com.dlmu.offer;

/**
 * @Author: yezer
 * @Time: 2020/11/29
 * @Task: 例如输入字符串"I am a student. "，则输出"student. a am I"。
 */
public class Offer58_1 {

    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = strs.length - 1; i >= 0 ; i--) {
            if(strs[i].equals("")){
                continue;
            }
            res.append(strs[i] + " ");
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {

    }
}
