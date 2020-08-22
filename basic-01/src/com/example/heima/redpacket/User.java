package com.example.heima.redpacket;

public class User {
    private String name;
    private int totleMoney;

    public User() {
    }

    public User(String name, int totleMoney) {
        this.name = name;
        this.totleMoney = totleMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotleMoney() {
        return totleMoney;
    }

    public void setTotleMoney(int totleMoney) {
        this.totleMoney = totleMoney;
    }

    public void show() {
        System.out.println("我叫"+ name + ", 余额为： " + totleMoney );
    }
}
