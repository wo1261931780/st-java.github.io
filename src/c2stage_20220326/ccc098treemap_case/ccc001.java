package c2stage_20220326.ccc098treemap_case;

import java.util.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc098treemap_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-28  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        Map<String, List<String>> map1 = new HashMap<>();
        // �൱�ڣ��������ǹ�����һ��map����
        // ����ָ�����Ƕ������������
        List<String> x = new ArrayList<>();
        Collections.addAll(x, "a", "b", "c");
        // ͨ���ɱ��������ѡ������ӵ�������
        map1.put("name1", x);// ע�⣬�����������һ���������map�У���һ��map������������������飬ÿ��������Ϊvalue������ͬ�����Բ�ͬ
        List<String> x1 = new ArrayList<>();
        Collections.addAll(x1, "b", "c", "asd", "d");
        map1.put("name2", x1);
        System.out.println(map1);// ����ǣ�name1=����1��name2=����2
        // ÿ�����鶼��value��ʽ�洢
        Collection<List<String>> result = map1.values();
        System.out.println(result);// [[b, c, asd, d], [a, b, c]]
        // �൱���Ҿ���һ�����飬ֻ���������е�Ԫ��ȫ����list����
        Map<String, Integer> xx = new HashMap<>();
        for (List<String> re1 : result) {
            for (String s : re1) {
                if (xx.containsKey(s)) {
                    //�ж��Ƿ�������key
                    xx.put(s, xx.get(s) + 1);
                    //��Ϊkey�ǲ���ģ�����ֱ�Ӷ�value���ݱ仯����
                } else {
                    xx.put(s, 1);
                }
            }
        }
        System.out.println(xx);

    }
}
