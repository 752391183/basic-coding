package com.example.digui;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/*
  找到指定目录下以.java结尾的文件
 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        // createDir();
        getJAVAFile4(new File("c:\\a"));
    }

    //遍历文件，找出以.java结尾的文件
    public static void getJAVAFile(File file) {
        File[] files = file.listFiles(new FileFilterImpl());
        for (File f : files) {
            if (f.isDirectory()) {
             /*   System.out.println(f);*/
                getJAVAFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
    //使用匿名内部类简化(FileFilter接口)
    public static void getJAVAFile2(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".java");
            }
        });
        for (File f : files) {
            if (f.isDirectory()) {
                /*   System.out.println(f);*/
                getJAVAFile(f);
            } else {
                System.out.println(f);
            }
        }
    }

    //使用匿名内部类简化(FileNameFilter接口)
    public static void getJAVAFile3(File file) {
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return new File(file,s).isDirectory() || s.toLowerCase().endsWith(".java");
            }
        });
        for (File f : files) {
            if (f.isDirectory()) {
                /*   System.out.println(f);*/
                getJAVAFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
    //使用Lambda表达式优化
    public static void getJAVAFile4(File file) {
        File[] files = file.listFiles(ld ->  ld.isDirectory() || ld.getName().toLowerCase().endsWith(".java"));

        for (File f : files) {
            if (f.isDirectory()) {
                /*   System.out.println(f);*/
                getJAVAFile(f);
            } else {
                System.out.println(f);
            }
        }
    }


    //创建文件
    public static void createDir() throws IOException {
        File f = new File("c:\\a");
        f.mkdir();
        File f1 = new File("c:\\a\\b");
        f1.mkdirs();
        File f2 = new File("c:\\a\\b\\t.txt");
        f2.createNewFile();
        File f3 = new File("c:\\a\\c");
        f3.mkdir();
        File f4 = new File("c:\\a\\c\\d.java");
        f4.createNewFile();
        File f5 = new File("c:\\a\\c\\e.JAVA");
        f5.createNewFile();
        File f6 = new File("c:\\a\\d");
        f6.mkdir();
    }
}
