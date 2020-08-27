package com.example.heima.baozi;

public class ChiHuo extends Thread {
    private BaoZi baoZi;

    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.state == false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //唤醒后
                System.out.println("吃货正在吃"+ baoZi.pi+ baoZi.xian+"的包子");
                baoZi.state = false;
                baoZi.notify();
                System.out.println("包子吃完了，该去生产包子了！！");
                System.out.println("====================");
            }
        }
    }
}
