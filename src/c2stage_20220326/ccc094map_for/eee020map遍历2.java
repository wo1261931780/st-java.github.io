package c2stage_20220326.ccc094map_for;
/*
    Map���ϵı���(��ʽ2):
        1:��ȡ���м�ֵ�Զ���ļ���
            Set<Map.Entry<K,V>> entrySet()����ȡ���м�ֵ�Զ���ļ���
        2:������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
            ����ǿforʵ�֣��õ�ÿһ��Map.Entry
        3:���ݼ�ֵ�Զ����ȡ����ֵ
            ��getKey()�õ���
            ��getValue()�õ�ֵ
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class eee020map����2 {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("111", "a1");
        x.put("222", "a2");
        x.put("333", "a3");
        x.put("444", "a4");
        System.out.println(x);
        Set<Map.Entry<String, String>> x1 = x.entrySet();
        // String����map������ʱ���趨�õ�
        // Map.Entry<String, String>����һ������
        // �������Ϊ������set������һ��xx���͵�x1
        // �����xx����Map.Entry<String, String>
        System.out.println(x1);
        // x1��x��ͬ��x1����һ������
        for (Map.Entry<String, String> x2 : x1) {
            System.out.println(x2.getValue());
            System.out.println(x2.getKey());
        }
    }

}
