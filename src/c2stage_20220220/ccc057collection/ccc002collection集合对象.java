package c2stage_20220220.ccc057collection;

import java.util.ArrayList;
import java.util.Collection;

public class ccc002collection���϶��� {
    public static void main(String[] args) {
        System.out.println("��ʼִ��");
        Collection<String> x = new ArrayList<>();
        // ͨ����̬�ķ�ʽ�������������
        // ArrayList<String> x1=new ArrayList<>();
        // ��������ķ�ʽ
        x.add("aaaa");
        x.add("bbb");//add��������true��false
        x.add("ccc");//��ʾ��ӳɹ�
        System.out.println(x);
        // �������Ľ����[aaaa, bbb, ccc]
    }
}
