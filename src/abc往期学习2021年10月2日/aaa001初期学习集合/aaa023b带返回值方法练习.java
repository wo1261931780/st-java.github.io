package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Random;
import java.util.Scanner;

public class aaa023b������ֵ������ϰ {
    public static void main(String[] args) {
        System.out.println("------------------");
        //���÷���������һ�����֣�Ȼ�����������ַ��أ������ִ洢��xx1�С�
        int xx1 = demo2();
        //���÷����������������Ȼ������������xx1�Ž�������������Աȣ��жϴ�С
        int xx = demo1(xx1);
        System.out.println("��������Ϊ��" + xx1);
        System.out.println("�����Ϊ��" + xx);
    }

    public static int demo2() {
        Scanner x1 = new Scanner(System.in);
        System.out.println("���������ֽ��жԱȣ�");
        int x3 = x1.nextInt();

        return x3;
    }

    public static int demo1(int xx) {
        Random x2 = new Random();
        int x4 = x2.nextInt(100);
        if (xx <= x4) {
            System.out.println("������ϴ�");
        } else {
            System.out.println("�������С");
        }
        // xx = x3;
        return x4;
    }
    // ����ע�����
    /*
     * 1.����Ƕ�׶��塣
     * �ҵ�demo1��demo2�����������ģ�����demo1�ڲ���һ��demo2
     * 2.void��ʾû�з���ֵ��
     * public static void demo1(){}��void���Ǳ�ʾ����Ҫ���أ�int��ʾ��Ҫ����int���͵�
     * 3.void���Լ�return��Ҳ���Բ��ӡ�
     * ������return�����治������ݡ�ֻ��ֱ��return;�����дreturn 1;�ᱨ��
     */

}
