package c2stage_20220220.ccc057collection;

import java.util.ArrayList;
import java.util.Collection;

public class ccc006collection���÷���contains {
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
