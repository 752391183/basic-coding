package com.example.heima.redpacket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int totleMoney) {
        super(name, totleMoney);
    }

    public void receive(ArrayList<Integer> list) {
        int index = new Random().nextInt(list.size());
        Integer detal = list.remove(index);
        int money = super.getTotleMoney();
        super.setTotleMoney(money + detal);
    }
}
