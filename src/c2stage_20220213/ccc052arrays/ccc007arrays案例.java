package c2stage_20220213.ccc052arrays;
/*
    ����
        ��һ���ַ�������91 27 46 38 50������д����ʵ�������������ǣ���27 38 46 50 91��

    ˼·��
        1:����һ���ַ���
        2:���ַ����е��������ݴ洢��һ��int���͵�������
            �õ��ַ�����ÿһ���������ݣ�
                public String[] split(String regex)
            ����һ��int���飬�� String[] �����е�ÿһ��Ԫ�ش洢�� int ������
                public static int parseInt?(String s)
        3:�� int �����������
        4:��������int�����е�Ԫ�ؽ���ƴ�ӵõ�һ���ַ���������ƴ�Ӳ���StringBuilder��ʵ��
        5:������
 */

import java.util.Arrays;

public class ccc007arrays���� {
    public static void main(String[] args) {
        // string�����У��ո�Ҳ���������
        String x = "12 5 456 465 968 65 4 84 8 8 748 48 668";
        // System.out.println(x);
        String[] x1 = x.split(" ");
        // �Զ�����string���͵�����
        int[] x2 = new int[x1.length];
        for (int i = 0; i < x1.length; i++) {
            x2[i] = Integer.parseInt(x1[i]);
        }
        Arrays.sort(x2);
        System.out.println("���ص�ƴ��ֵΪ��" + orderss(x2));
    }

    public static StringBuilder orderss(int[] x) {
        StringBuilder x1 = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            if (i == x.length) {
                x1.append(x[i]);
            } else {
                x1.append(x[i]).append(" ");
            }
        }
        return x1;
    }
}
