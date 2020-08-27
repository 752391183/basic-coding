package com.example.Thread;

public class ThreadTest {
    public static void main(String[] args) {
        //创建子类对象
        MyThread myThread = new MyThread();
        //开启线程
        // myThread.setName("小培"); //第一种设置线程名称的方法
        myThread.start();
        System.out.println(myThread.getName());
        /* new MyThread().start();
        new MyThread().start();*/
        /*
        主线程（不能直接通过getName方法获得线程名，测试类并没有继承Thread类，
               通过获取当前线程再获取线程名)
         */
         /* String s = Thread.currentThread().getName();
          System.out.println(s);*/
    }
}
