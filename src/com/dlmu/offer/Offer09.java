package com.dlmu.offer;

import java.util.Stack;

/**
 * @Author: yezer
 * @Time: 2020/11/9
 * @Task: 双栈实现队列
 */
public class Offer09 {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public Offer09(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead(){
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }

}
