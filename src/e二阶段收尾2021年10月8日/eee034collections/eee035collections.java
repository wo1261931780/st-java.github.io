package e���׶���β2021��10��8��.eee034collections;
/*
    Collections��ĸ���
        ����Լ��ϲ����Ĺ�����

    Collections��ĳ��÷���
        public static <T extends Comparable<? super T>> void sort?(List<T> list)����ָ�����б���������
        public static void reverse?(List<?> list)����תָ���б���Ԫ�ص�˳��
        public static void shuffle?(List<?> list)��ʹ��Ĭ�ϵ����Դ�������ָ�����б�
 */

import java.util.*;

public class eee035collections {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(ran());
        x.add(ran());
        x.add(ran());
        x.add(ran());
        // ���漸�����������������������
        // --------------------------------
        // x.add(12);
        // x.add(789);
        // x.add(12487);
        // x.add(65465);
        // x.add(6487);
        // --------------------------------
        Collections.sort(x);
        // ��˳������
        // ����������ݵ�˳�򣬰�����Ȼ����С����С����
        // --------------------------------
        // Collections.reverse(x);
        // ����������ݵ�˳�򣬷�������
        // ������
        // ���1/2/9/5���������Ϊ1295���������5921
        // --------------------------------
        // Collections.shuffle(x);
        // ��������ݵ�˳����ң�
        // ������
        // ���1/2/9/5���������Ϊ1295�����Ҿ���2591�ȵ�
        // --------------------------------
        System.out.println(x);
    }

    public static int ran() {
        Random x1 = new Random();
        int x2 = x1.nextInt(200);
        return x2;
    }
}
