package abc����ѧϰ2021��10��2��.aaa000helloworld;

import java.util.Scanner;

public class aaa002��ֵ��ְ��� {
    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);
        System.out.println("please type in��");
        int x2 = x1.nextInt();
        if (x2 < 9 & x2 > 0) {
            System.out.println(x2);
        } else if (x2 < 99 & x2 > 9) {
            int x3 = x2 % 10;
            int x4 = x2 / 10;
            System.out.println("��λ��"+x3+"��ʮλ��"+x4);
        } else if (x2 > 99 & x2 < 999) {
            int x3 = x2 % 10;
            int x4 = x2 / 10%10;
            int x5 = x2 / 100;
            System.out.println("��λ��"+x3+"��ʮλ��"+x4+"����λ��"+x5);
        }else {
            System.out.println("num error");
        }
    }
}
