package c2stage_20220302.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.demo
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-18-44  ������
 */
public class ccc002 {
    public static void main(String[] args) {
        int[] x={3,6,9,1,2,6};
        int r1 = show1(x);
        System.out.println(show1(x));
        System.out.println("-------------");
        int r2 = show2(r1);
        System.out.println(r2);
        System.out.println("-------------");

        show3(r2);

    }

    public static int show1(int[] x) {
        // 1.Ԫ�ظ���
        // 2.��Ʊ�۸�
        // 3.ӯ������
        // 4.�����Ѽ���
        // 5.���ؽ��

        if (x.length > 2) {
            // int start=0;
            // int end=0;
            int profit=0;
            for (int i = 0; i < x.length-1; ) {

                for (int j = i+1; j < x.length-1; j++) {
                    int start=x[i];
                    int end=x[j];
                    if (end>x[j+1]){
                        profit+=end-start-2;
                        i=j+1;
                    }else if (j==x.length-2){
                        profit+=x[j+1]-start-2;
                        return profit;
                    }
                }
            }
            return profit;
        }
        return 0;
    }

    public static int show2(int x) {
        // 1.����ֵ����
        // 2.��ӣ����ؽ��
        // 3.�������
        // if (x - 2 < 0) {
        //     x = 2;
        // } else {
        //     x = Math.abs(x);
        // }
        x = x - 2 < 0 ? 2 : Math.abs(x);
        String x1 = x + "";
        int num = 0;
        char[] demo1 = x1.toCharArray();

        for (int i = 0; i < demo1.length; i++) {
            int i1 = demo1[i] - 48;
            num += i1;
        }
        if (num > 10) {
            num = show2(num);
        }
        // System.out.println(num);
        return num;
    }

    public static void show3(int x) {
        // 1.��ȡ����ֵ
        // 2.����׳�
        // 3.����Լ��
        // 4.��������
        int num = 1;
        for (int i = 1; i <= x; i++) {
            num *= i;
        }
        // System.out.println(num);
        ArrayList<Integer> x1 = new ArrayList<>();
        for (int i = 1, j = 0; i < 5; i++, j++) {
            if (num % i == 0) {
                x1.add(i);
            }
        }
        // System.out.println(x1.size());
        System.out.println("------------------");
        int[] x2 = new int[x1.size()];
        for (int i = 0; i < x1.size(); i++) {
            x2[i] = x1.get(i);
        }
        System.out.println(Arrays.toString(x2));
    }
}
