package d���׶���β2021��10��2��.ddd024���Ͻ���;

import java.util.ArrayList;
import java.util.Collection;

public class ddd028collection���÷���clear {
    public static void main(String[] args) {
        System.out.println("��ʼ����");
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        System.out.println(x);
        // [aaa, aaa, aaa, aaa, aaa, aaa]
        x.clear();
        System.out.println(x);
        // []

    }
}
