package abc����ѧϰ2021��10��2��.bbb035ѧ������Ȼ�����;

import java.util.ArrayList;

public class bbb037bѧ�������� {
    public static void main(String[] args) {
        System.out.println("��ʼ����");
        // ����൱���ҵļ��ϣ�����ѧ�����д�����
        ArrayList<bbb037aѧ����> x = new ArrayList<>();
        // ������ӵĶ���Ҳ�����ѧ�����������е�
        bbb037aѧ���� x1 = new bbb037aѧ����(11, "s1");
        bbb037aѧ���� x2 = new bbb037aѧ����(22, "s2");
        bbb037aѧ���� x3 = new bbb037aѧ����(33, "s3");
        // ��Ӻ���ѧ�����Ժ����������У���Ӷ���
        // ������ӵ��Ƕ����Ӧ�ĵ�ַ
        // ���Ҫ��ȡ����������Ϣ����Ҫ���ʵ�ַ��Ȼ��ʹ��get/set����
        x.add(x1);
        x.add(x2);
        x.add(x3);
        for (int i = 0; i < x.size(); i++) {
            // System.out.println(x.get(i));
            System.out.println(x.get(i).getName() + "������Ϊ��" + x.get(i).getAge());
            // ͬ��Ҳ���԰��������д��ȥִ��
            // bbb036ѧ���� s = xs.get(x);
            // System.out.println("ѧ��������" + s.getName() + "��ѧ�����䣺" + s.getAge());
        }
    }
}

