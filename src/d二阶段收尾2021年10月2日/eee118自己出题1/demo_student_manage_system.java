package d���׶���β2021��10��2��.eee118�Լ�����1;

import java.util.ArrayList;
import java.util.Scanner;

public class demo_student_manage_system {
    public static void main(String[] args) {
        ArrayList<demo_student_obj> xx = new ArrayList<>();
        int r = show(0);
        while (r != 5) {
            // int s = r;
            if (r == 1) {
                add_student(xx);
            } else if (r == 2) {
                remove_student(xx);
            } else if (r == 3) {
                change_student(xx);
            } else if (r == 4) {
                show_student(xx);
            } else if (r == 5) {
                break;
            }
            r = show(0);
        }
        // do {
        //     if (r == 1) {
        //         add_student(xx);
        //     } else if (r == 2) {
        //         remove_student(xx);
        //     } else if (r == 3) {
        //         change_student(xx);
        //     } else if (r == 4) {
        //         show_student(xx);
        //     } else if (r == 5) {
        //         break;
        //     }
        // } while (show(0) != 5);
        System.out.println("�������");
        // -------------------------------------------------


    }

    public static int show(int s) {
        Scanner x = new Scanner(System.in);
        System.out.println("-----------ѧ������ϵͳ-----------");
        System.out.println("1.���ѧ��");
        System.out.println("2.ɾ��ѧ��");
        System.out.println("3.�޸�ѧ��");
        System.out.println("4.�鿴����ѧ��");
        System.out.println("5.�˳�");
        System.out.println("���������ѡ��");
        int x1 = x.nextInt();
        return x1;
    }

    public static void add_student(ArrayList<demo_student_obj> xx) {
        Scanner x1 = new Scanner(System.in);
        Scanner xx1 = new Scanner(System.in);
        System.out.println("������ѧ�ţ�");
        int num = x1.nextInt();
        // String num=x1.nextLine();
        System.out.println("������������");
        String name = xx1.nextLine();
        System.out.println("���������䣺");
        int age = x1.nextInt();
        System.out.println("�������ַ��");
        String addr = xx1.nextLine();
        demo_student_obj x = new demo_student_obj(num, name, age, addr);
        xx.add(x);
        System.out.println("������");
    }

    public static void remove_student(ArrayList<demo_student_obj> xx) {
        Scanner x = new Scanner(System.in);
        System.out.println("������ѧ�ţ�");
        int x1 = x.nextInt();
        for (demo_student_obj x2 : xx) {
            if (x1 == x2.getNumber()) {
                xx.remove(x2);
                System.out.println("ɾ���ɹ�");
            }
        }
        System.out.println("ɾ������");
    }

    public static void change_student(ArrayList<demo_student_obj> xx) {
        Scanner x = new Scanner(System.in);
        Scanner xx1 = new Scanner(System.in);
        System.out.println("������ѧ�ţ�");
        int x1 = x.nextInt();
        for (demo_student_obj x2 : xx) {
            if (x1 == x2.getNumber()) {
                System.out.println("������������");
                String x3 = xx1.nextLine();
                x2.setName(x3);
                System.out.println("���������䣺");
                int x4 = x.nextInt();
                x2.setAge(x4);
                System.out.println("������סַ��");
                String x5 = xx1.nextLine();
                x2.setAddress(x5);
                System.out.println("���óɹ�");
            }
        }
        System.out.println("�޸Ľ���");
    }

    public static void show_student(ArrayList<demo_student_obj> xx) {
        System.out.println("ѧ��" + "\t\t" + "����" + "\t\t" + "����" + "\t\t" + "סַ");
        for (demo_student_obj x : xx) {
            System.out.println(x.getNumber() + "\t\t" + x.getName() + "\t\t" + x.getAge() + "\t\t" + x.getAddress());
        }
        System.out.println("��������");
    }
}
