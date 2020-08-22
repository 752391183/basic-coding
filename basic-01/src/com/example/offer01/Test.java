package com.example.offer01;
/**
 * 找到一个二维数组中给定的数字，找到返回true,没找打返回false
 */
public class Test {
    public static void main(String[] args) {
        int [][] array = new int[3][3];
    }

    public static boolean Find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int rows = array.length;
        int cols = array[0].length;
        if (rows <= 0 || cols <= 0) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                 if(array[i][j] == target) {
                     return true;
                 }
            }
        }
        return false;
    }
}
