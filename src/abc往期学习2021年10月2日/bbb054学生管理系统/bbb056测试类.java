package abc����ѧϰ2021��10��2��.bbb054ѧ������ϵͳ;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb056������ {
    public static void main(String[] args) {
        ArrayList<bbb055��> student = new ArrayList<>();//���ϣ�������������
        Scanner x0 = new Scanner(System.in);
        jm(student);
        int idea = x0.nextInt();
        // ����ָ���жϹ���ģ��-------------------------------------------
        // if (idea < 6 && idea > 0) {
        for (System.out.println("��ʼ�ж�"); idea < 6 || idea > 0; idea = x0.nextInt()) {
            if (idea == 1) {
                // db(student);
                tj(student);
                jm(student);
            } else if (idea == 2) {
                sc(student);
                jm(student);
            } else if (idea == 3) {
                xg(student);
                jm(student);
            } else if (idea == 4) {
                ck(student);
                jm(student);
            } else if (idea == 5) {
                System.out.println("�����˳�......");
                // System.out.println("��лʹ��,�˳����");
                break;
            } else {
                Scanner x1 = new Scanner(System.in);
                System.out.println("ָ������Ƿ��������룿yes/no");
                String z = x1.nextLine();
                if (z.equals("yes")) {
                    jm(student);
                } else {
                    break;
                }
            }
        }
        System.out.println("��лʹ��,ϵͳ�˳�");
    }

    //����
    public static void jm(ArrayList<bbb055��> student) {
        System.out.println("-----��ӭ����ѧ������ϵͳ-----");
        System.out.println("1--���ѧ��");
        System.out.println("2--ɾ��ѧ��");
        System.out.println("3--�޸�ѧ����Ϣ");
        System.out.println("4--�鿴ѧ����Ϣ");
        System.out.println("5--�˳�");
        System.out.println("���������Ա��ָ�");
        // Scanner x0 = new Scanner(System.in);
        // int idea = x0.nextInt();
        // System.out.println("��һ��ѭ��----------------------");
    }

    //�����Ƿ��ظ�
    public static void db(ArrayList<bbb055��> student) {
        Scanner a3 = new Scanner(System.in);
        System.out.println("��������Ҫ��ӵ�ѧ��:");
        String xgxh = a3.nextLine();
        for (int q2 = 0; q2 < student.size(); q2++) {
            //�ٷ������ķ����ǣ����趨һ���µı�����Ȼ����±���ֱ�Ӹ�д�ɱ�����
            bbb055�� q3 = student.get(q2);
            if (q3.getNumber().equals(xgxh)) {
                System.out.println("ѧ���Ѵ��ڣ���������������޸���Ϣ");
                // return;
            } else {
            }
        }
    }

    //��Ӷ���
    //¼��������Ǹ���Ա������ѧ����������Ժ󱣴浽��������ȥ
    public static void tj(ArrayList<bbb055��> student) {
        Scanner a1 = new Scanner(System.in);
        System.out.println("������ѧ��ѧ�ţ�");
        String xh = a1.nextLine();
        //------------------------------�����Ƿ�ֹ�ظ���ģ��
        for (int q2 = 0; q2 < student.size(); q2++) {
            //�ٷ������ķ����ǣ����趨һ���µı�����Ȼ����±���ֱ�Ӹ�д�ɱ�����
            bbb055�� q3 = student.get(q2);
            if (q3.getNumber().equals(xh)) {
                System.out.println("ѧ���Ѵ��ڣ���������������޸���Ϣ");
                return;
            } else {
            }
        }
        //--------------------------------------------------
        System.out.println("������ѧ��������");
        String xm = a1.nextLine();
        System.out.println("������ѧ�����䣺");
        String nl = a1.nextLine();
        System.out.println("������ѧ����ַ��");
        String dz = a1.nextLine();
        System.out.println("����ɹ�!");
        //�����д�������Ķ���/ѧ��
        bbb055�� da = new bbb055��(xh, xm, nl, dz);
        student.add(da);//������ľ��������ӵ�������
        // bbb055�� ren = student.get(0);//����������
        // System.out.print(ren.getNumber() + ren.getName() + ren.getAge() + ren.getAddress());
    }

    //ɾ����Ϣ
    public static void sc(ArrayList<bbb055��> student) {
        Scanner a2 = new Scanner(System.in);
        System.out.println("��������Ҫɾ����ѧ�ţ�");
        String scxh = a2.nextLine();
        for (int q = 0; q < student.size(); q++) {
            bbb055�� ren = student.get(q);
            // System.out.println(ren.getNumber());
            // System.out.println(scxh);
            if (ren.getNumber().equals(scxh)) {
                student.remove(q);
                // System.out.println(student.remove(q));
                System.out.println("ɾ���ɹ�");
            } else {
                System.out.println("ѧ�Ų�����");
            }
        }
        // bbb055�� a22=new bbb055��();
        // student.remove(scxh);//�����п��������������ڣ�ֻɾ����ѧ��
        // System.out.println(student.remove(0));
    }

    //�޸���Ϣ
    public static void xg(ArrayList<bbb055��> student) {
        Scanner a3 = new Scanner(System.in);
        System.out.println("��������Ҫ�޸ĵ�ѧ��:");
        String xgxh = a3.nextLine();
        for (int q2 = 0; q2 < student.size(); q2++) {
            //�ٷ������ķ����ǣ����趨һ���µı�����Ȼ����±���ֱ�Ӹ�д�ɱ�����
            bbb055�� q3 = student.get(q2);
            if (q3.getNumber().equals(xgxh)) {
                System.out.println("�ҵ���������ʼ�޸ģ�");
                System.out.println("������ѧ��������");
                q3.setName(a3.nextLine());
                System.out.println("������ѧ�����䣺");
                q3.setAge(a3.nextLine());
                System.out.println("������ѧ����ַ��");
                q3.setAddress(a3.nextLine());
                System.out.println("�޸����");
                // bbb055�� q3 = new bbb055��(xgxh, xm, nl, dz);//�����д�������Ķ���/ѧ��
                //������ľ��������ӵ�������
                student.set(q2, q3);
                return;
            } else {
                System.out.println("����δ�ҵ�-------------------");
            }
        }
    }

    //�鿴��Ϣ
    public static void ck(ArrayList<bbb055��> student) {
        if (student.size() == 0) {
            System.out.println("����Ϣ�����Ƚ������");
            //return,�������һ�����󣬳��򽫲��ټ���ִ��
        } else {
            //tab���Ŀ��ٱ�ʾ
            System.out.println("ѧ��\t����\t����\t��ס��");
            // System.out.print("ѧ��");
            // System.out.print("          ");
            // System.out.print("����");
            // System.out.print("          ");
            // System.out.print("����");
            // System.out.print("          ");
            // System.out.println("��ס��");
            for (int q = 0; q < student.size(); q++) {
                bbb055�� ren = student.get(q);
                System.out.println(ren.getNumber() + "\t" + ren.getName() + "\t" + ren.getAge() + "\t" + ren.getAddress());
                // System.out.print(ren.getNumber());
                // System.out.print("          ");
                // System.out.print(ren.getName());
                // System.out.print("          ");
                // System.out.print(ren.getAge());
                // System.out.print("          ");
                // System.out.println(ren.getAddress());
                //������ε�����ʽ��
            }
        }
    }
}

