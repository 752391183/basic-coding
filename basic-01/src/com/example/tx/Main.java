package com.example.tx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a; i++) {
             arrayList.add(sc.nextInt());
        }
     /*   Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next==b) {
                iterator.remove();
            }
        }*/
        arrayList.remove(Integer.valueOf(b));
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}