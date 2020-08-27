package com.example.digui;

/*
  计算n的阶乘
 */
public class Demo02Test {
    public static void main(String[] args) {
        int i = jc(5);
        System.out.println(i);
    }

    public static int jc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jc(n - 1);
    }
}
