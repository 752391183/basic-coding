package com.example.heima.birthday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为：yyyy-MM-dd");
        String dateTimeString = sc.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date  dateTimeDate = null;
        try {
            dateTimeDate = simpleDateFormat.parse(dateTimeString);
        } catch (ParseException e) {
            System.out.println("输入格式不匹配，请重新输入!!");
        }
        long time = dateTimeDate.getTime();   //获取出生日期的毫秒值
        long localTime = new Date().getTime();  //获取当前日期的毫秒值
        long days = (localTime - time)/1000/60/60/24; //毫秒换算成天

        System.out.println("您已经出生了 " + days + " 天");

        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
    }
}
