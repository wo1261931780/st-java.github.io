package aaa001����ѧϰ����;

import java.util.Scanner;

public class aaa010����ˮ�ɻ��� {
    public static void main(String[] args) {
        System.out.println("���������Ϊ��");
        Scanner b11 = new Scanner(System.in);
        int xx = b11.nextInt();

        int count = 0;
        for (System.out.println("ѭ����ʼ��:" + xx); xx < 1000; xx++) {
            int x1 = xx / 100;
            int x2 = xx / 10 % 10;
            int x3 = xx % 10;
            if (xx == x1 * x1 * x1 + x2 * x2 * x2 + x3 * x3 * x3) {
                //ˮ�ɻ�������λʮλ��λ���ֵ�����֮��Ϊԭ��
                //����153��1+125+27=153
                System.out.println(xx);
                count++;
            } else {
            }
        }
        System.out.println("ˮ�ɻ�������" + count + "�������������");
    }
}
