package com.example.heima.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主 :无序版本
 */
public class NoSort {
    public static void main(String[] args) {
        ArrayList<String> list = ready();
        wash(list);
        ArrayList<ArrayList<String>> arrayLists = give(list);
        watch(arrayLists);
    }

    /**
     * 看牌
     * @param arrayLists
     */
    private static void watch(ArrayList<ArrayList<String>> arrayLists) {
        for (int i = 0; i < 3; i++) {
            System.out.println("玩家" + i + "的牌为： " + arrayLists.get(i));
        }
        System.out.println("底牌是 " + arrayLists.get(3));
    }

    /**
     * 发牌
     * @param list
     * @return
     */
    private static ArrayList<ArrayList<String>> give(ArrayList<String> list) {
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i>=51) {
                dipai.add(list.get(i));
            }else if (i % 3 == 0) {
                player01.add(list.get(i));
            }else if (i % 3 == 1) {
                player02.add(list.get(i));
            }else if (i % 3 == 2) {
                player03.add(list.get(i));
            }
        }

        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        lists.add(player01);
        lists.add(player02);
        lists.add(player03);
        lists.add(dipai);
        return lists;
    }

    /**
     * 洗牌
     * @param list
     */
    private static void wash(ArrayList<String> list) {
        Collections.shuffle(list);
    }

    /**
     * 准备牌
     * @return ArrayList<String>
     */
    private static ArrayList<String> ready() {
        ArrayList<String> list = new ArrayList<>();
        String[] str = {"♦","♠","♣","♥"};
        String[] str2 = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String s : str) {
            for (String s1 : str2) {
                list.add(s+s1);
            }
        }
        list.add("大王");
        list.add("小王");
//        System.out.println(list);
        return list;
    }


}
