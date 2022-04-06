package c2stage_20220329.ccc099mapof;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc001
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-32  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) {
        List<String> demo = new ArrayList<>();
        demo.add("a1");
        demo.add("fg2");
        demo.add("awq3");
        demo.add("rqwr4");
        List<String> demo2 = new ArrayList<>();
        for (String s : demo) {
            if (s.startsWith("a") && s.length() < 3) {
                demo2.add(s);
            }
        }
        System.out.println(demo);// [a1, fg2, awq3, rqwr4]
        System.out.println(demo2);// [a1]
        show1(demo);// a1

    }

    public static void show1(List<String> demo) {
        demo.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() < 3).forEach(System.out::println);
        // ����һ������Ĵ��룬
        // ��������ʽ��̣�ÿ�ν��������һ������
        // ����stream������ʽ��ʼд�����һ��ɸѡ����ɸѡ���ڲ�ʹ��lambda���ʽ���в���
        // Ȼ����б������ڲ�foreach����lambda���ʽ�������
    }

    public static void show2() {
        // 1�����ɱ��List����
        List<Double> lists = List.of(569.5, 700.5, 523.0, 570.5);
        // lists.add(689.0);
        // lists.set(2, 698.5);
        // System.out.println(lists);
        double score = lists.get(1);
        System.out.println(score);

        // 2�����ɱ��Set����
        Set<String> names = Set.of("�����Ȱ�", "�����Ⱦ�", "�������", "����գ��");
        // names.add("����ү");
        System.out.println(names);

        // 3�����ɱ��Map����
        Map<String, Integer> maps = Map.of("huawei", 2, "Java����", 1, "�ֱ�", 1);
        // maps.put("�·�", 3);
        System.out.println(maps);
    }
}
