package com.example.heima.redpacket;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int totleMoney) {
        super(name, totleMoney);
    }

    public ArrayList<Integer> divide(int money, int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        if (money > super.getTotleMoney()) {
            System.out.println("您的余额不足");
            return redList;
        }
        super.setTotleMoney(super.getTotleMoney() - money);
        int avg = money / count;
        int left = money % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        redList.add(avg + left);
        return redList;
    }
}
