package bbb038δ��ɵ���;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb040���� {/*
    public static void main(String[] args) {
        ArrayList<bbb040����> zz = new ArrayList<>();
        nothin(zz);
//        nothin(zz);
//        nothin(zz);
        z1.set(0,"s");
        //java: �����ݵ�����: java.lang.String�޷�ת��Ϊbbb038δ��ɵ���.bbb040����
        System.out.println("----------------------");
        for (int i = 0; i < zz.size(); i++) {
            System.out.println(zz.get(i));
        }
//        for (int z = 0,x1 = 0,z1=0; z < 3; z++,z1++) {
//            System.out.println(zx.getName()+zx.getAge());
//            zz.set(z,zx);
//        System.out.println("�������"+(z+1)+"λͬѧ��������");
//        String x0 = xx.nextLine();
//        System.out.println("�������"+(z+1)+"λͬѧ�ĳɼ���");
//        int x1 = xx.nextInt();
//            System.out.println(x2);
//    }
    public static void nothin(ArrayList<bbb040����> zz) {
        Scanner xx = new Scanner(System.in);
        System.out.println("������ͬѧ��������");
        String x0 = xx.nextLine();
        System.out.println("�������ͬѧ�ĳɼ���");
        int x1 = xx.nextInt();
        bbb039 zx = new bbb039(x0, x1);
        System.out.println(zx.getName(x0) + zx.getAge(x1));
        zx.getName(x0);
//        String q=zx.getName(x0);
        zx.getAge(x1);
//        zz.set(0,"1");
//        zz.add("x");
    }*/

    public static void main(String[] args) {
        ArrayList<String> z1 = new ArrayList<>();
        nothing(z1);//����ʹ�õ�nothing������static���εľ�̬����
        nothing(z1);
        nothing(z1);
        System.out.println(z1);
        for (int i = 0; i < z1.size(); i++) {
            System.out.println(z1.get(i));
        }
    }
    //ʵ�ֵĹ����ǣ�
    //���������ͳɼ����Զ���ʾ�����Ϣ
    //arr�д������ѧ������+����

    public static void nothing(ArrayList<String> z1) {
        Scanner xx = new Scanner(System.in);
        System.out.println("������ͬѧ��������");
        String x0 = xx.nextLine();
        System.out.println("�������ͬѧ�ĳɼ���");
        int x1 = xx.nextInt();
        bbb039 zx = new bbb039(x0, x1);
        System.out.println(zx.getName(x0) + zx.getAge(x1));
        String student = ("ѧ��������" + zx.getName(x0) + "��ѧ�����䣺" + zx.getAge(x1));
        z1.add(student);
    }
}

