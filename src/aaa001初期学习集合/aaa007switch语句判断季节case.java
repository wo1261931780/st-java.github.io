package aaa001����ѧϰ����;

import java.util.Scanner;

public class aaa007switch����жϼ���case {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("�����·ݣ�");
        int xx = b11.nextInt();
        switch (xx) {
            case 1:
            case 2:
            case 3:
                System.out.println("����");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("�ļ�");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("�＾");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("����");
                break;
            default:
                System.out.println("ʱ����󣬳������");
                break;
        }
    }
}
