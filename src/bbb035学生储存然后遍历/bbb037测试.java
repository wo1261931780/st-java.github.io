package bbb035ѧ������Ȼ�����;

import java.util.ArrayList;

public class bbb037���� {
    public static void main(String[] args) {
        // ArrayList<String> xx=new ArrayList<>();
        // xx.add("asd");
        ArrayList<bbb036ѧ����> xs = new ArrayList<>();
        // �������������һ������
        // Ȼ�����������һ������
        // ��������Ķ��󣬷��뼯����
        bbb036ѧ���� x1 = new bbb036ѧ����("aa", 11);
        xs.add(x1);
        // x1.zz("asd",123);
        // ��Ϊ����Ķ���������Ԫ�أ���ӵ������еģ�ʵ���ϲ��Ƕ��󣬶��Ƕ����Ӧ�ĵ�ַ
        // �������Ľ����Ҳ�Ǽ����д���ĵ�ַ
        // bbb032ѧ������Ȼ�����.bbb036ѧ����@119d7047
        // ���Ҫ��ȡ�����Ӧ�����ԣ���Ҫ���ݵ�ַ��ʹ��get����������һ���ķ���
        System.out.println(xs.get(0));
        System.out.println(x1);
        // ͬ������Ҳ����ֱ�ӻ�ȡ����+�������ԣ���Ϊ���������У�Ҳ�ǰ��յ�ַ�������
        // bbb032ѧ������Ȼ�����.bbb036ѧ����@119d7047
        for (int x = 0; x < xs.size(); x++) {
            bbb036ѧ���� s = xs.get(x);
            System.out.println("ѧ��������" + s.getName() + "��ѧ�����䣺" + s.getAge());
        }
    }
}
