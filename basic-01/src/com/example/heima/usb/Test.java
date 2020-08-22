package com.example.heima.usb;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();
        //多态写法
        USB usb = new Mouse();
        computer.useAdvice(usb);

        //普通写法
        Keyboard keyboard = new Keyboard();
        computer.useAdvice(keyboard);

        computer.close();
    }
}
