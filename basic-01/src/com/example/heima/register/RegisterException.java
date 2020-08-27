package com.example.heima.register;

/*
   自定义异常类
 */
public class RegisterException extends Exception {
    public RegisterException() {
        super();
    }

    public RegisterException(String message) {
        super(message);
    }
}
