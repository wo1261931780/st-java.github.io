package e���׶���β2021��10��8��.eee039����������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 2021��10��10��11:33:35��
 * ���������������ʵ�����⣬
 * �൱�ڣ��������12���ƣ�Ȼ��ֳ����飬��������д��ң��ٷָ�������
 * ����û�ж��ƽ��з��࣬���û���ڳ�ȡ��ʱ�������
 * ��󣬷����ʱ�������
 */
public class eee040���������� {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        // ArrayList<Integer> x1 = new ArrayList<>();
        // x1.add(ran());
        // x1.add(ran());
        // x1.add(ran());
        // x1.add(ran());
        // ArrayList<Integer> x2 = new ArrayList<>();
        // x2.add(ran());
        // x2.add(ran());
        // x2.add(ran());
        // x2.add(ran());
        // ArrayList<Integer> x3 = new ArrayList<>();
        // x3.add(ran());
        // x3.add(ran());
        // x3.add(ran());
        // x3.add(ran());
        // x.add(x1);
        // x.add(x2);
        // x.add(x3);
        x.add(sz());
        x.add(sz());
        x.add(sz());
        // -----------------------------------------------
        Collections.shuffle(x);
        System.out.println(x);
        for (ArrayList<Integer> i : x) {
            System.out.println("-------------------");
            System.out.println(i);
            for (int i2 : i) {
                System.out.println(i2);
            }
        }
    }

    public static int ran() {
        Random x = new Random();
        int x1 = x.nextInt(14) + 1;
        return x1;
    }

    public static ArrayList<Integer> sz() {
        ArrayList<Integer> x1 = new ArrayList<>();
        x1.add(ran());
        x1.add(ran());
        x1.add(ran());
        x1.add(ran());
        return x1;
    }
}
