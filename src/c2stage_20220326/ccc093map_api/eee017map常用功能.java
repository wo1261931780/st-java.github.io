package c2stage_20220326.ccc093map_api;
/*
    Map���ϵĻ�ȡ���ܣ�
        V get(Object key):���ݼ���ȡֵ
        Set<K> keySet():��ȡ���м��ļ���
        Collection<V> values():��ȡ����ֵ�ļ���
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class eee017map���ù��� {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("111", "a1");
        x.put("222", "a2");
        x.put("333", "a3");
        x.put("444", "a4");
        System.out.println(x.get("111"));
        // ���ݼ���ȡ���ݣ�a1
        System.out.println(x.get("ww"));
        // �����ڵļ�������null
        // ------------------------------------------
        // ��ȡ����key���ļ���
        Set<String> x1 = x.keySet();
        for (String x2 : x1) {
            System.out.println(x2);
        }
        System.out.println(x1);
        // [111, 222, 333, 444]
        // ------------------------------------------
        // ��ȡ����ֵ�ļ���
        Collection<String> x2 = x.values();
        for (String i : x2) {
            System.out.println(i);
        }
        System.out.println(x2);
        // ��ʾ����x2����һ��collection����
        // [a1, a2, a3, a4]
    }
}
