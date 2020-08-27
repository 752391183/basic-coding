package com.example.heima.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        //存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //存储花色
        List<String> colors = List.of("♦", "♠", "♣", "♥");
        List<String> numbers = List.of("3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A","2");

        int index = 0;
            for (String s1 : numbers) {
                for (String s : colors) {
                    poker.put(index, s + s1);
                    pokerIndex.add(index);
                    index++;
                }
        }
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"大王");
        pokerIndex.add(index);
 /*       System.out.println(pokerIndex);
        System.out.println(poker);*/

        Collections.shuffle(pokerIndex);

        ArrayList<Integer> dipai = new ArrayList<>();
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer integer = pokerIndex.get(i);
            if (i >= 51) {
                dipai.add(integer);
            } else if (i % 3 == 0) {
                player01.add(integer);
            } else if (i % 3 == 1) {
                player02.add(integer);
            } else if (i % 3 == 2) {
                player03.add(integer);
            }
        }

        //排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);
        //看牌
        lookPoker("周润发",poker,player01);
        lookPoker("周星驰",poker,player02);
        lookPoker("刘德华",poker,player03);
        lookPoker("底牌",poker,dipai);
    }

    public static void lookPoker(String name, HashMap<Integer, String> map, ArrayList<Integer> list) {
        System.out.print(name + "玩家的牌为: ");
        for (Integer key : list) {
            System.out.print(map.get(key) + " ");
        }
        System.out.println();//换行
    }
}
