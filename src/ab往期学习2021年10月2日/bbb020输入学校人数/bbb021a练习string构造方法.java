package ab����ѧϰ2021��10��2��.bbb020����ѧУ����;

import java.util.Scanner;

public class bbb021a��ϰstring���췽�� {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String x1 = xx.nextLine();
        System.out.println("��������ַ���Ϊ��" + x1);

        char[] s1 = {'a', 'b', 'c'};
        byte[] s2 = {97, 98, 99};
        System.out.println("s1����Ϊ��" + s1);
        System.out.println("s2����Ϊ��" + s2);
        // ���ﶨ���s1��s2�������飬ֱ�ӻ�ȡֻ��õ����ݵĵ�ַ


        String a1 = new String(s1);//ͨ��newһ��string�����������е��ַ�������
        System.out.println("s1����Ϊ��" + a1);//s1����Ϊ��abc
        // ����ʹ��a1�ַ���ȥ����s1���ͻ�õ�s1�����е������ַ���
        // s1�Ὣ�����е��ַ���ƴ�ӵ�һ��
        String a2 = new String(s2);
        // s1��s2���������Ͳ�ͬ��һ����char��һ����byte��
        // ����tostring�Ĺ����У��Զ����������һ��ת��
        System.out.println("s2����Ϊ��" + a2);//s2����Ϊ��abc


        String a3 = "abc";
        System.out.println(a3);
        // ��Ҫ˵�����ǣ������ַ���֮���˫�Ⱥţ�ֻ�ǱȽϵ�ַ�Ƿ���ͬ��������ͬ����ʹ��equals
        // �����������������������
        String d1 = "ss";
        String d2 = "ss";

        System.out.println(d1 == d2);// ���Ϊtrue
        // ����һ��ԭ��
        // 1.�ڶ��ڴ��еĳ����أ�����һ��ss�ַ�����ͬʱ�ַ����Զ�����һ����ַ��ֵ��
        // ��ֵ�Ĺ����У������ݺ͵�ַ��ֵͬʱ��d1
        // 2.ͬ���Ĳ�����d2����һ�Σ����յ���d1��d2�ĵ�ַ��ͬ������Ҳ��ͬ
    }
}
