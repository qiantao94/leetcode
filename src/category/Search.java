package category;

/**
 * Created by qiantao on 2017/10/25 0025
 */

public class Search {

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] < target) low = mid + 1;
            if (nums[mid] > target) high = mid - 1;
            if (nums[mid] == target) return mid;
        }
        return -1;
    }
}
