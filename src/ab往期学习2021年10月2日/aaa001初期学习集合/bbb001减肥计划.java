package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

/**
 * ������
 * 1:�ֶ�����  import java.util.Scanner;
 * �ֶ��������
 * 2:��ݼ����� Alt+Enter
 * ��scanner���水��ݼ�
 * 3:�Զ�����
 * ��������ֱ������scanner�����Զ�����+��������
 */
public class bbb001���ʼƻ� {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("������ʱ�䣺");
        int xx = b11.nextInt();
        if (xx == 1) {
            System.out.println("��һ���ܲ�");
        } else if (xx == 2) {
            System.out.println("�ܶ�����Ӿ");
        } else if (xx == 3) {
            System.out.println("��������·");
        } else if (xx == 4) {
            System.out.println("���ģ�����");
        } else if (xx == 5) {
            System.out.println("���壺ȭ��");
        } else if (xx == 6) {
            System.out.println("��������ɽ");
        } else if (xx == 7) {
            System.out.println("���գ��Է�");
        } else {
            System.out.println("ʱ���������������");
        }
        /*switch���ʵ��
        switch (xx) {
            case 1:
                System.out.println("��һ���ܲ�");
                break;
            case 2:
                System.out.println("�ܶ�����Ӿ");
                break;
            case 3:
                System.out.println("��������·");
                break;
            case 4:
                System.out.println("���ģ�����");
                break;
            case 5:
                System.out.println("���壺ȭ��");
                break;
            case 6:
                System.out.println("��������ɽ");
                break;
            case 7:
                System.out.println("���գ��Է�");
                break;
            default:
                System.out.println("ʱ�����,����������");
                break;
        }*/
    }

}
