package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

public class aaa009if��for����׳� {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("��������");
        int i = b11.nextInt();
        //1-5��������Ȼ�󵹹�������һ�顣-------------------------
		/*for(System.out.println("��ʼ���");i <= 5;i++){
			System.out.println("i = "+i);
		}
		//else(System.out.println("�������"));
		//i = 5;
		for(System.out.println("����----------");i > 0;i--){
			System.out.println("i = "+i);
		}
		//else(System.out.println("�������"));
		System.out.println("����");
		*/
        //������������ֵ�Ľ׳ˡ�-----------------------------------
		/*
		int xx = i;
		for (System.out.println("��������Ϊ��"+i);i > 0;xx += i){
			i--;
		}
		System.out.println("�������ݵĽ׳��ǣ�" + xx);*/
        //��ż����--------------------------------------------------
        if (i > 0) {
            if (i % 2 == 1) {
                int x1 = i;
                //System.out.println("���������"+ i +"������");
                for (System.out.println("���������" + x1 + "������"); i > 1; x1 += i) {
                    i = i - 2;
                }
                System.out.println("�������µ������׳�Ϊ" + x1);
            } else {
                int x2 = i;
                for (System.out.println("���������" + x2 + "Ϊż��"); i > 0; x2 += i) {
                    i = i - 2;
                }
                System.out.println("�������µ�ż���׳�Ϊ" + x2);
            }
        } else {
            System.out.println("���ݴ���");
        }
        System.out.println("�������");
    }
}
