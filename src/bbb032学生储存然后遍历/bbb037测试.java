package bbb032ѧ������Ȼ�����;

import java.util.ArrayList;

public class bbb037���� {
    public static void main(String[] args) {
//        ArrayList<String> xx=new ArrayList<>();
        ArrayList<bbb036ѧ����> xs = new ArrayList<>();
//        xx.add("asd");
        bbb036ѧ���� x1 = new bbb036ѧ����("aa", 11);
        xs.add(x1);
//        x1.zz("asd",123);
        System.out.println(xs.get(0));
        //bbb032ѧ������Ȼ�����.bbb036ѧ����@119d7047
        System.out.println(x1);
        //bbb032ѧ������Ȼ�����.bbb036ѧ����@119d7047
        for (int x = 0; x < xs.size(); x++) {
            bbb036ѧ���� s = xs.get(x);
            System.out.println("ѧ��������" + s.getName() + "��ѧ�����䣺" + s.getAge());
        }
    }
}
