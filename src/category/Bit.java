package category;

import java.util.Arrays;

public class Bit {

    /**
     * 汉明距离
     * 461. Hamming Distance
     */
    public static int hammingDistance(int x, int y) {
//        char[] a = Integer.toBinaryString(x).toCharArray();
//        char[] b = Integer.toBinaryString(y).toCharArray();
//        int d = Math.abs(a.length - b.length);
//        int count = d;
//        if (a.length > b.length) {
//            for (int i = 0; i < a.length; i++) {
//                if (i < d && a[i] == '0') count--;
//                if (i >= d && a[i] != b[i - d]) count++;
//            }
//        } else {
//            for (int i = 0; i < b.length; i++) {
//                if (i < d && b[i] == '0') {
//                    count--;
//                }
//                if (i >= d && a[i - d] != b[i]) count++;
//            }
//        }
//        return count;
        int result = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((result & (1 << i)) > 0) count++;
        }
        return count;
    }

    /**
     * 二进制中1的个数
     */
    public static int numberOf1InBinary(int number) {
        int count = 0;
//        int flag = 1;
//        while (flag > 0) {
//            if ((flag & number) > 0) {
//                count++;
//            }
//            flag <<= 1;
//        }
//        return count;
        while (number > 0) {
            count++;
            number &= number - 1;
        }
        return count;
    }
}
