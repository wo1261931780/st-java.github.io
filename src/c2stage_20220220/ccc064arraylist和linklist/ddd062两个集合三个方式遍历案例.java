package c2stage_20220220.ccc064arraylist��linklist;
/*
    List���ϳ������ࣺArrayList��LinkedList
        ArrayList���ײ����ݽṹ�����飬��ѯ�죬��ɾ��
        LinkedList���ײ����ݽṹ��������ѯ������ɾ��

    ��ϰ��
        �ֱ�ʹ��ArrayList��LinkedList��ɴ洢�ַ���������
 */
/*
    ����
        ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���

    ˼·��
        1:����ѧ����
        2:����ArrayList���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������
            ���������������еı�����ʽ
            ��ͨfor�����������ı�����ʽ
            ��ǿfor�����ı�����ʽ
 */

import java.util.*;

public class ddd062��������������ʽ�������� {
    public static void main(String[] args) {
        ArrayList<ddd061������> x = new ArrayList<>();
        ddd061������ x2 = new ddd061������("a1", 11);
        ddd061������ x3 = new ddd061������("a2", 22);
        ddd061������ x4 = new ddd061������("a3", 33);
        x.add(x2);
        x.add(x3);
        x.add(x4);
        System.out.println("----------------------------------");
        for (int i = 0; i < x.size(); i++) {
            ddd061������ xx = x.get(i);
            System.out.println(xx.getName() + "," + xx.getAge());
        }
        System.out.println("----------------------------------");
        Iterator<ddd061������> x5 = x.iterator();
        while (x5.hasNext()) {
            ddd061������ x6 = x5.next();
            System.out.println(x6.getName() + "--" + x6.getAge());
        }
        System.out.println("----------------------------------");
        for (ddd061������ i : x) {
            System.out.println(i.getName() + "**" + i.getAge());
        }
        System.out.println("----------------------------------");
        // System.out.println("----------------------------------");
        // System.out.println("----------------------------------");
        LinkedList<ddd061������> x1 = new LinkedList<>();
        x1.add(x2);
        x1.add(x3);
        x1.add(x4);
        for (int i = 0; i < x1.size(); i++) {
            ddd061������ xx = x1.get(i);
            System.out.println(xx.getName() + "," + xx.getAge());
        }
        System.out.println("----------------------------------");
        Iterator<ddd061������> x7 = x1.iterator();
        while (x7.hasNext()) {
            ddd061������ x8 = x7.next();
            System.out.println(x8.getName() + "--" + x8.getAge());
        }
        System.out.println("----------------------------------");
        for (ddd061������ i : x1) {
            System.out.println(i.getName() + "**" + i.getAge());
        }
    }

}
