package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;
 /*
import java.util.Random;

public class b11{
	public static void main(String[] args){
		Random b11 = new Random();
		int x1 = 0;
		do{
		int xx = b11.nextInt(100) +1;
			System.out.println(xx);
			x1++;
		}while(x1 < 10);
	}
}*/

import java.util.Random;
import java.util.Scanner;

public class aaa013whileѭ��������� {
    /**
     * �������������������������жϴ�С
     */
    public static void main(String[] args) {
        Random b11 = new Random();
        Scanner b22 = new Scanner(System.in);
        //��ȡ��������������Ƿ�Χ
        int xx = b11.nextInt(100);
        // ����ÿ��ִ�У��ͻ�����һ�������
        int xx2 = b11.nextInt(100) + 1;
        //�����xx��Χ[0-99),xx2��Χ���ܵ�1-100��
        while (true) {
            System.out.println("�������ֵ��");
            int x1 = b22.nextInt();
            int xs = 0;
            //System.out.println("������ȷ");
            if (x1 > xx) {
                System.out.println("�������");
            } else if (x1 < xx) {
                System.out.println("�����С");
            } else {
                System.out.println("������ȷ");
                break;
            }
        }
        show();
    }

    //2021��9��8��15:34:25
    // public static void main(String[] args) {
    //     System.out.println("��ʼ�²�");
    //     Random x1 = new Random();
    //     int x2 = x1.nextInt(100) + 1;
    //     Scanner xx1 = new Scanner(System.in);
    //
    //     System.out.println("���������֣�");
    //     int xx2 = xx1.nextInt();
    //     do {
    //         if (xx2 < x2) {
    //             System.out.println("��С");
    //             xx2 = xx1.nextInt();
    //         } else if (xx2 > x2) {
    //             System.out.println("����");
    //             xx2 = xx1.nextInt();
    //         }
    //     } while (xx2 != x2);
    //     System.out.println("right number");
    // }
    public static void show() {
        Random x = new Random();
        int x1 = x.nextInt(200);
        Scanner x2 = new Scanner(System.in);
        do {
            int x3 = x2.nextInt();
            if (x3 > x1) {
                System.out.println("����");

            } else if (x3 < x1) {
                System.out.println("С��");

            } else if (x3 == x1) {
                break;
            }
        } while (true);

    }


}

