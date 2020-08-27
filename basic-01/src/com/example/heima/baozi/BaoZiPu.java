package com.example.heima.baozi;

public class BaoZiPu extends Thread {
    private BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        //一直生产
        while (true) {
            synchronized (baoZi) {
                //如果有包子
                if (baoZi.state == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //唤醒后执行
                if (count % 2 == 0) {
                    baoZi.pi = "薄皮";
                    baoZi.xian = "三鲜馅";

                } else {
                    baoZi.pi = "冰皮";
                    baoZi.xian = "牛肉大葱";
                }
                count++;
                System.out.println("包子铺正在生成" + baoZi.pi + baoZi.xian + "的包子");
                //需要三秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //修改包子状态为有
                baoZi.state = true;
                baoZi.notify();
                System.out.println("包子做好了！！");
            }
        }
    }
}