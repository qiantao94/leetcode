package category;

/**
 * Created by qiantao on 2017/2/3.
 * 数组
 */
public class Array {

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
     * 从一个排序好的数组中移除重复超过两次的元素，并返回数组的长度，且不新建数组
     *
     * @param arr 排序好的数组
     * @return 数组长度
     */
    public static int removeDuplicates2(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] == arr[i]) {
                count++;
                if (count > 2) {
                    arr[index] = arr[i];
                }
            } else {
                arr[++index] = arr[i];
                count = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return ++index;
    }


}
