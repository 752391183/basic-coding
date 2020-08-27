package com.example.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new RunnableImpl());
        service.submit(new RunnableImpl());
        service.submit(new RunnableImpl());
        //关闭线程池，不建议使用
        //service.shutdown();
        service.submit(new RunnableImpl());
    }
}
