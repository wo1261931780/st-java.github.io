package c2stage_20220213.ccc051������ʽ;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc051������ʽ
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-14-11  ������
 */
public class ccc003���� {
    public static void main(String[] args) {


    }

    public static void show_tel() {
        Scanner x = new Scanner(System.in);
        while (true) {
            String demo_str = x.next();
            if (demo_str != null && demo_str.matches("1[3-9]\\d{9}")) {
                System.out.println("ע�����");
            } else {
                System.out.println("����������");
            }
        }
    }

    public static void show_mail() {
        Scanner x = new Scanner(System.in);
        while (true) {
            String demo_mail = x.next();
            if (demo_mail != null && demo_mail.matches("\\w[1]@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("ע�����");
            } else {
                System.out.println("����������");
            }
        }
    }

    public static void show_phone(String xx) {
        Scanner x = new Scanner(System.in);
        String demo_ph = x.nextLine();//ע�⣬���е�������ʽ���Ƕ��ַ�������У��
        if (demo_ph != null && demo_ph.matches("0\\d{2,6}-?\\d{5,8}")) {
            System.out.println("ע�����");
        } else {
            System.out.println("����������");
        }
    }
}
