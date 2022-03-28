package c2stage_20220326.ccc092map;

import java.util.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc092map
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-24  ������
 */
public class ccc001map {
    public static void main(String[] args) {
        Map<String, Integer> x = new HashMap<>();
        x.put("qwe", 123);
        System.out.println(x.put("qwe", 123));
        x.put("qwe", 333);
        System.out.println(x);//{qwe=333}
        // ���ȣ���������ظ�Ԫ�أ�
        // ��Σ���key��ͬ��ʱ�򣬻��֮ǰ�����ݽ���һ�θ���
        x.put("aa", 333);
        System.out.println(x);// {aa=333, qwe=333}
        // ջ���͵�����
        // ���еļ��϶���д���ݣ���Ϊ�ڲ���д��tostring����
        System.out.println("******************************");
        show();// linkedhashmap������ģ�����Ԫ�����˳���������
        // show_clear(x);
        // show_isempty(x);
        // show_contains(x);
        // show_getvalue(x);
        // show_set(x);
        // show_value(x);
        System.out.println("******************************");
        show_add();
    }

    public static void show() {
        System.out.println("******************************");

        Map<String, Integer> x = new LinkedHashMap<>();
        x.put("qwe", 123);
        System.out.println(x.put("qwe", 123));
        x.put("bbb", 333);
        System.out.println(x);
        x.put("aa", 333);
        System.out.println(x);
    }

    public static void show_clear(Map<String, Integer> x) {
        System.out.println("******************************");

        x.clear();
    }

    public static void show_isempty(Map<String, Integer> x) {
        System.out.println("******************************");

        System.out.println(x.isEmpty());
    }

    public static void show_getvalue(Map<String, Integer> x) {
        System.out.println("******************************");

        Integer result = x.get("1");// û�е�����¾���null
        // һ�㶼�Ǹ���keyȥ��ȡvalue
        System.out.println(result);
        x.remove("qwe");
        System.out.println(x);
    }

    public static void show_contains(Map<String, Integer> x) {
        System.out.println("******************************");

        System.out.println(x.containsKey("aa"));
        System.out.println(x.containsValue("aa"));
    }

    public static void show_set(Map<String, Integer> x) {
        System.out.println("******************************");

        Set<String> demoset = x.keySet();
        // ���ﷵ��һ��set���͵ļ��϶���
        System.out.println(demoset);
    }

    public static void show_value(Map<String, Integer> x) {
        Collection<Integer> demo_value = x.values();
        // ��ȡ����ֵ������Ϊһ��collection���ϣ���Ϊֵ�����ظ�������collection�ڲ��ǿ����ظ���
        System.out.println(demo_value);// [333, 333]
    }

    public static void show_add() {
        Map<String, Integer> x1 = new HashMap<>();
        x1.put("a1", 11);
        x1.put("a2", 22);
        Map<String, Integer> x2 = new HashMap<>();
        // x2.put("a1", 11);
        // x2.put("a2", 22);
        // x2.put("a3", 33);
        x2.put("aa1", 33);
        x2.put("aa2", 44);
        x2.put("aa3", 55);
        x1.putAll(x2);
        System.out.println(x1);// ������ߵ�������ȫ��ͬ���Ͳ��ᷢ���仯
        // {a1=11, aa1=33, a2=22, aa3=55, aa2=44}
        // ���ջ��ǰ���key��˳��������
    }
}
