package bbb020����ѧУ����;


import java.util.Scanner;

public class bbb021d�����ַ��� {
    public static void main(String[] args) {
        // �����ǰѷ���ֱ�ӷ���������Ҫ��ʱ����ü���
        // bl();
        bl2();

    }

    /**
     * ����
     * ����¼��һ���ַ�����ʹ�ó���ʵ���ڿ���̨�������ַ���
     * ˼·��
     * 1:����¼��һ���ַ������� Scanner ʵ��
     * 2:�����ַ���������Ҫ�ܹ���ȡ���ַ����е�ÿһ���ַ�
     * public char charAt?(int index)������ָ����������charֵ���ַ���������Ҳ�Ǵ�0��ʼ��
     * 3:�����ַ��������Ҫ�ܹ���ȡ���ַ����ĳ���
     * public int length?()�����ش��ַ����ĳ���
     * ����ĳ��ȣ�������.length
     * �ַ����ĳ��ȣ��ַ�������.length()
     * 4:�����ַ�����ͨ�ø�ʽ
     */
    public static void bl() {
        // �������ַ�������������������ֱ����ȡ����
        System.out.println("��ʼ����");
        Scanner x = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String x1 = x.nextLine();
        for (int i = 0; i < x1.length(); i++) {
            x1.charAt(i);
            // charAt���ǻ�ȡ��Ӧλ���ϵ��ַ���
            System.out.println(x1.charAt(i));
            // ����ֱ�����s��a
        }
    }

    /**
     * ����
     * ����¼��һ���ַ�����ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���(�����������ַ�)
     * ˼·��
     * 1:����¼��һ���ַ������� Scanner ʵ��
     * 2:Ҫͳ���������͵��ַ��������趨������ͳ�Ʊ�������ʼֵ��Ϊ0
     * 3:�����ַ������õ�ÿһ���ַ�
     * 4:�жϸ��ַ������������ͣ�Ȼ���Ӧ���͵�ͳ�Ʊ���+1
     * ����ch��һ���ַ�����Ҫ�ж������ڴ�д��ĸ��Сд��ĸ���������֣�ֱ���жϸ��ַ��Ƿ��ڶ�Ӧ�ķ�Χ����
     * ��д��ĸ��ch>='A' && ch<='Z'
     * Сд��ĸ�� ch>='a' && ch<='z'
     * ���֣� ch>='0' && ch<='9'
     * 5:����������͵��ַ�����
     */
    public static void bl2() {
        System.out.println("������ʶ���Сд");
        Scanner x3 = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String x4 = x3.nextLine();
        for (int i = 0; i < x4.length(); i++) {
            if (x4.charAt(i) > 64 && x4.charAt(i) < 97) {
                System.out.println("��д�ַ���" + x4.charAt(i));
            } else if (x4.charAt(i) > 96 && x4.charAt(i) < 123) {
                System.out.println("Сд�ַ���" + x4.charAt(i));
            } else if (x4.charAt(i) > 47 && x4.charAt(i) < 65) {
                System.out.println("���֣�" + x4.charAt(i));
            } else {
                System.out.println("�������");
            }
        }
    }
}
