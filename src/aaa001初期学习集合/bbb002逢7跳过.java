package aaa001����ѧϰ����;

import java.util.Random;

public class bbb002��7���� {
    public static void main(String[] args) {
        Random b11 = new Random();
        int xx = b11.nextInt(100) + 1;
        int x1 = 1;
        //��Ŀ������Ҫ��

        System.out.println("��ʼ������");
        for (int x2 = 0; x1 < 100; x1++) {
            //ΪʲôҪ��һ��/10%10?
            //ԭ����ʽ��û�п���79�������֣�79������7
            if (x1 % 10 == 7 || x1 % 7 == 0 || x1 / 10 % 10 == 7) {
                System.out.println("�������֣�" + x1 + "-----��Ҫ��");
                x2++;
                System.out.println(x2);
                /*
            if (x1 % 7 == 0) {
                System.out.println("�������֣�" + x1 + "-----��Ҫ��");
                x2++;
                System.out.println(x2);
            } else if (x1 % 10 == 7) {
                System.out.println("�������֣�" + x1 + "-----��Ҫ��");
                x2++;
                System.out.println(x2);*/
            } else {
            }

        }
        //System.out.println("������������Ҫ���ĸ����ǣ�"+x2/100+"%");
        //���һ�����֣��ж��Ƿ���Ҫ����
        System.out.println("����õ��������ǣ�" + xx);
        if (xx % 7 == 0) {
            System.out.println("�������֣�" + xx + "��Ҫ-----��");
        } else if (xx % 10 == 7) {
            System.out.println("�������֣�" + xx + "��Ҫ-----��");
        } else {
            System.out.println(xx + "����Ҫ��");
            System.out.println("��Ϸ����");
        }
    }
}
