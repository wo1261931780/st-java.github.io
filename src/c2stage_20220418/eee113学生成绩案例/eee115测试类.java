package c2stage_20220418.eee113ѧ���ɼ�����;
/*
    ���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�)��Ҫ���ճɼ��ִܷӸߵ���д���ı��ļ�
          ��ʽ������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�	����������ϼ,98,99,100

    ˼·��
        1:����ѧ����
        2:����TreeSet���ϣ�ͨ���Ƚ��������������
        3:����¼��ѧ������
        4:����ѧ�����󣬰Ѽ���¼������ݶ�Ӧ��ֵ��ѧ������ĳ�Ա����
        5:��ѧ��������ӵ�TreeSet����
        6:�����ַ��������������
        7:�������ϣ��õ�ÿһ��ѧ������
        8:��ѧ�����������ƴ�ӳ�ָ����ʽ���ַ���
        9:�����ַ��������������ķ���д����
        10:�ͷ���Դ
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class eee115������ {
    public static void main(String[] args) throws IOException {
        // ArrayList<eee114������> xx = new ArrayList<>();
        // ��Ҫ�Ƚϣ���������ʹ��treeset���ϣ�
        // ������Ҫ��д������ʹ�������ڲ���ķ�ʽ����
        TreeSet<eee114������> xx = new TreeSet<>(new Comparator<eee114������>() {
            @Override
            public int compare(eee114������ o1, eee114������ o2) {
                int num = o1.getScore_all() - o2.getScore_all();
                int num2 = num == 0 ? o1.getScore_yw() - o2.getScore_yw() : num;
                int num3 = num2 == 0 ? o1.getScore_math() - o2.getScore_math() : num2;
                int num4 = num3 == 0 ? (o1.getName().compareTo(o2.getName())) : num3;
                return num4;
            }
        });

        int i = 0;
        while (i < 3) {
            wri(xx);
            System.out.println("------");
            i++;
        }
        filewri(xx);

    }

    public static void wri(TreeSet<eee114������> xx) {
        Scanner x = new Scanner(System.in);
        System.out.println("������������");
        String x2 = x.nextLine();
        System.out.println("������ѧ�ţ�");
        String x3 = x.nextLine();
        System.out.println("���������ĳɼ���");
        int x4 = x.nextInt();
        System.out.println("��������ѧ�ɼ���");
        int x5 = x.nextInt();
        System.out.println("������Ӣ��ɼ���");
        int x6 = x.nextInt();
        int sum = x4 + x5 + x6;
        eee114������ x1 = new eee114������(x2, x3, x4, x5, x6, sum);
        // System.out.println(x1.getName() + "��" + x1.getNum() + "��" + x1.getScore_yw() + "��" + x1.getScore_math() + "��" + x1.getScore_en());
        xx.add(x1);
    }

    public static void filewri(TreeSet<eee114������> xx) throws IOException {
        BufferedWriter x = new BufferedWriter(new FileWriter("l:\\java\\demo.txt"));
        for (eee114������ i : xx) {
            StringBuilder x1 = new StringBuilder();
            x1.append(i.getName()).append(",").append(i.getNum()).append(",").append(i.getScore_yw()).append(",").append(i.getScore_math()).append(",").append(i.getScore_en()).append(",").append(i.getScore_all());
            // x.write(String.valueOf(x1));
            // �ٷ��Ƽ�ʹ��tostring����д��
            x.write(x1.toString());
            x.newLine();
            x.flush();
        }
        x.close();
    }
}
