package com.example.Thread;

/*
  创建多线程的第一种方式：继承Thread类
 */
public class MyThread extends Thread {
 /*   public MyThread() {}
    //第二种设置线程名称
    public MyThread(String s) {
        super(s);
    }*/
    @Override
    public void run() {
       //获取线程的名称
        //  main Thread-0 Thread-1 Thread-2
       /* String s = getName();
        System.out.println(s);*/

        /*Thread thread = Thread.currentThread(); //获取当前线程
        String s = thread.getName();
        System.out.println(s);*/

       // System.out.println(Thread.currentThread().getName());
    }
}
