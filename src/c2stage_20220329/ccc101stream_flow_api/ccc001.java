package c2stage_20220329.ccc101stream_flow_api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220329.ccc003stream_flow_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-22-31  ���ڶ�
 */
public class ccc001 {
    public static void main(String[] args) {
        List<String> demo1 = new ArrayList<>();
        demo1.add("aasda");
        demo1.add("aaasda");
        demo1.add("adsga");
        demo1.add("aadfgdfa");
        demo1.add("aaa");
        demo1.add("aa");
        demo1.stream().filter(s -> s.startsWith("a") && s.length() <= 3).forEach(System.out::println);
        // ����һ��˵����
        // System.out::println����System.outprintln(s),
        // ����һ�ַ������õ���ʽ
        demo1.stream().limit(2).forEach(System.out::println);
        demo1.stream().skip(4).forEach(System.out::println);
        demo1.stream().limit(3).count();// stream���Ľ����������ҽ���һ��
        // ��ʵ�����е����⣬�������Ҫ�Խ����һ����в�����Ȼ����һ�����������������ս����߽�Ϸ��أ�stream�����޷�����
        // demo1.stream().map(new Function<String, String>() {
        //     // ������൱�ڣ��ڲ��½���һ��������
        //     // �������ȴ���string���͵�����
        //     // Ȼ�󷵻صĽ��Ҳ��string���͵�����
        //     @Override
        //     public String apply(String s) {
        //         return "Ƭͷ��" + s;
        //     }
        // }).forEach(System.out::println);
        demo1.stream().map(s -> "���ԣ�" + s).forEach(System.out::println);
        // ����Ĵ�����Ժ�Ľ��

    }
}
