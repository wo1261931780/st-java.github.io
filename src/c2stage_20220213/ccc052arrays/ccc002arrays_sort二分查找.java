package c2stage_20220213.ccc052arrays;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc052arrays
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-55  ���ڶ�
 */
public class ccc002arrays_sort���ֲ��� {
    public static void main(String[] args) {
        int[] x = {23, 12, 3, 5, 4, 54, 98, 789};
        Arrays.sort(x);
        System.out.println("�������飺" + Arrays.toString(x));// [3, 4, 5, 12, 23, 54, 98, 789]
        // ******************************************
        int indexdemo = Arrays.binarySearch(x, 5);// 2�����ﷵ�صľ���index�����ǳ��������ϵĵڼ�������
        System.out.println("5��������" + indexdemo);
        int testindex = Arrays.binarySearch(x, 100);
        System.out.println("100��������" + testindex);// -8�������ڵ����֣�����Ӧ�ò���λ��-1
        // ������
        // 100��98���棬index��Ӧ����˳��7��ʵ����7����789��
        // ����100�����ڣ�������indexΪ-7�����Ǹ���-7-1=-8

    }
}
