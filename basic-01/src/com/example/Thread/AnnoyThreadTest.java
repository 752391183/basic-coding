package com.example.Thread;
 /*
   匿名内部类实现多线程
  */
public class AnnoyThreadTest {
    public static void main(String[] args) {
        //继承子类的方式
/*        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "小培");
                }
            }
        }.start();*/

        //实现接口的方式
/*        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "XP");
                }
            }
        };
        new Thread(runnable).start();*/

        //简化实现接口的方式
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "肖淑培");
                }
            }
        }).start();*/

        //使用Lambda表达式
        new Thread(()-> {
            System.out.println(Thread.currentThread().getName() + "I LOVE YOU");
        }).start();
    }
}
