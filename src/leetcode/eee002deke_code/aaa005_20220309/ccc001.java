package leetcode.eee002deke_code.aaa005_20220309;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa005_20220309
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-38  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        int[] x = {452, 3, 54, 98, 7, 987, 9, 7, 79, 78, 7, 894, 62, 132, 1};

        // show1(x);// ֱ��ʹ��arrays����
        // show2(x);// �����˲��������˼��
        // show3(x);// ������set���ϵ�˼��,����set����û���ظ�Ԫ��
        show4(x);// �����˲��������˼��


    }

    public static void show1(int[] x) {
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }

    public static void show2(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }

    public static void show3(int[] x) {
        Set<Integer> demo1 = new LinkedHashSet<>();
        for (int i = 0; i < x.length; i++) {
            demo1.add(x[i]);
        }
        System.out.println(demo1);

    }

    public static void show4(int[] x) {
        // int x1 = x.length / 2;
        for (int i = 0, mid = 0; i < x.length-1; i++) {
            for (int j = i; j < x.length - i - 1; j++) {
                if (x[j] > x[j+1]) {
                    mid = x[j];
                    x[j] = x[j+1];
                    x[j+1] = mid;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }

}
