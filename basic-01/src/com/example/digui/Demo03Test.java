package com.example.digui;
/*
  遍历目录
 */
import java.io.File;
/*
遍历目录：
  c:\\a\\b
  c:\\a\\b\\1.jpg
  c:\\a\\b\\2.txt
  c:\\a\\c
  c:\\a\\ac.txt
 */
public class Demo03Test {
    public static void main(String[] args) {
        File file = new File("C:\\a");
        System.out.println("遍历的目录：" + file);
        getAllFile(file);
/*        boolean b = file.delete();
        System.out.println(b);*/
    }

    public static void getAllFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(f);
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
