package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

public class aaa018e��ӡ�������� {
    public static void main(String[] args) {
        int[] xx = {11, 22, 33, 44, 55};
        show(xx);
        System.out.println("end");
        Scanner x1 = new Scanner(System.in);
        System.out.println("������query�����ݣ�");
        int x2 = x1.nextInt();
        System.out.println(show2(xx, x2));
        System.out.println("end");
        int[] x3 = {11, 33, 22, 44,55};
        que(xx, x3);


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

    public static int show2(int[] x, int data) {// ��ֱ������һ����Ӧ����������������ֵ
        // Scanner x1=new Scanner(System.in);
        // System.out.println("������query�����ݣ�");
        // int x2 = x1.nextInt();
        // int xx=-1;
        for (int i = 0; i < x.length; i++) {
            // if (x[i] == x2){
            if (x[i] == data) {
                System.out.println("index:" + i);
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

    public static void que(int[] xx, int[] x1) {//2022��1��2��17:08:13����һ��д
        if (xx.length == x1.length) {
            OUT:
            for (int i = 0; i < xx.length; i++) {
                if (xx[i] == x1[i]) {
                    System.out.println("right index");
                } else {
                    System.out.println("someting wrong");
                    break OUT;
                }
            }
            // System.out.println("total equal");
        }else{
            System.out.println("error");
        }
        System.out.println("****");
    }
    public static boolean que2(int[] xx, int[] x1){//2022��1��2��17:08:23���Ľ��Ժ�
        if (xx.length==x1.length){
            for (int i = 0; i < xx.length; i++) {
                if (xx[i]!=x1[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    // 2022��1��4��18:27:45������;�У�����û��



}
