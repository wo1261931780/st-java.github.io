package aaa001����ѧϰ����;//package aaa001����ѧϰ����;

import java.util.Scanner;

/*
public class b11{
	public static void main(String[] args){
		System.out.println("��������ֵ��");
		Scanner b11 = new Scanner(System.in);

		int xx = b11.nextInt();
		int i = xx;
		for(System.out.println("��ʼ����Ϊ��" + i); xx > 0 ; i = xx + i){
			xx = xx - 1;
		}
		System.out.println("���ݵĽ׳��ǣ�" + i);
	}
}
*/

// public class aaa008forѭ�� {
//     public static void main(String[] args) {
//         Scanner b11 = new Scanner(System.in);
//         System.out.println("��Ҫѭ�����ٱ飺");
//
//         int xx = b11.nextInt();
//         int i = 1;
//         // for (System.out.println("��ʼѭ��"); i <= xx; i = i + 1) {
//         for (System.out.println("��ʼѭ��"); i <= xx; i++) {
//             System.out.println("ѭ����" + i + "��");
//         }
//         System.out.println("ѭ������----------------------------");
//     }
// }

// public class aaa008forѭ�� {
//     public static void main(String[] args) {
//         System.out.println("2021��9��7��11:17:07----");
//         Scanner xx = new Scanner(System.in);
//         System.out.println("�������ʼ���ݣ�");
//         int x1 = xx.nextInt();
//         // int x1 = 0;
//         // for (int i = 0; i < 5; i++) {
//         for (int i = 0, x2 = i; i <= x1; i++) {
//             //����Ӧ���Ƿֺţ���ζ���м������һ�����ʽ
//             x2 += i;
//
//             System.out.println(i);
//             System.out.println(x1);
//             System.out.println(x2);
//             System.out.println("---");
//         }
//         System.out.println(x1);
//         //����x1=15��������0���������x1��ֵΪ�ܺ�
//     }
// }

public class aaa008forѭ�� {
    // ��ż���ͣ�2021��9��7��14:17:41
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("�������ʼ���ݣ�");
        int x1 = xx.nextInt();
        for (int i = 0, x2 = i; i <= x1; i++) {
            if (i % 2 == 0) {
                x2 += i;
            }
            System.out.println(i);
            System.out.println(x1);
            System.out.println("ż����ͽ����" + x2);
            System.out.println("---");
        }
        System.out.println(x1);
    }
}
