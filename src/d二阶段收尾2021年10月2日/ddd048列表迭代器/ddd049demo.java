package d���׶���β2021��10��2��.ddd048�б������;
/*
    ListIterator���б������
        ͨ��List���ϵ�listIterator?()�����õ�������˵����List�������еĵ�����
        �����������Ա����һ��������б���б�ĵ��������ڵ����ڼ��޸��б�����ȡ�б��е������ĵ�ǰλ��

    ListIterator�еĳ��÷���
        E next()�����ص����е���һ��Ԫ��
        boolean hasNext()������������и���Ԫ�أ��򷵻� true
        E previous?()�������б��е���һ��Ԫ��
        boolean hasPrevious?()��������б���������෴��������б�ʱ���и���Ԫ�أ��򷵻� true
        void add?(E e)����ָ����Ԫ�ز����б�
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ddd049demo {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("bbb");
        x.add("ccc");
        ListIterator<String> x1 = x.listIterator();
        // ע�Ͳ��ֿ����У������ڷ��ص�
        // ------------------------------------------------------
        // while (x1.hasNext()) {
        //     String x2 = x1.next();
        //     System.out.println(x2);
        // }
        // System.out.println("ִ�н���");
        // System.out.println(x);
        // // ����ı�����Ĭ���Ǵ����һ��Ԫ�ؿ�ʼ����
        // while (x1.hasPrevious()) {
        //     String x3 = x1.previous();
        //     System.out.println(x3);
        // }
        // System.out.println("end");
        // ------------------------------------------------------
        while (x1.hasNext()) {
            String x2 = x1.next();
            System.out.println(x2);
            if (x2.equals("ccc")) {
                x1.add("javaee");
            }
            // ���ԭ���Ĳ�������
            // �����add������������listiterator�б������
            // �б������û�г��ֱ���
            // ��Դ�������
            // �б�������е�add��������ʵ���޸�ֵ����ֵ�������޸�ֵ
            // ͬʱ���ڿ��ܳ��ֱ��������У�����try...catch�������Ա����������
            // ����addû���쳣
        }
        System.out.println(x);

    }
}
