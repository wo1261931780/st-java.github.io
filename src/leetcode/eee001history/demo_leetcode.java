package leetcode.eee001history;

import java.util.Scanner;

public class demo_leetcode {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (x.hasNextInt()) {//�Զ��ж��Ƿ������룬
            // ͬʱ������ѭ�����ظ���������
            int type_num = x.nextInt();
            run(type_num);
        }
    }

    public static int test_num(int x, int num) {
        // int x = 28;
        int j = 0;
        // int num = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                j += i;
            }
        }
        if (j == x) {
            num++;
        }
        return num;
    }

    public static void run(int type_num) {
        int num = 0;
        for (int i = 1; i <= type_num; i++) {
            // j = test_num(i, num);
            if (test_num(i, num) != num) {
                num++;
            }
        }
        System.out.println(num);
    }
}
