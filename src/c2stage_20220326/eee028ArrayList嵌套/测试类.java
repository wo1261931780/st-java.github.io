package c2stage_20220326.eee028ArrayListǶ��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * ����
 * ����һ��ArrayList���ϣ��洢����Ԫ�أ�ÿһ��Ԫ�ض���HashMap��ÿһ��HashMap�ļ���ֵ����String��������
 * ˼·��
 * 1:����ArrayList����
 * 2:����HashMap���ϣ�����Ӽ�ֵ��Ԫ��
 * 3:��HashMap��ΪԪ����ӵ�ArrayList����
 * 4:����ArrayList����
 * �������µ�����:
 * ��һ��HashMap���ϵ�Ԫ�أ�
 * ���		����
 * ���		С��
 * �ڶ���HashMap���ϵ�Ԫ�أ�
 * ����		����
 * ���		С��Ů
 * ������HashMap���ϵ�Ԫ�أ�
 * �����	��ӯӯ
 * ��ƽ֮	����ɺ
 */
public class ������ {
    /**
     * 2021��10��10��09:58:24����ϰ����
     */
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> x = new ArrayList<>();
        HashMap<String, String> x1 = new HashMap<>();
        x1.put("111", "a1");
        x1.put("222", "a2");
        HashMap<String, String> x2 = new HashMap<>();
        x1.put("333", "a3");
        x1.put("444", "a4");
        HashMap<String, String> x3 = new HashMap<>();
        x1.put("555", "a5");
        x1.put("666", "a6");
        x.add(x1);
        x.add(x2);
        x.add(x3);
        System.out.println("��ʼִ��");
        for (HashMap<String, String> x4 : x) {
            Set<String> x5 = x4.keySet();
            for (String x6 : x5) {
                System.out.println(x6 + "--" + x4.get(x6));
            }
        }

    }
}
