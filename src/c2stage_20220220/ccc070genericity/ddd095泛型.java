package c2stage_20220220.ccc070genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ddd095���� {
    public static void main(String[] args) {
        Collection x = new ArrayList();
        // ��û��ָ�����͵�����£����ֵĶ��Ƿ���
        // ���ʹ����Ķ��Ƕ���
        x.add("a1");
        // ����Ĭ����object����
        x.add("a2");
        x.add("a3");
        x.add(200);
        // ���Զ�װ��Ĳ�����int�Զ���װΪinteger����
        // �Ҿ��÷��͵ĺô����ڣ����ԶԲ�ͬ�Ķ���ֱ��ʹ��
        // ����Ҫִ��һ������ת����ͬʱ����������ת�������ı�����޸ģ�����˵�����������
        Iterator x1 = x.iterator();
        while (x1.hasNext()) {
            // String x2=(String) x1.next();
            // �����Ƕ���������Ҫִ��һ��ת�Ͳ���
            Object x2 = x1.next();
            System.out.println(x2);
        }

    }
}
