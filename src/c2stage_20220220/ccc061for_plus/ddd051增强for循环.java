package c2stage_20220220.ccc061for_plus;
/*
    ��ǿfor���������Collection���ϵı���
        ʵ��Iterable�ӿڵ�������������Ϊ��ǿ�� for����Ŀ��
        ����JDK5֮����ֵģ����ڲ�ԭ����һ��Iterator������

    ��ʽ��
        for(Ԫ���������� ������ : �������Collection����) {
            //�ڴ˴�ʹ�ñ������ɣ��ñ�������Ԫ��
        }
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ddd051��ǿforѭ�� {
    public static void main(String[] args) {
        int[] x = {1, 2, 2, 3, 32, 3, 13, 12};
        for (int i : x) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        String[] x1 = {"a1", "a2", "a3", "a4", "a5", "a6", "a7"};
        for (String i : x1) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        List<String> x3 = new ArrayList<>();
        x3.add("aaa");
        x3.add("bbb");
        x3.add("ccc");
        for (String i : x3) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        for (String i : x3) {
            System.out.println(i);
            if (i.equals("ccc")) {
                x3.add("javaee");
            }
            // ֻҪ�����쳣���ʹ������ڲ���iterator������
            // ͬ���ģ����������Ʒ�����������̳�/ʵ����ϵ
        }
        System.out.println("-------------------------------------");
        ListIterator<String> x4 = x3.listIterator();
        // ����for eachѭ����������listIterator����
        // for (String i : x4) {
        //     System.out.println(i);
        // }
    }
}
