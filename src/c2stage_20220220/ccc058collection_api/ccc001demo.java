package c2stage_20220220.ccc058collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc058collection_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-21-09  ���ڶ�
 */
public class ccc001demo {
    public static void main(String[] args) {
        Collection<String> x = new ArrayList<>();
        x.add("a");
        x.add("b");
        x.add("c");
        x.add("demo");
        x.add("java");
        System.out.println(x);
        System.out.println("�Ƿ�Ϊ�գ�" + x.isEmpty());// false
        Object[] x1 = x.toArray();//ת��Ϊ����,���ص���Object���ͣ�
        // ���ǲ���ֱ��ת��ΪString���ͣ���Ϊ�ᱨ��
        // ��;�������int���͵����ݣ����ֱ��ת�����ᱨ��
        // �������ĺô��Ǽ����Ը�ǿ
        // �Ѽ���ת��Ϊ����
        System.out.println(Arrays.toString(x1));// [a, b, c, demo, java]
        // *****************************************
        ArrayList<String> x2 = new ArrayList<>();
        x2.add("demo1");
        x2.add("demo2");
        x2.add("aaa");
        System.out.println(x2);// [demo1, demo2, aaa]
        x.addAll(x2);
        System.out.println(x);// [a, b, c, demo, java, demo1, demo2, aaa]
        // �����ǰ�˳��������ӵ�

    }
}
