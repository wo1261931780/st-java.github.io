package abc����ѧϰ2021��10��2��.bbb020����ѧУ����;

import java.util.Scanner;

public class bbb021b�û���¼��׼�� {
    Scanner x0 = new Scanner(System.in);
    Scanner x1 = new Scanner(System.in);
    String name1;
    String pw;
    private String name = "name";
    private String password = "123";

    public bbb021b�û���¼��׼��() {
        System.out.println("��ӭ");
        for (int i = 0; this.name != name1 || this.password != pw; i++) {
            System.out.println("�����˺ţ�");
            name1 = x0.nextLine();
            System.out.println("���������룺");
            pw = x1.nextLine();
            if (this.name.equals(name) && this.password.equals(pw)) {
                System.out.println("��ӭ");
                break;
            } else {
                System.out.println("�˺�/�����������������");
            }

        }
        //----------------------------------------------------------------
        // if (this.name.equals(name) && this.password.equals(password)) {
        //     System.out.println("��ӭ");
        //     // System.out.println("���������룺");
        //     // password = x.nextLine();
        //     // if (this.password.equals(password)) {
        //     //     System.out.println("��ӭ");
        //     // } else {
        //     //     System.out.println("�������");
        //     // }
        // } else {
        //     System.out.println("���󣬳������");
        // }
        //----------------------------------------------------------------
    }
}
