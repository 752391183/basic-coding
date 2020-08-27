package com.example.digui;
/*
   递归计算1-n的和
 */
public class Demo01Test {
    public static void main(String[] args) {
        int i = sum(3);
        System.out.println(i);
    }

    public static int sum(int n) {
        //递归结束条件
        if(n==1) {
            return 1;
        }
        return n + sum(n-1);
    }
}
