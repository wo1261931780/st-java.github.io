package c2stage_20220326.ccc089Variable_parameters;
/*
    Arrays����������һ����̬������
        public static <T> List<T> asList?(T... a)��������ָ������֧�ֵĹ̶���С���б�

    List�ӿ�����һ����̬������
        public static <E> List<E> of?(E... elements)�����ذ�����������Ԫ�صĲ��ɱ��б�

    Set�ӿ�����һ����̬������
        public static <E> Set<E> of?(E... elements) ������һ��������������Ԫ�صĲ��ɱ伯��
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class eee012�ɱ������ʹ�� {
    public static void main(String[] args) {
        // public static <T> List<T> asList?(T... a)��������ָ������֧�ֵĹ̶���С���б�
        List<String> x = Arrays.asList("a1", "a2", "a3");
        // �����ӹ̶�Ԫ�ؿ���ʹ�ã����ǲ��ܼ���ʹ����Ӻ�ɾ��
        // x.add("aa");
        // x.remove("aa");
        // �����������������ʱ�쳣
        // x.set(1, "aaaa");
        // ����᷵�ر��޸ĵ�Ԫ��
        System.out.println(x.set(1, "aaaa"));
        // aslist�൱�ڹ̶��˼��ϵĴ�С
        System.out.println(x);
        // public static <E> List<E> of?(E... elements)�����ذ�����������Ԫ�صĲ��ɱ��б�
        List<String> x1 = List.of("a1", "a1", "a1", "aqweqwe", "aqweq");
        System.out.println(x1);
        // �����������ظ�Ԫ�صģ�
        // x1.remove("a1");
        // ������б�̶�����������ɾ��
        // public static <E> Set<E> of?(E... elements) ������һ��������������Ԫ�صĲ��ɱ伯��
        Set<String> x2 = Set.of("a1", "a2", "a3");
        // ͬ���ǲ��ɱ伯�ϣ����ɱ�����˲�����ɾ��
        // ���ﻹ������set������ص㣬���ܴ����ظ�Ԫ�أ�һ��ʼ���ھͻᱨ��
        System.out.println(x2);


    }
}
