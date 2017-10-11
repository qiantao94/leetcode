package main

import category.Arr

import java.util.Arrays

/**
 * Created by qiantao on 2017/2/3.
 * 示例程序
 */

fun main(args: Array<String>) {
    val arr = Arr.pascalTriangle(5)
    println(Arrays.deepToString(arr))
}
