package c2stage_20220220.eee036ѧ��������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class eee038ѧ������ {
    public static void main(String[] args) {
        ArrayList<eee037ѧ����> x = new ArrayList<>();
        eee037ѧ���� x1 = new eee037ѧ����("y1", 11, 001);
        eee037ѧ���� x2 = new eee037ѧ����("a2", 63, 002);
        eee037ѧ���� x3 = new eee037ѧ����("r3", 33, 003);
        eee037ѧ���� x4 = new eee037ѧ����("d4", 54, 004);
        eee037ѧ���� x5 = new eee037ѧ����("f5", 11, 005);
        x.add(x1);
        x.add(x2);
        x.add(x3);
        x.add(x4);
        x.add(x5);
        Collections.sort(x, new Comparator<eee037ѧ����>() {
            @Override
            public int compare(eee037ѧ���� o1, eee037ѧ���� o2) {
                int num1 = o1.getAge() - o2.getAge();
                int num2 = num1 == 0 ? o1.getName().compareTo(o2.getName()) : num1;
                return num2;
            }
        });
        for (eee037ѧ���� i : x) {
            System.out.println(i.getName() + "--" + i.getAge() + "--" + i.getNum());
        }
    }
}
