package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

/**
 * 2021��9��6��22:26:18�����������������Ҫ������
 * 1.����  2.����ϵͳ������   3.����xx.nextInt();
 */
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
        // int tall1 = Math.max(x1, x2);
        // int tall2 = Math.max(tall1, x3);
        // int tall3 = Math.max(x1, x4);
        // max����ֻ�ܱȽ�����int���͵����ݣ�ѡ�����еĽϴ�ֵ
        System.out.println("�����" + tall3);
        //�۲���
    }
}
