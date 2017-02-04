package main;

import category.Array;

import java.util.Arrays;

/**
 * Created by qiantao on 2017/2/3.
 * 示例程序
 */
public class Main {

    public static void main(String args[]) {
        int[][] arr = Array.pascalTriangle(5);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Array.generate(5).toString());
    }
}
