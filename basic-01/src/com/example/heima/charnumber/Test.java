package com.example.heima.charnumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        HashMap<Character, Integer> map = getCharNumber(str);
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

    /**
     * String中每个字符的个数
     * @param str
     * @return
     */
    private static HashMap<Character,Integer> getCharNumber(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] array = str.toCharArray();
        for (char c : array) {
            if (map.containsKey(c)) {
                Integer integer = map.get(c);
                integer++;
                map.put(c,integer);
            }else {
                map.put(c,1);
            }
        }
        return map;
    }

}
