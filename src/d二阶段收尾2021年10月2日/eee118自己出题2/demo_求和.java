package d���׶���β2021��10��2��.eee118�Լ�����2;

import java.util.Arrays;
import java.util.Random;

public class demo_��� {
    public static void main(String[] args) {
        // �����У�������7������Ԫ�����
        // int[] x = {1, 7, 9, 10};
        int[] x = new int[10];
        sub(x);
        int x1 = 0;
        for (int i : x) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7 || i / 100 == 7) {
            } else {
                System.out.println(i);
                x1 += i;
            }
        }
        System.out.println(x1);
    }

    public static void sub(int[] x) {
        Random x1 = new Random();
        for (int i = 0; i < x.length; i++) {
            int x2 = x1.nextInt(1000);
            x[i] = x2;
        }
        System.out.println(Arrays.toString(x));
    }
}
