package e���׶���β2021��10��17��day10.eee118�Լ�����1;

import java.util.Arrays;
import java.util.Scanner;

public class demo_jiecheng {
    public static void main(String[] args) {
        jc1();
        System.out.println("����");
    }

    public static void jc1() {
        Scanner x = new Scanner(System.in);
        System.out.println("���������֣�");
        int x3 = x.nextInt();
        // ArrayList<Object> xx = new ArrayList<>();
        int[] xx = new int[x3];
        xx[0] = 1;
        xx[1] = 1;
        for (int i = 2; i < x3; i++) {
            xx[i] = xx[i - 1] + xx[i - 2];
        }
        System.out.println(Arrays.toString(xx));
    }

    public static int jc2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return jc2(n - 1) + jc2(n - 2);
        }

    }
}
