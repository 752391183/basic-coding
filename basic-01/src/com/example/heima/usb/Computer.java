package com.example.heima.usb;

public class Computer {
    public void open() {
        System.out.println("打开电脑");
    }

    public void useAdvice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.colse();

    }

    public void close() {
        System.out.println("关闭电脑");
    }
}
