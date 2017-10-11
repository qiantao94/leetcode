package category

import java.util.Arrays

/**
 * Created by qiantao on 2017/2/3.
 * 数组
 */
object Arr {

    /**
     * 从一个数组移除指定的value，并返回数组的长度，且不新建数组
     *
     * @param arr  数组
     * @param elem 指定value
     * @return 数组长度
     */
    fun removeElement(arr: IntArray, elem: Int): Int {
        var index = 0
        for (i in arr.indices) {
            if (arr[i] != elem) {
                arr[index] = arr[i]
                index++
            }
        }
        return index
    }

    /**
     * 从一个排序好的数组中移除重复的元素，并返回数组的长度，且不新建数组
     *
     * @param arr 排序好的数组
     * @return 数组长度
     */
    fun removeDuplicates(arr: IntArray): Int {
        if (arr.isEmpty()) {
            return 0
        }
        var index = 0
        arr.indices.asSequence()
                .filter { arr[index] != arr[it] }
                .forEach { arr[++index] = arr[it] }
        return ++index
    }

    /**
     * 从一个排序好的数组中移除超过两次的元素，并返回数组的长度，且不新建数组
     *
     * @param arr 排序好的数组
     * @return 数组长度
     */
    fun removeDuplicates2(arr: IntArray): Int {
        var index = 0
        arr.asSequence()
                .filter { index < 2 || it > arr[index - 2] }
                .forEach { arr[index++] = it }
        println(Arrays.toString(arr))
        return index
    }

    /**
     * 用数组存放一个整数，输出这个整数加一后的数组
     *
     * @param digits 原数组
     * @return 结果数组
     */
    fun plusOne(digits: IntArray): IntArray {
        val len = digits.size
        for (i in len - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }

            digits[i] = 0
        }

        val newDigits = IntArray(len + 1)
        newDigits[0] = 1

        return newDigits
    }


    /**
     * 杨辉三角
     *
     * @param height 高度
     * @return 杨辉三角数组
     */
    fun pascalTriangle(height: Int): Array<IntArray> {
        val arr = Array(height) { IntArray(height) }
        for (i in 0 until height) {
            arr[i][0] = 1
            arr[i][i] = 1
            for (j in 1 until height) {
                if (i > 1) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]
                }
            }
        }
        return arr
    }
}
