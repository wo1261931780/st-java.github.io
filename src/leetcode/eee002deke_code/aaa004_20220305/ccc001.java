package leetcode.eee002deke_code.aaa004_20220305;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa004_20220305
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-12-48  星期六
 */
public class ccc001 {
    public static void main(String[] args) {
        int[] x = {987, 1, 564, 8, 7, 8, 9, 54};
        // 几个注意点：
        // 1.out：后面不可以接语句
        // 2.out以后，就不再进行循环
        OUT:
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 8) {
                System.out.println(i + "，循环中");
                break OUT;
            }
        }
        System.out.println("结束");
        show1();
    }

    public static void show1() {
        Scanner x = new Scanner(System.in);
        int demo = x.nextInt(3);
        System.out.println(demo);
    }
}
