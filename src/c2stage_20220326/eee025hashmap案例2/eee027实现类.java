package c2stage_20220326.eee025hashmap����2;
/*
    ����
        ����һ��HashMap���ϣ�����ѧ������(Student)��ֵ�Ǿ�ס�� (String)���洢�����ֵ��Ԫ�أ���������
        Ҫ��֤����Ψһ�ԣ����ѧ������ĳ�Ա����ֵ��ͬ�����Ǿ���Ϊ��ͬһ������

    ˼·��
        1:����ѧ����
        2:����HashMap���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������
        6:��ѧ��������д��������
            hashCode()
            equals()
 */

import java.util.HashMap;
import java.util.Set;

public class eee027ʵ���� {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        HashMap<eee026ѧ����, String> x = new HashMap<>();
        eee026ѧ���� x1 = new eee026ѧ����("11", "cc");
        eee026ѧ���� x2 = new eee026ѧ����("22", "dd");
        eee026ѧ���� x3 = new eee026ѧ����("33", "ee");
        eee026ѧ���� x4 = new eee026ѧ����("33", "ee");
        // ����new���ǵ�ַ���ڵ�ַ��ͬ������£�������Ϊ��һ��Ԫ�أ�
        // ��ʹ������ͬ��Ҳ������ظ���ӵ����
        // Ҫ������⣬����Ҫ�ڶ������н�����д����
        // ------------------------------------------------------------------
        // x.put(x1, x1.getCity());
        // x.put(x2, x2.getCity());
        // x.put(x3, x3.getCity());
        // x.put(x3, x3.getCity());
        x.put(x1, "x1��ֵ");
        x.put(x2, "x2��ֵ");
        x.put(x3, "x3��ֵ");
        x.put(x3, "x3��ֵ");
        x.put(x4, "x4��ֵ");
        // ------------------------------------------------------------------
        // Set<Map.Entry<eee026ѧ����, String>> xx1 = x.entrySet();
        // for (Map.Entry<eee026ѧ����, String> xx : xx1) {
        //     eee026ѧ���� x4 = xx.getKey();
        //     System.out.println(x4.getCity() + "--" + x4.getAge() + "--" + xx.getValue());
        // }
        // ------------------------------------------------------------------
        Set<eee026ѧ����> xx1 = x.keySet();
        // System.out.println(xx1);
        // xx1ʵ������key�ļ���
        // Ҳ����x1-x5�ĵ�ַ����
        // ���ʱ��xȥgetx5�ĵ�ַ��ʵ�����ǻ�ȡ����Ӧ����ֵ
        for (eee026ѧ���� x5 : xx1) {
            System.out.println(x5.getCity() + "----" + x5.getAge() + "---" + x.get(x5));
        }
    }

}
