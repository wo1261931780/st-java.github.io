package aaa001����ѧϰ����;

import java.util.Scanner;

public class aaa003������߽�����Ԫ�Ա� {
    public static void main(String[] args) {
        /*//ceshi
		Scanner b11 = new Scanner(System.in);
		//jieshou
		System.out.println("����:");
		int x = b11.nextInt();
		//123
		System.out.println("���:"+x);*/

        //�������
        Scanner b11 = new Scanner(System.in);
        System.out.println("��һ��");
        int x1 = b11.nextInt();
        System.out.println("�ڶ����ˣ�");
        int x2 = b11.nextInt();
        System.out.println("�������ˣ�");
        int x3 = b11.nextInt();
        System.out.println("���ĸ��ˣ�");
        int x4 = b11.nextInt();
        //�Ƚ�
        int tall1 = x1 > x2 ? x1 : x2;
        int tall2 = tall1 > x3 ? tall1 : x3;
        int tall3 = tall2 > x4 ? tall2 : x4;
        System.out.println("�����" + tall3);
        //�۲���
    }
}
