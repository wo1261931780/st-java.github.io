package aaa001����ѧϰ����;
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
    //�������������������������жϴ�С
    public static void main(String[] args) {
        Random b11 = new Random();
        Scanner b22 = new Scanner(System.in);
        int xx = b11.nextInt(100);
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

    }
}
