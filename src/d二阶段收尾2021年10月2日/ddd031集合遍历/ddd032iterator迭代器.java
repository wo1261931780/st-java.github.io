package d���׶���β2021��10��2��.ddd031���ϱ���;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ddd032iterator������ {
    public static void main(String[] args) {
        Collection<String> x = new ArrayList<>();
        x.add("aaa1");
        x.add("aaa2");
        x.add("aaa3");
        Iterator<String> x1 = x.iterator();
        // ���ﷵ�ص���Iterator��ʵ���࣬
        // Ҳ��һ��Itr�Ķ���
        // -----------------------------------------------------------
        // ˵�˻���
        // �����Ǽ���x�������ڲ���iterator������
        // ��iterator������������һ��Itr�Ķ���
        // iterator������һ���ӿڣ��൱��Itr������ӿڵ�ʵ����
        // ���仰˵��x1��ͨ����̬�ķ�ʽ����������
        // -----------------------------------------------------------
        // Դ����Ϊ�ӿڣ�����Ҫ��ʵ����
        // public Iterator<E> iterator() {
        //     return new ArrayList.Itr();
        // ���ظýӿڵ�ʵ�������Itrʵ����iterator�ӿ�
        // }
        // private class Itr implements Iterator<E> {
        // ...
        // }
        // ArrayList�еĽṹ�����ص���һ��Itr
        // -----------------------------------------------------------
        System.out.println(x1.next());
        // ��������귽����ʵ�����Ƕ�̬��ʽ�����˽ӿڶ���x1��
        // x1����ʹ�ýӿ��е�next����
        System.out.println(x1.next());
        System.out.println(x1.next());
        // System.out.println(x1.next());
        // ������next������ʵ���ǰ���˳��չʾ��ӦԪ�أ��������Ϸ�Χֱ�ӱ���
        // NoSuchElementException
        // -----------------------------------------------------------
        x1.hasNext();
        // ����true/false���ж���һ��Ԫ���Ƿ����
        if (x1.hasNext()) {
            System.out.println(x1.next());
        }
        
        System.out.println("ִ�����");


    }
}
