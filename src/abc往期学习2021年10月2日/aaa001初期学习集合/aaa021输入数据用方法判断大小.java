package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;
import java.util.Random;

public class aaa021���������÷����жϴ�С {
    public static void main(String[] args) {
        max(10);//mm��ֵ�Ƕ��ٶ�����Ҫ�������x1��z1���бȽ�
    }

    public static void max(double mm) {
        Scanner xx = new Scanner(System.in);
        Random zz = new Random();
        System.out.println("������Ƚ�ֵ��");
        double x1 = xx.nextInt();
        double z1 = zz.nextInt(1000);

        if (x1 > z1) {
            mm = x1;
            System.out.println("�ϴ�ֵΪ��" + mm);
        } else {
            mm = z1;
            System.out.println("�ϴ�ֵΪ��" + mm);
        }
    }
}
