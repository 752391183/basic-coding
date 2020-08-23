package com.example.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
  /*      ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        method4(list1);
        method4(list2);*/
        method5();
    }

    private static void method5() {
        /*
           在Java中，String 、Math、还有baiInteger、Double。。。。等这些封装类重写了Object中的duequals()方法，
           让它不再比zhi较其对象dao在内存中的地址，而是比较对象中实际包含的整数的值，即比较的是内容。
           再强调一次，Object的equals()方法比较的是地址值，
           所以Object equals相等时，其hashcode必然相等，因为都是对象的地址，
           所以自己定义的类如果要加入到集合类中一定要记得重写这两个方法。
         */
        Person p1 = new Person();
        p1.setName("aaa");
        Person p2 = new Person();
        p2.setName("aaa");
        System.out.println(p1 == p2);  //false
        System.out.println(p1.equals(p2));  //false
        System.out.println("=================");

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());  //96354
        System.out.println(s2.hashCode());  //96354
        System.out.println(s1 == s2);  //false
        System.out.println(s1.equals(s2)); //true
        System.out.println("===============");

        String s3 = "aaa";
        String s4 = "aaa";
        System.out.println(s3 == s4);  //true
        System.out.println(s3.equals(s4)); //true
    }


    //泛型的通配符
   /* private static <E> void method4(ArrayList<E> arrayList) {
        for (E e : arrayList) {
            System.out.println(e);
        }
    }*/
    private static void method4(ArrayList<?> arrayList) {
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
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
