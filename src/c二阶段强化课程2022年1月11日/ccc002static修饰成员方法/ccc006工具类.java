package c���׶�ǿ���γ�2022��1��11��.ccc002static���γ�Ա����;

import java.util.Random;

public class ccc006������ {
    public static void show(int num) {
        String xx = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random x1 = new Random();
        String x = "";
        for (int i = 0; i < num; i++) {
            int i1 = x1.nextInt(xx.length());
            x += xx.charAt(i1);
        }
        System.out.println(x);
    }
}
