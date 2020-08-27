package com.example.heima.register;

import java.util.Scanner;

/*
    模拟注册用户名功能，如果存在返回自定义异常，RegisterException
 */
public class Test {
    static String[] userNames = {"张三", "王五", "赵四"}; //模拟已经存在的用户名（后期用数据库）

    public static void main(String[] args) /*throws RegisterException*/ {
        System.out.println("请输入注册的用户名：");
        Scanner sc = new Scanner(System.in);
            String userName = sc.next();
            checkName(userName);
    }

    //遍历数组，查找是否有相同的用户名
    public static void checkName(String userName) /*throws RegisterException*/ {
        for (String name : userNames) {
            if (name.equals(userName)) {
                try {
                    throw new RegisterException("亲，该用户名已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜您，注册成功!");
    }
}
