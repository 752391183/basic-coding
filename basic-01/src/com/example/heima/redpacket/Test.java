package com.example.heima.redpacket;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

/*
    实现平均发红包的功能
 */
public class Test {

    public static void main(String[] args) {
        Manager avge = new Manager("BOSS", 100);

        Member member1 = new Member("M1", 0);
        Member member2 = new Member("M2", 0);
        Member member3 = new Member("M3", 0);
        avge.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("=========================");

        ArrayList<Integer> list = avge.divide(20, 3);
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);
        avge.show();
        member1.show();
        member2.show();
        member3.show();

        Date data = new Date();
        System.out.println(data);


    }
}
