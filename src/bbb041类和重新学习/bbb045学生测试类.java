package bbb041�������ѧϰ;

import java.util.Scanner;

public class bbb045ѧ�������� {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.println("������ѧ��������:");
        String x1 = xx.nextLine();
        System.out.println("������ѧ��������:");
        int x2 = xx.nextInt();
        //-------------------------------------
        //�����ѧ����û��̫���ϵ���˼��׶ε�ѧϰ...
        //-------------------------------------
        bbb044ѧ���� z = new bbb044ѧ����();
        //000001����ֱ���޲ι���
        //z.bbb044ѧ����(x1,x2);
        //000002�޲ι�������󣬱���������ʹ��������������ܸ�z���и�ֵ��
        //000003����Ĳ�ͬ���ڣ��̲Ŀ���ֱ�ӹ��죬�����ұ����޲ι��죬Ȼ����÷���
        z.show();
        //000004��ʾ���
        //z.st(x1,x2);
        bbb044ѧ���� w = new bbb044ѧ����("naem", 1);
        //1000001����������
        w.show();
        //1000002����Ϳ���ֱ�ӻ�ý����
        w.setName("asd");
        //1000003���߼���趨����ֵ���Ӷ���ý��
        w.setAge(1);
        w.show();
    }
}
