package leetcode.eee002deke_code.aaa005_20220309interview;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa005_20220309interview
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-27  ������
 */
public class ccc {
    public static void main(String[] args) {
        // 1.��������8��9
        // 2.��С����9�������е�λ��
        int[] x = {9, 8, 9, 9, 8, 8, 8, 9};
        Arrays.sort(x);//����
        System.out.println(Arrays.toString(x));// [8, 8, 8, 8, 9, 9, 9, 9]
        int mid = x.length / 2;
        System.out.println(show(x, mid));// 4
    }

    public static int show(int[] x, int mid) {
        for (int i = mid; i < x.length; i++) {
            if (x[i] == 8) {
                int demo = mid / 2;
                mid += demo;
                show(x, mid);//�ݹ�
            } else {
                for (int j = mid; j < x.length; j--) {
                    if (x[j] == 8) {
                        return j + 1;
                    }
                }
            }
        }
        return mid;
    }
}
