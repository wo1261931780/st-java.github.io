package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

public class aaa018e��ӡ�������� {
    public static void main(String[] args) {
        int[] xx = {11, 22, 33, 44, 55};
        show(xx);
        System.out.println("end");
        Scanner x1=new Scanner(System.in);
        System.out.println("������query�����ݣ�");
        int x2 = x1.nextInt();
        System.out.println(show2(xx,x2));
        System.out.println("end");
    }

    public static void show(int[] x) {
        if (x != null && x.length > 0) {
            //����&&�ȵ���&Ҫ��Ч��
            //&&���ж�·Ч�������Ϊ�٣��ұ߲�ִ��
            System.out.print("��������Ϊ��");
            for (int i = 0; i < x.length; i++) {
                //     if (i == (x.length - 1)) {
                //         System.out.println(x[i] + "]");
                //     } else {
                //         System.out.print(x[i]+",");
                //     }
                System.out.print(i == x.length - 1 ? x[i] + "]" : x[i] + ",");
            }
        }
    }
    public static int show2(int[] x,int data){// ��ֱ������һ����Ӧ����������������ֵ
        // Scanner x1=new Scanner(System.in);
        // System.out.println("������query�����ݣ�");
        // int x2 = x1.nextInt();
        // int xx=-1;
        for (int i = 0; i < x.length; i++) {
            // if (x[i] == x2){
            if (x[i] == data){
                System.out.println("index:"+i);
                // xx=i;
                // break;
                //������ȫ����Ҫbreak��ֱ�Ӵ�ϾͿ��ԡ�
                //returnһ�����ݣ�ֱ�Ӿͽ����˳���
                // ��������xxҲ����Ҫ����
                return i;
            }
        }
        // return xx;
        return -1;
    }


}
