package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Arrays;
import java.util.Random;

/**
 * ���󣺰�һ�������е�Ԫ�ظ��Ƶ���һ����������ȥ��
 */
public class aaa029�������� {
    public static void main(String[] args) {
        // show();
        System.out.println("**********************");
        cop(show());
        System.out.println("end");

    }

    public static String[] show() {
        // String bl = "";
        String[] bl = new String[6];
        Random x = new Random();
        for (int i = 0; i < bl.length; i++) {
            int x1 = x.nextInt(3);
            // Random xx=new Random();
            if (x1 == 0) {
                int x2 = x.nextInt(10) + 48;
                bl[i] = (char) x2 + "";
            } else if (x1 == 1) {
                int x2 = x.nextInt(26) + 65;
                bl[i] = (char) x2 + "";
            } else {
                int x2 = x.nextInt(26) + 97;
                bl[i] = (char) x2 + "";
            }
            System.out.println(bl[i]);
        }
        System.out.println("������ɵ����飺" + Arrays.toString(bl));
        return bl;
    }

    public static void cop(String[] bl) {
        String[] xx = new String[bl.length];
        for (int i = 0; i < bl.length; i++) {
            xx[i] = bl[i];
        }
        System.out.println("���Ƶõ������飺" + Arrays.toString(xx));
    }
}
