package com.example.Lambda.demo02;

/*
   计算两个值的和
 */
public class Demo02Test {
    public static void main(String[] args) {
      /*  invokeCal(10, 20, new Calculate() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        });*/
        //Lambda表达式简化开发
     /*   invokeCal(10, 20, (int a, int b) -> {
            return a + b;
        });
           }*/
        //优化Lambda表达式
        invokeCal(10, 20, (a, b) -> a + b);
    }

    //求和的方法
    public static void invokeCal(int a, int b, Calculate c) {
        int i = c.sum(a, b);
        System.out.println(i);
    }
}
