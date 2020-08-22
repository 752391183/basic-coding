package com.example.heima.usb;

public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void colse() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}
