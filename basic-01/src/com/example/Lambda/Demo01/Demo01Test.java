package com.example.Lambda.Demo01;

import java.util.Arrays;
/*
   按年龄进行升序
 */
public class Demo01Test {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("小培", 18),
                new Person("XP", 16),
                new Person("肖淑培", 19),
        };

/*        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //前面-后面：升序
                return o1.getAge()-o2.getAge();
            }
        });*/
         //使用Lambda表达式简化代码
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //优化Lmabda表达式
        Arrays.sort(arr, (o1,o2) -> o1.getAge() - o2.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
