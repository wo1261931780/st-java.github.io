package bbb055�Լ�д��ѧ������ϵͳ;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb067 {
    public static void main(String[] args) {
        ArrayList<bbb066lei> ceshi = new ArrayList<>();
        bbb066lei cs = new bbb066lei();
        Scanner no0 = new Scanner(System.in);
        jm(ceshi);
        int sr = no0.nextInt();
        for (int cishu = 0; sr > 0 && sr < 6; sr = no0.nextInt()) {
            switch (sr) {
                case 1:
                    tj(ceshi);
                    jm(ceshi);
                    break;
                case 2:
                    sc(ceshi);
                    jm(ceshi);
                    break;
                case 3:
                    xg(ceshi);
                    jm(ceshi);
                    break;
                case 4:
                    ck(ceshi);
                    jm(ceshi);
                    break;
                case 5:
                    System.out.println("��лʹ��ϵͳ");
                    return;
                default:
                    System.out.println("���ִ��󣬳����˳�");
                    break;
            }
        }
        System.out.println("�����˳��ɹ�");
    }

    public static void jm(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        System.out.println("----------ѧ������ϵͳ----------");
        System.out.println("1.���ѧ��");
        System.out.println("2.ɾ��ѧ��");
        System.out.println("3.�޸�ѧ��");
        System.out.println("4.�鿴����ѧ��");
        System.out.println("5.�˳�");
        System.out.println("���������ѡ��");
        //        int sr=shuru.nextInt();
    }

    //11111111111111111
    public static void tj(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        String srsz = "";
        ////////////��һ�β������
        while (true) {
            System.out.println("ѧ�����֣�");
            srsz = shuru.nextLine();
            boolean falg = cf(ceshi, srsz);
            if (falg) {
                System.out.println("...");
            } else {
                break;
            }
        }
        ////////////��һ�β������

        System.out.println("ѧ��������");
        String srxm = shuru.nextLine();
        System.out.println("ѧ�����䣺");
        String srxl = shuru.nextLine();
        System.out.println("ѧ����ַ��");
        String srdz = shuru.nextLine();
        bbb066lei xs = new bbb066lei(srsz, srxm, srxl, srdz);
        //        bbb066lei x1=xs.getNumber();
        ceshi.add(xs);
        System.out.println(xs);
        System.out.println(ceshi.get(0).getAddress());
    }

    public static boolean cf(ArrayList<bbb066lei> ceshi, String srsz) {
        boolean falg = false;
        for (int x = 0; x < ceshi.size(); x++) {
            bbb066lei x1 = ceshi.get(x);
            if (x1.getNumber().equals(srsz)) {
                System.out.println("ѧ���Ѿ����ڣ���Ҫ��������");
                falg = true;
                break;
            } else {
            }
        }
        return falg;
    }

    //2222222222222222
    public static void sc(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        System.out.println("����ȷ����ѧ��ѧ�ţ�");
        String sr = shuru.nextLine();
        for (int x = 0; x < ceshi.size(); x++) {
            bbb066lei xs = ceshi.get(x);
            if (xs.getNumber().equals(sr)) {
                System.out.println("��������" + xs.getName() + "ִ��ɾ��");
                ceshi.remove(x);
            } else {
                System.out.println("ѧ�Ų�����");
            }
        }
        System.out.println("ɾ��ִ�����");
    }

    //333333333333333{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
    public static void xg(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        System.out.println("������Ҫ�޸ĵ�ѧ��ѧ��");
        String sr = shuru.nextLine();
        for (int x = 0; x < ceshi.size(); x++) {
            System.out.println("��ʼ����");
            bbb066lei xs = ceshi.get(x);
            if (xs.getNumber().equals(sr)) {
                System.out.println("��������" + xs.getName() + "ִ���޸�");
                System.out.println("�޸�ѧ��Ϊ��");
                String srsz = shuru.nextLine();
                xs.setNumber(srsz);
                System.out.println("�޸�ѧ������Ϊ��");
                String srxm = shuru.nextLine();
                xs.setName(srxm);
                System.out.println("�޸�ѧ�����䣺");
                String srxl = shuru.nextLine();
                xs.setAge(srxl);
                System.out.println("�޸�ѧ����ַ��");
                String srdz = shuru.nextLine();
                xs.setAddress(srdz);
                //̫������---------------------
            } else {
                System.out.println("ѧ�Ų�����");
            }
        }
        System.out.println("�޸����");
    }

    //444444444444444444444444
    public static void ck(ArrayList<bbb066lei> ceshi) {
        Scanner shuru = new Scanner(System.in);
        //        String sr=shuru.nextLine();
        if (ceshi.size() != 0) {
            for (int xx = 0; xx < ceshi.size(); xx++) {
                System.out.println("��ʼ����");
                bbb066lei xs = ceshi.get(xx);
                System.out.println(xs.getNumber());
            }
        } else {
            System.out.println("�����ݣ���������ѧ����Ϣ��");
        }
    }


}
