package abc����ѧϰ2021��10��2��.bbb049ѧ����������¼��;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb051������̳� {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<bbb050��̳�> xx = new ArrayList<bbb050��̳�>();
        System.out.println("��������");
        //����ff������xx��Ϊ����
        ff(xx);
        System.out.println("��������");
        ff(xx);
        System.out.println("��������");
        ff(xx);
        for (int z = 0; z < xx.size(); z++) {
            System.out.println("��ʼ������");
            //������������д���
            bbb050��̳� q = xx.get(z);
            //ʹ�����е�getname������ȡ�������ݡ�
            System.out.println(q.getName() + q.getAge());
        }
    }

    public static void ff(ArrayList<bbb050��̳�> xx) {
        //¼������------------------------
        Scanner x = new Scanner(System.in);
        System.out.println("������������");
        String x1 = x.nextLine();
        System.out.println("���������䣺");
        int x2 = x.nextInt();
        //����ѧ������
        bbb050��̳� z1 = new bbb050��̳�(x1, x2);
        //��x1��ֵ��name
        z1.setName(x1);
        //ͬ��ֵage
        z1.setAge(x2);
        //����������Ӷ���-----------------------
        xx.add(z1);
        //�����鲻ͬ��arraylist�Ǽ��ϣ�
        //�������Ĵ������֣�arraylist���Դ��浥��Ԫ��x1��������Ϣ��
        //���磬x1.getname��x1.getage��
    }
}
