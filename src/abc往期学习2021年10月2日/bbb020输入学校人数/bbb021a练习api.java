package abc����ѧϰ2021��10��2��.bbb020����ѧУ����;

import java.util.Scanner;

public class bbb021a��ϰapi {
    public static void main(String[] args) {
        System.out.println("��ϰapi");
        Scanner xx = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String x1 = xx.nextLine();
        System.out.println("��������ַ���Ϊ��" + x1);

        char[] s1 = {'a', 'b', 'c'};
        byte[] s2 = {97, 98, 99};
        System.out.println("s1����Ϊ��" + s1);
        // ���ﶨ���s1��s2�������飬ֱ�ӻ�ȡֻ��õ����ݵĵ�ַ
        System.out.println("s2����Ϊ��" + s2);
        System.out.println("---------------------------");
        String a1 = new String(s1);
        // ����ʹ��a1�ַ���ȥ����s1���ͻ�õ�s1�����е������ַ���
        // s1�Ὣ�����е��ַ���ƴ�ӵ�һ��
        String a2 = new String(s2);
        String a3 = "abc";
        System.out.println("s1����Ϊ��" + a1);
        System.out.println("s2����Ϊ��" + a2);
        System.out.println(a3);
        // ��Ҫ˵�����ǣ������ַ���֮���˫�Ⱥţ�ֻ�ǱȽϵ�ַ�Ƿ���ͬ��������ͬ����ʹ��equals
        // �����������������������
        String d1 = "ss";
        String d2 = "ss";
        // ����Ľ��Ϊtrue
        System.out.println(d1 == d2);
        // ����һ��ԭ��
        // 1.�ڶ��ڴ�������һ��ss�ַ�����ͬʱ�ַ����Զ�����һ����ַ��ֵ��
        // �����ݺ͵�ַ��ֵͬʱ��d1
        // 2.ͬ���Ĳ�����d2����һ�Σ����յ���d1��d2�ĵ�ַ��ͬ

    }
}
