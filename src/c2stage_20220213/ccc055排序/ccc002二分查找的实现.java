package c2stage_20220213.ccc055����;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc055����
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-19-41  ������
 */
public class ccc002���ֲ��ҵ�ʵ�� {
    public static void main(String[] args) {
        int[] x = {1, 35, 4, 564, 8, 789, 7, 98, 687};
        Scanner x1 = new Scanner(System.in);
        int demonum = x1.nextInt();
        System.out.println("�����" + show(x, demonum));
    }

    public static int show(int[] x, int demo) {
        Arrays.sort(x);
        int start = 0;
        int end = x.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (demo > x[mid]) {
                start = mid+1;//���Ҳ࣬�м�ֵ��1
            } else if (demo < x[mid]) {
                end = mid-1;//��λ��������Ҫ�Ӽ��������ݼ��е��м�
            } else {
                System.out.println(Arrays.toString(x));
                System.out.println(demo + "," + mid);
                return mid;
            }
        }
        // System.out.println(Arrays.toString(x));
        return -1;


    }
}
