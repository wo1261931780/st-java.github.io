package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Random;
import java.util.Scanner;

public class aaa005�ж���ż�� {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("��������ֵ��");
        int x1 = b11.nextInt();
        //int xx = (x1 % 2);
        if (x1 % 2 == 1) {
            //x1��2����������1
            System.out.println("�������ݣ�" + x1 + "Ϊ����");
        } else {
            System.out.println("�������ݣ�" + x1 + "Ϊż��");
        }
        show();

    }
    public static void show(){
        System.out.println("show me money");
        Random random = new Random();
        int i = random.nextInt(200);
        System.out.println(i);
        int i1 = i % 2;
        String s = i1 > 0 ? "y" : "n";
        System.out.println(s);
    }


}
