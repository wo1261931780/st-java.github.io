package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;
import java.util.Random;

public class aaa019���������ж���ż {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int x1 = xx.nextInt();
        Random zz = new Random();
        int z1 = zz.nextInt(100);

        System.out.println("��ʼ�ж�");
        /*max(10);
        boolean xx = max(11);
        System.out.println(xx);
        */
        xs(x1);
        jo(z1);
    }

    //�ж���ż���ķ���
    public static boolean max(int yy) {
        if (yy % 2 == 0) {
            return true;
            // System.out.println("ż��");
        } else {
            return false;
            // System.out.println("����");
        }
    }

    //����С����ķ���
    public static double xs(double x1) {
        System.out.println("����С�����������ǣ�" + x1);
        return x1;
    }

    //�ж���ż���ķ���
    public static void jo(int z1) {
        if (z1 % 2 == 0) {
            System.out.println(z1 + "��ż��");
        } else {
            System.out.println(z1 + "������");
        }
    }
}
