package d���׶���β2021��10��2��.ddd024���Ͻ���;

import java.util.ArrayList;
import java.util.Collection;

public class ddd029collection���÷���contains {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        Collection<String> x = new ArrayList<>();
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.add("aaa");
        x.contains("bbb");
        System.out.println(x.contains("bbb"));
        // false
        // �ж�Ԫ���Ƿ����
        x.add("bbb");
        System.out.println(x.contains("bbb"));
    }
}
