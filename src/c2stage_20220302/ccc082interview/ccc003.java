package c2stage_20220302.ccc082interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc082interview
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-08-38  ������
 */
public class ccc003 {
    public static void main(String[] args) {
        // int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        // int[] demo = show1(x);
        // System.out.println(Arrays.toString(demo));
        // int[] x1 = {3, 6, 9, 1, 2, 6};
        // int demo = show2(x1);
        // System.out.println(demo);
        int[] x={343,846,489,661,295,422,774,525,345};
        int[] result1 = show1(x);
        int result2 = show2(result1);
        show3(result2);

    }

    public static int[] show1(int[] x) {
        int[] x1 = new int[2];
        if (x.length < 2) {
            return x;
        }// ���Ȳ����㣬���ر���

        for (int i = 0; i < x.length; i++) {
            if (x[i] < 36) {
                int result = 36 - x[i];
                for (int j = i; j < x.length; j++) {
                    if (x[j] == result) {
                        x1[0] = i;
                        x1[1] = j;
                        return x1;// ����Ҫ�󣬷��ؽ��
                    }
                }
            }
        }
        x1[0] = x[0];
        x1[1] = x[1];
        return x1;// ����ǰ����Ԫ��
    }

    public static int show2(int[] x) {
        if (x.length < 2) {
            return 0;
        }
        Arrays.sort(x);// ��������
        // 1.ѡ��7������
        // 2.�ҳ���ֵ���
        // 3.����ĳ��ȿ��Ա仯

        ArrayList<Integer> list = new ArrayList<>();
        if (x.length > 7) {
            for (int i = 0; i < 7; i++) {
                list.add(x[i]);
            }
        } else {
            for (int i = 0; i < x.length; i++) {
                list.add(x[i]);
            }
        }//�������
        int cz1 = 0;
        int cz2 = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size() - 1; j++) {
                cz1 = list.get(i + 1) - list.get(i);//��ȡ��ֵ
                cz2 = list.get(j + 1) - list.get(j);
                if (cz1 < cz2) {
                    cz1 = cz2;
                    return cz1;
                }
            }
        }
        return cz1;
    }

    public static int[] show3(int x) {
        x = Math.abs(x);//����ֵ
        String x1 = x + "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < x1.length(); i++) {
                list.add(x1.charAt(i) - '0');// ��ת��Ϊ����
            }
        }
        //�����������
        int[] x2 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            x2[i] = list.get(i);
        }
        // ����Ϊ����
        // System.out.println(list);
        System.out.println(Arrays.toString(x2));
        return x2;
    }

}
