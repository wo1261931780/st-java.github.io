package bbb028Stringuild���;

import java.util.Scanner;

public class bbb031�ַ�����ת {
    public static void main(String[] args) {
        Scanner zz = new Scanner(System.in);
        System.out.println("�������ַ�����");
        String z1 = zz.nextLine();
        bbb031�ַ�����ת ff = new bbb031�ַ�����ת();
        ff.fz(z1);
        /*����������ʵ�ַ�ת�����ǻ���������
        int[] xx={1,2,3};
        bbb031�ַ�����ת x1=new bbb031�ַ�����ת();
        x1.fz(xx);*/
    }

    public void fz(String z1) {
        System.out.println(z1);
        //        String s="";
        for (int z = z1.length() - 1; z >= 0; z--) {
            System.out.print(z1.charAt(z) + "-");
            //            s+=z1.charAt(z);
            //            ����ٷ��ķ�������һ���Զ��������
        }
        System.out.println("��ת����");

        /*
        String x2="";
        System.out.print("[");
        for (int x=xx.length-1;x>=0;x--){
            x2+=xx[x];
            System.out.print(xx[x]+",");
            System.out.println("--------");
            if (x==0){
                System.out.print(x2+=xx[x]+"]");
            }else {
                System.out.print(x2+=xx[x]+",");
            }
        }*/
    }
}
