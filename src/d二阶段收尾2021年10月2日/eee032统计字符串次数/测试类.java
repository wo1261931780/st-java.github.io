package d���׶���β2021��10��2��.eee032ͳ���ַ�������;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * ����
 * ����¼��һ���ַ�����Ҫ��ͳ���ַ�����ÿ���ַ������ֵĴ�����
 * ����������¼�롰aababcabcdabcde��	�ڿ���̨�������a(5)b(4)c(3)d(2)e(1)��
 * ˼·��
 * 1:����¼��һ���ַ���
 * 2:����HashMap���ϣ�����Character��ֵ��Integer
 * 3:�����ַ������õ�ÿһ���ַ�
 * 4:�õõ���ÿһ���ַ���Ϊ����HashMap������ȥ�Ҷ�Ӧ��ֵ�����䷵��ֵ
 * �������ֵ��null��˵�����ַ���HashMap�����в����ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
 * �������ֵ����null��˵�����ַ���HashMap�����д��ڣ��Ѹ�ֵ��1��Ȼ�����´洢���ַ��Ͷ�Ӧ��ֵ
 * 5:����HashMap���ϣ��õ�����ֵ������Ҫ�����ƴ��
 * 6:������
 */
public class ������ {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("��ʼ");
        String x1 = x.nextLine();
        HashMap<Character, Integer> x2 = new HashMap<>();
        for (int i = 0; i < x1.length(); i++) {
            Character x3 = x1.charAt(i);
            Integer x4 = x2.get(x3);
            if (x4 == null) {
                x2.put(x3, 1);
            } else {
                x4++;
                x2.put(x3, x4);
            }
        }
        System.out.println(x2);
        StringBuilder x6 = new StringBuilder();
        Set<Character> x5 = x2.keySet();
        for (Character x7 : x5) {
            x6.append(x7).append("(").append(x2.get(x7)).append(")").append("-");
        }
        System.out.println(x6);
    }
}
