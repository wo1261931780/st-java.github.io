package c2stage_20220326.ccc094map_for;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class eee019map����1 {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("111", "a1");
        x.put("222", "a2");
        x.put("333", "a3");
        x.put("444", "a4");
        Set<String> x1 = x.keySet();
        System.out.println(x1);
        for (String x2 : x1) {
            System.out.println(x.get(x2) + "--" + x2);
            // ��Ҫע����ǣ����ϵĵײ���set�������������
            // ����x1��x�еļ�ֵ��
            // ʹ��x2��x1���б�����ÿ�εõ��Ķ���x1�ļ�ֵ
            // Ȼ��x.get(x2)���Ǹ��ݼ�ֵ��ȡ���������

        }
        System.out.println("����");

    }

}
