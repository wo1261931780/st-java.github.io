package leetcode.eee118�Լ�����2;

import java.util.Arrays;
import java.util.Random;

public class demo_max_min {
    /**
     * �������������֣��Զ��ж���ֵ��Ȼ�����
     */
    public static void main(String[] args) {
        Random x = new Random();
        int[] x2 = new int[5];
        for (int i = 0; i < x2.length; i++) {
            int x1 = x.nextInt(1000);
            x2[i] = x1;
        }

        System.out.println(Arrays.toString(x2));
        show(x2);
    }

    public static void show(int[] x2) {
        int max = x2[0];
        int min = x2[0];
        for (int i : x2) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println(max + "-" + min);
    }
}
