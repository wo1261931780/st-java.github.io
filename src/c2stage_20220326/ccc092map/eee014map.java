package c2stage_20220326.ccc092map;
/*
    Map���ϸ���
        Interface Map<K,V>	K���������ͣ�V��ֵ������
        ����ӳ�䵽ֵ�Ķ��󣻲��ܰ����ظ��ļ���ÿ��������ӳ�䵽���һ��ֵ
        ������ѧ����ѧ�ź�����
              itheima001	����ϼ
              itheima002	������
              itheima003	������

    ����Map���ϵĶ���
        ��̬�ķ�ʽ
        �����ʵ����HashMap
 */

import java.util.HashMap;
import java.util.Map;

public class eee014map {

    public static void main(String[] args) {
        // interface Map<K,V>
        // K��ʾ�������ͣ�V��ʾֵ������
        Map<String, String> x = new HashMap<>();
        x.put("aaaaaaa", "a1");
        x.put("bbbbbbb", "a2");
        x.put("ccccccc", "a3");
        x.put("ddddddd", "a4");
        x.put("eeeeeee", "a5");

        System.out.println(x);
        // ���Ϊ��
        // {bbbbbbb=a2, aaaaaaa=a1, ddddddd=a4, eeeeeee=a5, ccccccc=a3}
        // �൱��hashmap��д��tostring������
        // �����������չʾ���
        // ͬʱ������ļ�ֵ����Ψһ�ģ�����ظ�����ô�ͻ�����滻
        // ����aaa�Ѿ����֣���ʱ�������һ��һ���ļ�ֵ���Ὣԭ���Ķ����滻��
    }

}
