package category;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Created by qiantao on 2017/2/3.
 * 数组
 */
public class Array {

    /**
     * 判断数组是否有重复
     * 217. Contains Duplicate
     *
     * @param arr 数组
     * @return 是否重复
     */
    public static Boolean containsDuplicate(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//        for (int a : arr) {
//            if (!set.add(a)) return true;
//        }
//        return false;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) return true;
        }
        return false;
    }

    /**
     * 从一个数组移除指定的value，并返回数组的长度，且不新建数组
     *
     * @param arr  数组
     * @param elem 指定value
     * @return 数组长度
     */
    public static int removeElement(int[] arr, int elem) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elem) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    /**
     * 从一个排序好的数组中移除重复的元素，并返回数组的长度，且不新建数组
     *
     * @param arr 排序好的数组
     * @return 数组长度
     */
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] != arr[i]) {
                arr[++index] = arr[i];
            }
        }
        return ++index;
    }

    /**
     * 从一个排序好的数组中移除超过两次的元素，并返回数组的长度，且不新建数组
     *
     * @param arr 排序好的数组
     * @return 数组长度
     */
    public static int removeDuplicates2(int[] arr) {
        int index = 0;
        for (int a : arr) {
            if (index < 2 || a > arr[index - 2]) {
                arr[index++] = a;
            }
        }
        System.out.println(Arrays.toString(arr));
        return index;
    }

    /**
     * 用数组存放一个整数，输出这个整数加一后的数组
     *
     * @param digits 原数组
     * @return 结果数组
     */
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[len + 1];
        newDigits[0] = 1;

        return newDigits;
    }


    /**
     * 杨辉三角
     *
     * @param height 高度
     * @return 杨辉三角数组
     */
    public static int[][] pascalTriangle(int height) {
        int[][] arrs = new int[height][height];
        for (int i = 0; i < height; i++) {
            arrs[i][0] = 1;
            arrs[i][i] = 1;
            for (int j = 1; j < height; j++) {
                if (i > 1) {
                    arrs[i][j] = arrs[i - 1][j - 1] + arrs[i - 1][j];
                }
            }
        }
        return arrs;
    }
}
