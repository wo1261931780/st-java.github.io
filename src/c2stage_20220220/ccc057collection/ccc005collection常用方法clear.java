package c2stage_20220220.ccc057collection;

import java.util.ArrayList;
import java.util.Collection;

public class ccc005collection���÷���clear {
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
