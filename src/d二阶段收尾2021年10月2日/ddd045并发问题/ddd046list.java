package d���׶���β2021��10��2��.ddd045��������;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ddd046list {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("hello");
        x.add("world");
        x.add("java");
        Iterator<String> x1 = x.iterator();
        System.out.println("ѭ����ʼ");
        while (x1.hasNext()) {
            String x2 = x1.next();
            System.out.println(x2);
            if (x2.equals("world")) {
                x.add("javaee");
                // ConcurrentModificationExceptio
                // ���ֲ����޸��쳣
                
            }
        }
        System.out.println(x);
        System.out.println("����");
    }
}
