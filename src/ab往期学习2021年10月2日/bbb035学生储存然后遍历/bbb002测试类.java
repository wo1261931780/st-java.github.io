package ab����ѧϰ2021��10��2��.bbb035ѧ������Ȼ�����;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb002������ {
    public static void main(String[] args) {
        ArrayList<bbb001ѧ����> x = new ArrayList<>();
        Scanner x1 = new Scanner(System.in);
        while (true) {
            int i = x1.nextInt();
            if (i == 1) {
                addshow(x);
            } else if (i == 2) {
                show(x);
            } else if (i == 3) {
                query(x);
            } else {
                break;
            }
        }


    }

    public static void addshow(ArrayList<bbb001ѧ����> xx) {
        bbb001ѧ���� x1 = new bbb001ѧ����();
        System.out.println();
        Scanner x = new Scanner(System.in);
        Scanner x2 = new Scanner(System.in);
        System.out.println("������");
        x1.setName(x.nextLine());
        System.out.println("��ַ��");
        x1.setAddress(x.nextLine());
        System.out.println("���䣺");
        x1.setAge(x2.nextInt());
        xx.add(x1);
    }

    public static void show(ArrayList<bbb001ѧ����> x) {
        System.out.println("������" + "\t" + "��ַ" + "\t" + "����");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).getName() + "\t" + x.get(i).getAddress() + "\t" + x.get(i).getAge());
        }
    }

    public static void query(ArrayList<bbb001ѧ����> x) {
        Scanner x1 = new Scanner(System.in);
        String s = x1.nextLine();
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).getName().equals(s)) {
                System.out.println(x.get(i).getName() + "\t" + x.get(i).getAddress() + "\t" + x.get(i).getAge());
            }
        }
    }
}
