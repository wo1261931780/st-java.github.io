package c2stage_20220220.ccc068list_case;
/*
    ����
        ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
    ˼·��
        1:����ѧ����
        2:����List���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������(��������ʽ��forѭ����ʽ)
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ddd044list���� {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        List<ddd043������> x = new ArrayList<>();
        ddd043������ x1 = new ddd043������("a", 11);
        ddd043������ x2 = new ddd043������("b", 22);
        ddd043������ x3 = new ddd043������("c", 33);
        x.add(x1);
        x.add(x2);
        x.add(x3);
        // System.out.println(x1.getName() + x1.getAge());
        System.out.println();
        // showdemo(x);
        showdemo2(x);
        // ����ͨ������ʹ��forѭ�������ǿ��ǵ�listΪcollection������
        // ���Ե�����Ҳ����ʹ��
    }


    public static void showdemo(List<ddd043������> x) {
        for (int i = 0; i < x.size(); i++) {
            ddd043������ xx = x.get(i);
            System.out.println(xx.getName() + "," + xx.getAge());
            System.out.println("��������" + i);
        }
    }

    public static void showdemo2(List<ddd043������> x) {
        Iterator<ddd043������> x1 = x.iterator();
        while (x1.hasNext()) {
            ddd043������ x2 = x1.next();
            System.out.print("�����������");
            System.out.println(x2.getName() + x2.getAge());
        }
    }
}
