package com.dlmu.test;

/**
 * @Author: yezer
 * @Time: 2021/3/15
 * @Task:
 */
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("Start new Thread!");
    }
}
