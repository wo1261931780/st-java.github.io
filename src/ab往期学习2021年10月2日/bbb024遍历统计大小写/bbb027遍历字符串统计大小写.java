package ab����ѧϰ2021��10��2��.bbb024����ͳ�ƴ�Сд;

import java.util.Scanner;

public class bbb027�����ַ���ͳ�ƴ�Сд {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("�������ַ�������Сд�����ֲ���");
        String x1 = xx.nextLine();
        int z1 = 0;
        int z2 = 0;
        int z3 = 0;
        for (int x = 0; x < x1.length(); x++) {
//            System.out.println("");
            if (x1.charAt(x) > 64 && x1.charAt(x) < 97) {
                //charAt,�˷�����������ַ�����ָ����������charֵ����һ��charֵ������Ϊ0.
                //����ָ��һ���ַ���x1��Ȼ����x1��xλ�ϵ�ֵ��
                //��Ϊ�ַ�����Ӧ�ĵײ㶼�Ǿ������֣�����֮��͵õ���һ������
                //x1.charAt(x)>'A'&&x1.charAt(x)<'Z'
                //����ı����Ӽ�
                System.out.println("��" + (x+1) + "λΪ��д��ĸ");
                z1++;
            } else if (x1.charAt(x) > 96 && x1.charAt(x) < 123) {
                System.out.println("��" + (x+1) + "λΪСд��ĸ");
                z2++;
            } else if (x1.charAt(x) > 47 && x1.charAt(x) < 65) {
                System.out.println("��" + (x+1) + "λΪ����");
                z3++;
            }
        }
        System.out.println("������������д��ĸ��" + z1 + "����Сд��ĸ��" + z2 + "����������" + z3 + "�����ܳ���Ϊ��" + x1.length());
        System.out.println("�ַ����ܳ���Ϊ��" + x1.length());

        //����Ĺ��������룬Ȼ������ַ�����ȡÿ���ַ���
//        Scanner xx=new Scanner(System.in);
//        System.out.println("�������ַ���:");
//        String x1=xx.nextLine();
//        for (int x=0;x<x1.length();x++){
//            System.out.println("�ַ���"+x1+"��"+x+"�����ַ��ǣ�"+x1.charAt(x));
//            //����Ҳ����ָ��x��������ȡ�ַ������ַ���x1.charAt(x).
////            x1.charAt(x);
//        }
//        System.out.println("��������");
    }
}
