package c2stage_20220418.eee108���ϵ��ļ��Ľ�����;
/*
    ����
        ��ArrayList�����е�ѧ������д�뵽�ı��ļ���Ҫ��ÿһ��ѧ�������������Ϊ�ļ��е�һ������
        ��ʽ��ѧ��,����,����,��ס��	������itheima001,����ϼ,30,����

    ˼·��
        1:����ѧ����
        2:����ArrayList����
        3:����ѧ������
        4:��ѧ��������ӵ�������
        5:�����ַ��������������
        6:�������ϣ��õ�ÿһ��ѧ������
        7:��ѧ�����������ƴ�ӳ�ָ����ʽ���ַ���
        8:�����ַ��������������ķ���д����
        9:�ͷ���Դ
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class eee110������ {
    public static void main(String[] args) throws IOException {
        ArrayList<eee109������> x = addway();

        BufferedWriter xx = new BufferedWriter(new FileWriter("l:\\java\\demo.txt"));
        for (eee109������ i : x) {
            String x1 = "ѧ�ţ�" + i.getNum() + "\t������" + i.getName() + "\t���䣺" + i.getAge() + "\t��ַ��" + i.getAddress();
            xx.write(x1);
            xx.newLine();
            xx.flush();
        }
        xx.close();
        System.out.println("������");
    }

    public static ArrayList<eee109������> addway() {
        eee109������ x1 = new eee109������(111, "aaa", 11, "a1");
        eee109������ x2 = new eee109������(222, "bbb", 22, "a2");
        eee109������ x3 = new eee109������(333, "ccc", 33, "a3");
        eee109������ x4 = new eee109������(444, "ddd", 44, "a4");
        eee109������ x5 = new eee109������(555, "eee", 55, "a5");
        ArrayList<eee109������> x = new ArrayList<>();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        x.add(x4);
        x.add(x5);
        return x;
    }
}
