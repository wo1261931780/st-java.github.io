/*
public class b11{
	public static void main(String[] args){
		System.out.println("��ʼ�Ƚϣ�");
		int x1 = 10;
		int x2 = 30;
		int x3 = 31;
		if (x1 > x2 ){
			System.out.println(x1);
		}else{
			if (x2 > x3){
				System.out.println(x2);
			}else{
				System.out.println(x3);

			}
		}
	}
}*/
package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

public class aaa004if����С�Ա� {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("��������ֵ1��");
        int x1 = b11.nextInt();

        System.out.println("��������ֵ2��");
        int x2 = b11.nextInt();

        System.out.println("��������ֵ3��");
        int x3 = b11.nextInt();

        if (x1 >= x2) {
            int max = x1;
        } else {
            int max = x2;
            if (max >= x3) {
                System.out.println("���ֵΪ��" + max);
            } else {
                max = x3;
                //int max = x3;
                System.out.println("���ֵΪ��" + max);
            }
        }
    }

}
