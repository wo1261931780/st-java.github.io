package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Random;
import java.util.Scanner;

public class aaa023d�������ص���ϰ {
    public static void main(String[] args) {
        System.out.println("----------------");
        Scanner xx1 = new Scanner(System.in);
        System.out.println("���������ݣ�");
        int xx2 = xx1.nextInt();
        Random xx3 = new Random();
        int xx4 = xx3.nextInt(100);
        int xx = demo1(xx2, xx4);
        System.out.println(xx);
    }

    public static int demo1(int x1, int x2) {
        if (x1 == x2) {
            System.out.println(x1 + "��" + x2 + "���������");
        } else {
            System.out.println(x1 + "��" + x2 + "�����ݲ����");
        }
        return x1 + x2;
    }
}
