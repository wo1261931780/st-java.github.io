package d���׶���β2021��10��2��.ddd024���Ͻ���;
/*
    Collection���ϳ��÷���:
        boolean add(E e):���Ԫ��
        boolean remove(Object o):�Ӽ������Ƴ�ָ����Ԫ��
        void clear():��ռ����е�Ԫ��
        boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ��
        boolean isEmpty():�жϼ����Ƿ�Ϊ��
        int size():���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���

    Alt+7   ��һ�����ڣ��ܹ��������������Ϣ
 */
/*
        //�������϶���
        Collection<String> c = new ArrayList<String>();

        //boolean add(E e):���Ԫ��
        // System.out.println(c.add("hello"));
        c.add("hello");

        //boolean remove(Object o):�Ӽ������Ƴ�ָ����Ԫ��
        // System.out.println(c.remove("world"));
        // System.out.println(c.remove("javaee"));

        //void clear():��ռ����е�Ԫ��
        // c.clear();

        //boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ��
        // System.out.println(c.contains("world"));
        // System.out.println(c.contains("javaee"));

        //boolean isEmpty():�жϼ����Ƿ�Ϊ��
        // System.out.println(c.isEmpty());

        //int size():���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
        System.out.println(c.size());

        //������϶���
        System.out.println(c);
 */

import java.util.ArrayList;
import java.util.Collection;

public class ddd026collection���÷���add {
    public static void main(String[] args) {
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("bbb");
        // x.add("aaa");
        System.out.println(x);
        // ��������[aaa, bbb, aaa]
        // ʵ�����Ǵ����ظ���ӵ����
        // --------------------------------------------------------
        // �鿴Դ�룺
        // public boolean add(E e) {
        //     modCount++;
        //     add(e, elementData, size);
        //     return true;
        // }
        // --------------------------------------------------------
        System.out.println(x.add("aaa"));
        // ���е�x.add()���᷵��true
        System.out.println(x);
        // ������Ĳ�ͬ�����ϵ�������԰�˳��
        // ��һ��������������������Ժ��������
        // ����Դ������ͼ�Ժ�
        // alt+7���ɽ�����Ŀ�ṹ


    }
}
