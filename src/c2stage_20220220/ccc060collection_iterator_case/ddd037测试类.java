package c2stage_20220220.ccc060collection_iterator_case;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ddd037������ {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        Collection<ddd036student> x = new ArrayList<>();
        ddd036student x1 = new ddd036student("a1", 11);
        ddd036student x2 = new ddd036student("a2", 22);
        ddd036student x3 = new ddd036student("a3", 33);
        x.add(x1);
        x.add(x2);
        x.add(x3);
        Iterator<ddd036student> x4 = x.iterator();
        while (x4.hasNext()) {
            // System.out.println(x4.next());
            // ����ֱ�ӵ��÷�����ֻ�ܵõ�����ĵ�ַ
            ddd036student s = x4.next();
            // ����Ҳ����ԭ��ʹ��string��ʽ��������
            // Ҫôʹ��valueofȥ��װx4��Ҫô��string�����滻Ϊstudent����
            // ��������ĵ�������Ҳ��Ҫ�����ƵĴ���
            // System.out.println(s);
            // ֱ��չʾ��ֻ��õ���ַ
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
