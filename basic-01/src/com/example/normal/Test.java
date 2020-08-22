package com.example.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        method4(list1);
        method4(list2);
    }

    //泛型的通配符
   /* private static <E> void method4(ArrayList<E> arrayList) {
        for (E e : arrayList) {
            System.out.println(e);
        }
    }*/
    private static  void method4(ArrayList<?> arrayList) {
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
    }

    //字符串String和Stringbuilder的相互转换
    private static void method3() {
        String str = "hello";
        System.out.println("str： " + str);
        StringBuilder builder = new StringBuilder(str);
        builder.append("world");
        System.out.println("builder： " + builder);
        System.out.println(str.equals(builder)); //false
        String s = builder.toString();
        System.out.println("s： " + s);
        System.out.println(s.equals(builder));  //false
        System.out.println(s.equals(str)); //false
    }

    //数组的复制
    private static void method2() {
        int[] arryA = {1, 2, 3, 4, 5};
        int[] arryB = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arryB));
        System.arraycopy(arryA, 0, arryB, 0, 3);
        System.out.println(Arrays.toString(arryB));

    }

    //测试程序运行时间
    private static void method1() {
        long firstTime = System.currentTimeMillis();

        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long lastTime = System.currentTimeMillis();
        long time = lastTime - firstTime;
        System.out.println("程序共耗时 " + time + "毫秒");
    }

}
