package e���׶���β2021��10��8��.eee030hashmapǶ��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * ���󣺴���һ��HashMap���ϣ��洢������ֵ��Ԫ�أ�ÿһ����ֵ��Ԫ�صļ���String��ֵ��ArrayList��
 * ÿһ��ArrayList��Ԫ����String��������
 * ˼·��
 * 1:����HashMap����
 * 2:����ArrayList���ϣ������Ԫ��
 * 3:��ArrayList��ΪԪ����ӵ�HashMap����
 * 4:����HashMap����
 * �������µ�����:
 * ��һ��ArrayList���ϵ�Ԫ�أ�(��������)
 * �����
 * ����
 * �ڶ���ArrayList���ϵ�Ԫ�أ�(���μ�)
 * ��ɮ
 * �����
 * ������ArrayList���ϵ�Ԫ�أ�(ˮ䰴�)
 * ����
 * ³����
 */
public class ������ {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> x = new HashMap<>();
        ArrayList<String> x1 = new ArrayList<>();
        x1.add("a1");
        x1.add("a2");
        ArrayList<String> x2 = new ArrayList<>();
        x2.add("a3");
        x2.add("a4");
        ArrayList<String> x3 = new ArrayList<>();
        x3.add("a5");
        x3.add("a6");
        x.put("111", x1);
        x.put("222", x2);
        x.put("333", x3);
        Set<String> x4 = x.keySet();
        for (String x5 : x4) {
            ArrayList<String> x6 = x.get(x5);
            for (String i : x6) {
                System.out.println(i + "--" + x5);
            }
            // for (int i = 0; i < x6.size(); i++) {
            //     System.out.println(x6.get(i) + "--" + x5);
            // }
        }
    }
}
