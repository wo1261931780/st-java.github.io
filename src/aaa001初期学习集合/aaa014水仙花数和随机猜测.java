package aaa001����ѧϰ����;

import java.util.Scanner;
import java.util.Random;

public class aaa014ˮ�ɻ���������²� {
    public static void main(String[] args) {
        Random b2 = new Random();
        int xr = b2.nextInt(1000);
        Scanner b1 = new Scanner(System.in);
        //int xx = b1.nextInt();
        int x1 = xr % 10;
        int x2 = xr / 10 % 10;
        int x3 = xr / 100;
        int xs = 0;
		/*���ϲ²�����
		while(true){
		System.out.println("������������֣�");
		int xx = b1.nextInt();
			if(xx > xr){
				System.out.println("ƫ��");
				xs++;
			}else if(xx < xr){
				System.out.println("ƫС");
				xs++;
			}else {
				System.out.println("��ȷ");
				System.out.println("�²������"+xs);
				break;
			}
		}*/
		/*
		while(true){
			System.out.println("��ʼ���㣺");
			int xx = b1.nextInt();
			if(xx < x1*x1*x1+x2*x2*x2+x3*x3*x3){
				System.out.println("С");
			}else if(xx > x1*x1*x1+x2*x2*x2+x3*x3*x3){
				System.out.println("��");
			}else{
				System.out.println("��ȷ");
				break;
		}

		}*/

        //����ļ���û���⣬��������������ģ�һ��ʼ�Ͳ���ˮ�ɻ���

        for (System.out.println("���Լ��㿪ʼ��"); xs < 1000; xs++) {
            if (xr == x1 * x1 * x1 + x2 * x2 * x2 + x3 * x3 * x3) {
                System.out.println("�õ�ˮ�ɻ���" + xr);
                System.out.println("�������" + xs);
                xr = b2.nextInt(1000);
            } else {
                xr = b2.nextInt(1000);
            }
        }
        System.out.println("���Խ���");


    }
}
