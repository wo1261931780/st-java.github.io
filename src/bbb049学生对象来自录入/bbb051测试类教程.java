package bbb049ѧ����������¼��;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb051������̳� {
    public static void main(String[] args) {
        ArrayList<bbb050��̳�> xx = new ArrayList<bbb050��̳�>();//�������϶���
        System.out.println("��������");
        ff(xx);//����ff������xx��Ϊ����
        System.out.println("��������");
        ff(xx);
        System.out.println("��������");
        ff(xx);
        for (int z = 0; z < xx.size(); z++) {
            System.out.println("��ʼ������");
            bbb050��̳� q = xx.get(z);//������������д���
            System.out.println(q.getName() + q.getAge());//ʹ�����е�getname������ȡ�������ݡ�
        }
    }

    public static void ff(ArrayList<bbb050��̳�> xx) {
        Scanner x = new Scanner(System.in);//¼������------------------------
        System.out.println("������������");
        String x1 = x.nextLine();
        System.out.println("���������䣺");
        int x2 = x.nextInt();
        bbb050��̳� z1 = new bbb050��̳�(x1, x2);//����ѧ������
        z1.setName(x1);//��x1��ֵ��name
        z1.setAge(x2);//ͬ��ֵage
        xx.add(z1);//����������Ӷ���-----------------------
        //�����鲻ͬ��arraylist�Ǽ��ϣ�
        //�������Ĵ������֣�arraylist���Դ��浥��Ԫ��x1��������Ϣ��
        //���磬x1.getname��x1.getage��
    }
}
