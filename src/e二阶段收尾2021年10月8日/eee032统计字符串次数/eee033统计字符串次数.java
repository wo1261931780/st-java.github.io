package e���׶���β2021��10��8��.eee032ͳ���ַ�������;
/*
    ����
        ����¼��һ���ַ�����Ҫ��ͳ���ַ�����ÿ���ַ������ֵĴ�����
        ����������¼�롰aababcabcdabcde��	�ڿ���̨�������a(5)b(4)c(3)d(2)e(1)��

    ˼·��
        1:����¼��һ���ַ���
        2:����HashMap���ϣ�����Character��ֵ��Integer
        3:�����ַ������õ�ÿһ���ַ�
        4:�õõ���ÿһ���ַ���Ϊ����HashMap������ȥ�Ҷ�Ӧ��ֵ�����䷵��ֵ
            �������ֵ��null��˵�����ַ���HashMap�����в����ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
            �������ֵ����null��˵�����ַ���HashMap�����д��ڣ��Ѹ�ֵ��1��Ȼ�����´洢���ַ��Ͷ�Ӧ��ֵ
        5:����HashMap���ϣ��õ�����ֵ������Ҫ�����ƴ��
        6:������
 */

import java.util.*;

public class eee033ͳ���ַ������� {
    public static void main(String[] args) {
        // HashMap<Character, Integer> x = new HashMap<>();
        // �����ʽΪhashmap��
        // �ַ���Ϊ����������Ϊֵ
        // ����չʾΪx=22;
        TreeMap<Character, Integer> x = new TreeMap<>();
        // TreeMap�ĺô����ڣ��Լ�����������
        // ---------------------------------------------------------
        Scanner x1 = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String zfc = x1.nextLine();
        // String[] x2 = zfc.split("");
        for (int i = 0; i < zfc.length(); i++) {
            Character x3 = zfc.charAt(i);
            Integer value = x.get(x3);
            // ֱ��ʹ��int������������ʹ�������İ�װ��
            if (value == null) {
                x.put(x3, 1);
            } else {
                // x.put(x3, value++);
                value++;
                x.put(x3, value);
                // ���ֱ�����У��ͻᱨ��
            }
        }
        System.out.println(x);
        Set<Character> x4 = x.keySet();
        StringBuilder x6 = new StringBuilder();
        for (Character i : x4) {
            x6.append(i).append("(").append(x.get(i)).append(")").append("-");
        }
        System.out.println(x6);

    }
}
