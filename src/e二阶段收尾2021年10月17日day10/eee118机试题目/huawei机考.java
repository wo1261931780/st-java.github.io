package e���׶���β2021��10��17��day10.eee118������Ŀ;

import java.util.Scanner;

public class huawei���� {
    public static void main(String[] args) {
        // ��һ������ a[N] ˳���� 0 ~ N-1 ��
        // Ҫ��ÿ��������ɾ��һ��������ĩβʱѭ������ͷ�������У�
        // �����һ����ɾ��������ԭʼ�±�λ�á�
        // �� 8 ���� (N=7) Ϊ�� :
        // �� 0��1��2��3��4��5��6��7 ����0 -> 1 -> 2 (ɾ��) -> 3 -> 4 -> 5 (ɾ��) -> 6 -> 7 -> 0 (ɾ��),
        // ���ѭ��ֱ�����һ������ɾ����
        // 1<=n<=1000;
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        int[] x2 = new int[x.nextInt()];
        for (int i = 0; i < x.nextInt(); i++) {
            x2[i] = i;
        }

    }

    public static void div(int[] x2) {
        for (int i = 0; i < x2.length; i++) {
            if (i % 3 == 0) {
                if (x2[i] == -1) {
                    i++;
                    x2[i] = -1;
                } else {
                    x2[i] = -1;
                }
            }
        }
    }
}
