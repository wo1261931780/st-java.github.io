package c2stage_20220220.ccc069collection_conflict;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc069collection_conflict
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-21-01  ������
 */
public class ccc001�����޸��쳣���� {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("demo1");
        x.add("demo2");
        x.add("demo3");
        x.add("demo4");
        x.add("demo1");
        x.add("demo1");
        show1(x);
        x.add("demo1");
        x.add("demo1");
        x.add("demo1");
        // show2(x);
        x.add("demo1");
        x.add("demo1");
        x.add("demo1");
        show3(x);
        x.add("demo1");
        x.add("demo1");
        x.add("demo1");
        show4(x);
    }

    public static void show1(List<String> x) {
        Iterator<String> demoit = x.iterator();
        System.out.println(x);// [demo1, demo2, demo3, demo4, demo1, demo1]
        while (demoit.hasNext()) {
            String demost = demoit.next();
            if (demost.equals("demo1")) {
                // ����ֱ��ʹ��listɾ��������ַ��գ�һ����������λ��
                // ���²���Ԫ�ر�����
                // ʵ����Ҫʹ�õ�����ȥɾ��
                demoit.remove();
            }
        }
        System.out.println("finish");
        System.out.println(x);// [demo2, demo3, demo4]
    }

    public static void show2(List<String> x) {
        // x.forEach(s-> System.out.println(s));
        x.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if (s.equals("demo1")) {
                    x.remove(s);
                }
            }
        });
        System.out.println(x);
    }

    public static void show3(List<String> x) {
        for (String i : x) {
            if (i.matches("[49]")) {// demo1=[100, 101, 109, 111, 49]
                x.remove(i);//Ҳ�����һ�߱���һ��ɾ�������
            }
        }
        System.out.println(x);
    }

    public static void show4(List<String> x) {
        for (int i = x.size()-1; i >= 0; i--) {
            String s = x.get(i);
            if (s.equals("demo1")) {
                // x.remove(s);
                x.remove(i);
            }
        }
        System.out.println(x);
    }
}
