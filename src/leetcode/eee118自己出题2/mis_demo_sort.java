package leetcode.eee118�Լ�����2;

import java.util.ArrayList;
import java.util.Random;

public class mis_demo_sort {
    public static void main(String[] args) {
        // �������������֣������������򣬲�չʾ���
        ArrayList<Integer> x = new ArrayList<>();
        Random x1 = new Random();
        int i = 0;
        while (i < 5) {
            int x2 = x1.nextInt(1000);
            x.add(x2);
            i++;
        }
        System.out.println(x);
        // x.sort();
        for (i = 0; i < x.size(); i++) {
            int max = 0;
            if (i + 1 < x.size()) {
                if (x.get(i) > x.get(i + 1)) {
                    max = x.get(i);
                    x.set(i, x.get(i + 1));
                    x.set(i + 1, max);
                    System.out.println("��" + i + "�Σ�" + x);
                }
            }
        }
        System.out.println("������" + x);
    }
}
