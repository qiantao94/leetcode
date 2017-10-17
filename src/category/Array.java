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

    /**
     * 计算岛的边长
     *
     * 463. Island Perimeter
     */
    public static int islandPerimeter(int[][] grid){
        int count = 0;
        int n = 0;
        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    count ++;
                    if(i < grid.length - 1 && grid[i + 1][j] == 1) n++;
                    if(j < grid[i].length - 1 && grid[i][j + 1] == 1) n++;
                }
            }
        }
        return count * 4 - n * 2;
    }

    /**
     * 一个数组中的所有的数都重复两次，除了一个数，找出这个数
     * 136. Single Number
     */
    public static int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (i < nums.length - 1) {
//                if (i == 0 && nums[i] != nums[i + 1]) return nums[i];
//                else if (i > 0 && nums[i] != nums[i + 1] && nums[i - 1] != nums[i]) return nums[i];
//            } else {
//                return nums[i];
//            }
//        }
//        return nums[0];
        int ans =0;
        int len = nums.length;
        for(int i=0;i!=len;i++)
            ans ^= nums[i];
        return ans;
    }

    /**
     * 数组范围[1,n] n是数组大小，数组中有重复出现两次的数，也就有缺失的数，找到缺失的数
     * 448. Find All Numbers Disappeared in an Array
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] exists = new boolean[nums.length + 1];
        for (int i = 0; i < exists.length; i++) {
            exists[nums[i]] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!exists[i]) result.add(i);
        }
        return result;
    }
}
