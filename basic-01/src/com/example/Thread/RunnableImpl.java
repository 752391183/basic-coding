package com.example.Thread;
/*
   创建多线程的第二种方式：实现Runnable接口
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
