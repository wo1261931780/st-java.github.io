package bbb049ѧ����������¼��;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb053������������ {
    public static void main(String[] args) {
        ArrayList<bbb052��������> xx = new ArrayList<>();
        sr(xx);
        sr(xx);
        sr(xx);
        System.out.println("-----------------��ӽ���");
        for (int x = 0; x < xx.size(); x++) {
            bbb052�������� zz = xx.get(x);
            System.out.println(zz.getName() + zz.getAge());
        }
    }

    public static void sr(ArrayList<bbb052��������> xx) {
        Scanner zz = new Scanner(System.in);
        System.out.println("������������");
        String z1 = zz.nextLine();
        System.out.println("���������䣺");
        int z2 = zz.nextInt();
        bbb052�������� x1 = new bbb052��������(z1, z2);
        // x1.setName(z1);
        // x1.setAge(z2);
        xx.add(x1);
        System.out.println("������----------------");
    }
}
