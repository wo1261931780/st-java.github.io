package d���׶���β2021��10��2��.ddd052���ַ�������ѧ������;
/*
    ����
        ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���

    ˼·��
        1:����ѧ����
        2:����List���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������
            ���������������еı�����ʽ
            ��ͨfor�����������ı�����ʽ
            ��ǿfor�����ı�����ʽ
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ddd054������ {
    public static void main(String[] args) {
        List<ddd053������> x = new ArrayList<>();
        ddd053������ x1 = new ddd053������("a1", 11);
        ddd053������ x2 = new ddd053������("a2", 22);
        ddd053������ x3 = new ddd053������("a3", 33);
        x.add(x1);
        x.add(x2);
        x.add(x3);
        // ---------------------------------------------------------------
        for (int i = 0; i < x.size(); i++) {
            ddd053������ xx = x.get(i);
            System.out.println(xx.getName() + "," + xx.getAge());
        }
        System.out.println("��һ�α�������----------------------------------");
        Iterator<ddd053������> xx1 = x.iterator();
        while (xx1.hasNext()) {
            ddd053������ s = xx1.next();
            System.out.println(s.getName() + "--" + s.getAge());
        }
        System.out.println("�ڶ��α�������----------------------------------");
        ListIterator<ddd053������> xx2 = x.listIterator();
        // while (xx2.hasNext()) {
        //     ddd053������ xx3 = xx2.next();
        //     System.out.println(xx3.getName() + "**" + xx3.getAge());
        // }
        for (ddd053������ i : x) {
            System.out.println(i.getName() + "**" + i.getAge());
        }
        System.out.println("�����α�������----------------------------------");


    }
}
