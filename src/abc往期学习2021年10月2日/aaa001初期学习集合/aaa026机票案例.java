package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Random;

/**
 * ���󣺻�Ʊ�۸��յ���������ͷ�Ȳպ;��ò��շѡ������Ʊԭ�ۡ��·ݺ�ͷ�Ȳջ򾭼òա�
 * �������¹�������Ʊ�۸�������5-10�£�ͷ�Ȳ�9�ۣ����ò�8.5�ۣ�������11�µ�����4�£�ͷ�Ȳ�7�ۣ����ò�6.5�ۡ�
 */
public class aaa026��Ʊ���� {
    public static void main(String[] args) {
        show();
        System.out.println("finish");
        System.out.println("--------------------");
        // �ڵ�������ͷ�Ȳ�
        show(1, 1);

    }
    // ��Ҫ���÷�������
    // û���κ���Ϣ��Ĭ�ϵ���ԭ�ۺ;��ò�
    // �����ʹ�ô�����Ϣ�ķ���

    public static void show() {
        show(5, 0);
        // ����¼�˺ŵ�����£�ֱ��չʾ�������òջ�Ʊ��ԭ��
    }

    public static void show(int x1, int x2) {
        // Scanner x = new Scanner(System.in);
        // System.out.println("please enter the season:");
        // x1 = x.nextInt();
        //
        // System.out.println("please enter the class:");
        // x2 = x.nextInt();

        Random price = new Random();
        int x3 = price.nextInt(1000) + 1000;
        System.out.println("original price:" + x3);
        System.out.println("**********");
        if (x1 < 0 || x1 > 12) {
            System.out.println("error");
            return;// ֱ�ӽ���������ִ��
        }
        if (x1 > 5 || x1 < 10) {
            System.out.println("Peak Season");
            double price2 = x2 == 1 ? x3 * 0.9 : x3 * 0.85;
            System.out.println(x1 + "�µ�price=" + price2);
        } else {
            System.out.println("Off-season");
            double price2 = x2 == 1 ? x3 * 0.7 : x3 * 0.65;
            System.out.println(x1 + "�µ�price=" + price2);
        }
    }

}
