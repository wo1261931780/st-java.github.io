package c2stage_20220220.ccc059collection_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ddd032test_run {
    public static void main(String[] args) {
        System.out.println("��ʼ����");
        Collection<String> x = new ArrayList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        x.add("a5");
        x.add("a6");
        // ��������������Ժ��ٴ������󣬷��򱨴�
        // �������Ϊ��
        // 1.�����д���Ԫ�ص�����£����ܴ��������ݵĵ�����
        // 2.�����ݵ�����£�Ԫ�ز���ִ������Ƿ�Ϊ�յ��ж�
        Iterator<String> x1 = x.iterator();
        System.out.println(x1.hasNext());
        // ������ѭ�������ֽⷨ��
        // --------------------------------------------------------------
        // for (int i = 0; i < x.size(); i++) {
        // for (int i = 0; x1.hasNext(); i++) {
        //     System.out.println(x1.next());
        // }
        // --------------------------------------------------------------
        // do {
        //     System.out.println(x1.next());
        // } while (x1.hasNext());
        // --------------------------------------------------------------
        while (x1.hasNext()) {
            System.out.println(x1.next());
        }
    }
}
