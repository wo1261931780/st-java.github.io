package bbb020����ѧУ����;

import java.util.Scanner;

public class bbb023�Լ���������ѧУ���� {
    public static void main(String[] args) {
        bbb021 z = new bbb021();
        Scanner z0 = new Scanner(System.in);
        System.out.println("����������");
        int z1 = z0.nextInt();
        z.setSchool("111111");
        z.setAbound(z1);
        z.show();

        System.out.println("------------------");
        bbb021 zz = new bbb021("2222", z1);
    }
}
