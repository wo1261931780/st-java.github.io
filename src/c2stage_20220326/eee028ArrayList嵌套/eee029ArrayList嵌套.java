package c2stage_20220326.eee028ArrayListǶ��;
/*
    ����
        ����һ��ArrayList���ϣ��洢����Ԫ�أ�ÿһ��Ԫ�ض���HashMap��ÿһ��HashMap�ļ���ֵ����String��������

    ˼·��
        1:����ArrayList����
        2:����HashMap���ϣ�����Ӽ�ֵ��Ԫ��
        3:��HashMap��ΪԪ����ӵ�ArrayList����
        4:����ArrayList����

    �������µ�����:
        ��һ��HashMap���ϵ�Ԫ�أ�
  		    ���		����
  		    ���		С��
        �ڶ���HashMap���ϵ�Ԫ�أ�
  		    ����		����
  		    ���		С��Ů
        ������HashMap���ϵ�Ԫ�أ�
  		    �����	��ӯӯ
  		    ��ƽ֮	����ɺ
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class eee029ArrayListǶ�� {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> x = new ArrayList<>();
        // ArrayList<String> x=new ArrayList<>();
        // �൱���ҵ�x������һ��hashmap���͵Ķ���
        // Ҳ����˵��
        // �ں����������add����ʱ�������Ķ���hashmap����

        HashMap<String, String> x1 = new HashMap<>();
        x1.put("11", "a1");
        x1.put("22", "a2");
        HashMap<String, String> x2 = new HashMap<>();
        x2.put("33", "a3");
        x2.put("44", "a4");
        HashMap<String, String> x3 = new HashMap<>();
        x3.put("55", "a5");
        x3.put("66", "a6");
        x.add(x1);
        x.add(x2);
        x.add(x3);
        for (HashMap<String, String> x4 : x) {
            // ����һ��x4ȥ����x�е�����hashmap
            Set<String> x5 = x4.keySet();
            // Ȼ��ʹ��x5ȥ��ȡx4�е�key��
            for (String q : x5) {
                System.out.println(x4.get(q));
                // ��key���б�����get��ȡֵ
            }
        }

        // for (int i = 0; i < x.size(); i++) {
        //     System.out.println(x.get(i));
        //     // {11=a1, 22=a2}
        //     // {33=a3, 44=a4}
        //     // {55=a5, 66=a6}
        // }

    }
}
