package e���׶���β2021��10��8��.eee013map;
/*
    Map���ϵĻ������ܣ�
        V put(K key,V value)�����Ԫ��
        V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ��
        void clear()���Ƴ����еļ�ֵ��Ԫ��
        boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
        boolean containsValue(Object value)���жϼ����Ƿ����ָ����ֵ(��ѧ)
        boolean isEmpty()���жϼ����Ƿ�Ϊ��
        int size()�����ϵĳ��ȣ�Ҳ���Ǽ����м�ֵ�Եĸ���
 */

import java.util.HashMap;
import java.util.Map;

public class eee015map�������� {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("111", "a1");
        x.put("222", "a2");
        x.put("333", "a3");
        x.put("444", "a4");
        System.out.println(x);
        System.out.println(x.remove("aaa"));
        // ���Ϊnull
        System.out.println(x.remove("111"));
        // ���ر�ɾ����Ԫ��a1
        System.out.println(x);
        // {222=a2, 333=a3, 444=a4}
        // ----------------------------------------------------
        System.out.println(x.containsKey("222"));
        System.out.println(x.containsValue("a3"));
        // �ж�map���Ƿ����ָ����key��value
        // ���صĶ���true��false
        // ----------------------------------------------------
        // x.clear();
        // System.out.println(x);
        // ֱ��������е�����
        // ----------------------------------------------------
        System.out.println(x.isEmpty());
        // �жϼ����Ƿ�Ϊ��
        System.out.println(x.size());
        // �жϼ��ϳ���


    }
}
