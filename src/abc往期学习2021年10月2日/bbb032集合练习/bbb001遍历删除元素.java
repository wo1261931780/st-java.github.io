package abc����ѧϰ2021��10��2��.bbb032������ϰ;

import java.util.ArrayList;

public class bbb001����ɾ��Ԫ�� {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(97);
        x.add(123);
        x.add(214);
        x.add(23);
        x.add(53);
        x.add(66);
        x.add(456);
        x.add(74);
        x.add(4);
        ArrayList<Integer> x1 = show(x);
        System.out.println(x1);
    }

    public static ArrayList<Integer> show(ArrayList<Integer> x) {
        // for (int i = 0; i < x.size(); i++) {
        //     if (x.get(i) < 80) {
        //         x.remove(i);
        //     }
        // }
        // ���ϵĴ�С�ɱ䣬��ǰɾ����������鳤����С��index�����仯������
        // ֱ�ӵ���ɾ������
        
        for (int i = x.size() - 1; i > 0; i--) {
            if (x.get(i) < 80) {
                x.remove(i);
            }
        }
        return x;
    }
}
