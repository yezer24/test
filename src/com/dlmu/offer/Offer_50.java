package com.dlmu.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yezer
 * @Time: 2021/2/26
 * @Task:
 */
public class Offer_50 {

    public static char firstUniqChar(String s) {

        Map<Character, Boolean> map = new HashMap<>();
        char[] array = s.toCharArray();

        for (char c : array) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : array){
            Boolean flag = map.get(c);
            if(flag == true){
                return c;
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        String str = "abaccdeff";
        char temp = Offer_50.firstUniqChar(str);

        System.out.println("char = " + temp);
    }
}
