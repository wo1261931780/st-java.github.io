package c2stage_20220326.ccc089Variable_parameters;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-12-13  ������
 */
public class ccc001�ɱ���� {
    public static void main(String[] args) {
        show(123);
        show(222);
        show(222, 123, 1234123456);
        show(new int[2]);
        show(123123, 12, 31, 23, 123);
        show(12, 12, 3, 12, 31);
    }

    public static void show(int... num) {
        // ����ĸ�ʽ�ǣ�int���͵����飬����ĳ��ȺͲ���������
        // �ɱ������ʵ���Ͼ��ǽ�num��Ϊint���ͣ�
        // Ȼ��num��������һ�����飬�������ĳ��ȺͲ����ɱ�
        System.out.println("������" + num);
        System.out.println("�������ȣ�" + num.length);
        System.out.println(Arrays.toString(num));
    }

    public static void show2(int x, int... demo) {
        // �ɱ����ֻ�����ڲ���һ����
        // ���ǿɱ������Ӱ�쵥�������Ĵ���
    }

    // public static void show2(int... demo,int x2) {
    // �ɱ�����ŵ�ǰ��ûӰ�죬���Ƿŵ����治���ԣ�
    // ���еĲ�������Ĭ�ϱ��ɱ��������
    // }
    // public static void show2(int x, int... demo,int x2) {
    // ͬ������Ҳ���ܷŵ�����
    // }
    public static void show2(int x, int x2, int... demo) {
        // ���Կɱ�����ŵ�ǰ��ûӰ�죬���Ƿŵ����治��
    }
}
