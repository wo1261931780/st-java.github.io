package d���׶���β2021��10��2��.ddd024���Ͻ���;

import java.util.ArrayList;
import java.util.Collection;

public class ddd027collection���÷���remove {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        System.out.println(x);
        // [aaa, aaa, aaa, aaa]
        x.remove("aaa");
        System.out.println(x);
        // [aaa, aaa, aaa]
        // Ĭ��ÿ��aaa��Ϊһ�������Ƴ��������մ�������
        System.out.println(x.remove("aaa"));
        // true
        System.out.println(x.remove("aaa1"));
        // �����true/false���Բ����ڵĶ�������Ƴ�������ʧ��
        // false

    }
}
