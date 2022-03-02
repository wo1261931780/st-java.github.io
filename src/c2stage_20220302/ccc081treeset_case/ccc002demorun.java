package c2stage_20220302.ccc081treeset_case;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc081treeset_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-55  ������
 */
public class ccc002demorun {
    public static void main(String[] args) {
        Set<ccc001applobject> x = new TreeSet<>();
        x.add(new ccc001applobject(11.11, "aa", 11, "bb"));
        x.add(new ccc001applobject(11.12, "aa", 12, "bb"));
        System.out.println(x);// ֱ������ᱨ����Ϊû�бȽϹ���Ĭ�ϱȽ��˵�ַ
        System.out.println("-----------------------------");
        // ��������ڲ��Դ��˱Ƚ���
        Set<ccc001applobject> x1 = new TreeSet<>(new Comparator<ccc001applobject>() {
            @Override
            public int compare(ccc001applobject o1, ccc001applobject o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        Set<ccc001applobject> x2 = new TreeSet<>(new Comparator<ccc001applobject>() {
            @Override
            public int compare(ccc001applobject o1, ccc001applobject o2) {
                // return o1.getPrice() - o2.getPrice();
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        x2.add(new ccc001applobject(11.11, "demo1", 22, "bb"));
        x2.add(new ccc001applobject(11.11, "demo1", 22, "bb"));
        x2.add(new ccc001applobject(11.21, "demo2", 23, "bb"));
        System.out.println(x2);

        // lambda���ʽ�򻯣�
        Set<ccc001applobject> x3 = new TreeSet<>((ccc001applobject o1, ccc001applobject o2) -> {
            return Double.compare(o1.getPrice(), o2.getPrice());
        });
        x3.add(new ccc001applobject(11.11, "demo1", 22, "bb"));
        x3.add(new ccc001applobject(11.11, "demo1", 22, "bb"));
        x3.add(new ccc001applobject(11.21, "demo2", 23, "bb"));
        System.out.println(x2);
        // lambda���ʽ��2��
        Set<ccc001applobject> x4 = new TreeSet<>((ccc001applobject o1, ccc001applobject o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
    }
}
