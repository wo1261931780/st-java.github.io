package ab����ѧϰ2021��10��2��.bbb018string���췽��;

import java.util.Random;
import java.util.Scanner;

public class bbb005string���� {
    public static void main(String[] args) {
        // ��֤�밸��
        // String x = "aA0";
        Random x1 = new Random();
        // int x2 = x1.nextInt(x.length());
        // System.out.println(x2);
        // System.out.println((char) 92);
        // show(x1);
        // login();
        phonenum();
    }

    /**
     * ��ϰ�⣺ʹ��String����������5λ����֤�롣
     */
    public static void show(Random x) {
        String x1 = "";
        for (int i = 0; i < 5; ) {
            int xx = x.nextInt(65) + 48;
            if (xx > 57 && xx < 65 || xx > 91 && xx < 97) {
            } else {
                i++;
                x1 += (char) xx;
            }
        }
        System.out.println(x1);
    }

    /**
     * ��ϰ�⣺ģ���û���¼
     */
    public static void login() {
        // 1��������ȷ�ĵ�¼���ƺ�����
        String name = "a1";
        String paw = "s1";
        Scanner x = new Scanner(System.in);
        // 2������һ��ѭ����ѭ��3�Σ����û���¼
        for (int i = 0; i < 3; i++) {
            System.out.println("�������˺ţ�");
            String login_name = x.nextLine();
            System.out.println("���������룺");
            String login_paw = x.nextLine();
            if (login_name.equals(name) && login_paw.equals(paw)) {
                System.out.println("correct");
                return;
            }
            System.out.println("����ʣ��" + (2 - i) + "��");
        }
    }

    /**
     * ��ϰ�⣺�ֻ���������
     */
    public static void phonenum() {
        Scanner x = new Scanner(System.in);
        System.out.println("��������룺");
        String x1 = x.nextLine();
        if (x1.length() != 11) {
            System.out.println("num error");
        } else {
            // String x2 = x1.substring(3, 8);
            // String x3 = x1.replace(x2, "****");

            String x3 = x1.replace(x1.substring(3, 8), "****");
            System.out.println(x3);
        }
    }

}
