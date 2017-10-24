package category;

/**
 * Created by qiantao on 2017/10/24 0024
 */

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int f1 = 1;
        int f2 = 0;
        int fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = f1 + f2;
            f2 = f1;
            f1 = fn;
            System.out.println("fn: " + fn);
        }
        return fn;
    }
}
