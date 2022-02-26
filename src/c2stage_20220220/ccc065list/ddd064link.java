package c2stage_20220220.ccc065list;

import java.util.LinkedList;

/**
 * LinkedList���ϵ����й��ܣ�
 * public void addFirst(E e)���ڸ��б�ͷ����ָ����Ԫ��
 * public void addLast(E e)����ָ����Ԫ��׷�ӵ����б��ĩβ
 * public E getFirst()�����ش��б��еĵ�һ��Ԫ��
 * public E getLast()�����ش��б��е����һ��Ԫ��
 * public E removeFirst()���Ӵ��б���ɾ�������ص�һ��Ԫ��
 * public E removeLast()���Ӵ��б���ɾ�����������һ��Ԫ��
 */
public class ddd064link {
    public static void main(String[] args) {
        // ע�⣬����ĵײ�������
        LinkedList<String> x = new LinkedList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        System.out.println(x);
        x.addFirst("first_code");
        x.addLast("last_code");
        System.out.println(x);
        // [first_code, a1, a2, a3, last_code]
        System.out.println("----------------------------");
        System.out.println(x.getFirst());
        System.out.println(x.getLast());
        // ֱ�ӷ��ػ�ȡ����Ԫ��
        System.out.println("----------------------------");
        System.out.println(x.removeFirst());
        System.out.println(x.removeLast());
        // ���ر��޸ĵ�Ԫ��
        System.out.println("----------------------------");
        System.out.println(x);
        // [a1, a2, a3]
    }
}
