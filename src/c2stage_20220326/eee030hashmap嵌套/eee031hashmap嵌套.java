package c2stage_20220326.eee030hashmapǶ��;
/*
    ���󣺴���һ��HashMap���ϣ��洢������ֵ��Ԫ�أ�ÿһ����ֵ��Ԫ�صļ���String��ֵ��ArrayList��
         ÿһ��ArrayList��Ԫ����String��������

    ˼·��
        1:����HashMap����
        2:����ArrayList���ϣ������Ԫ��
        3:��ArrayList��ΪԪ����ӵ�HashMap����
        4:����HashMap����

    �������µ�����:
        ��һ��ArrayList���ϵ�Ԫ�أ�(��������)
  		    �����
  		    ����
        �ڶ���ArrayList���ϵ�Ԫ�أ�(���μ�)
  		    ��ɮ
  		    �����
        ������ArrayList���ϵ�Ԫ�أ�(ˮ䰴�)
  		    ����
  		    ³����
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class eee031hashmapǶ�� {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> x = new HashMap<>();
        ArrayList<String> x1 = new ArrayList<>();
        x1.add("x1-a1");
        x1.add("x1-a2");
        ArrayList<String> x2 = new ArrayList<>();
        x2.add("x2-a1");
        x2.add("x2-a2");
        ArrayList<String> x3 = new ArrayList<>();
        x3.add("x3-a1");
        x3.add("x3-a2");
        x.put("11", x1);
        x.put("22", x2);
        x.put("33", x3);
        Set<String> x4 = x.keySet();
        for (String i : x4) {
            // for (String i : x) {
            // ���ﲻ��ֱ�ӱ���x����Ϊx����hashmap��
            // ����������Ե�һԪ�صļ���
            // ����ĵ�һԪ��ָ���ǣ�ר�Ŵ���x�����ϵ�x4
            ArrayList<String> x5 = x.get(i);
            // x5�õ�����3��ArrayList
            System.out.println(i + "---------------------");
            for (String i2 : x5) {
                System.out.println(i2);
            }
        }

    }
}
