package d���׶���β2021��10��2��.ddd065set����;
/*
    Set�����ص�
        �������ظ�Ԫ�صļ���
        û�д������ķ��������Բ���ʹ����ͨforѭ������
    HashSet:�Լ��ϵĵ���˳�����κα�֤
 */

import java.util.HashSet;
import java.util.Set;

public class ddd066set���� {
    public static void main(String[] args) {
        Set<String> x = new HashSet<>();
        x.add("a2");
        x.add("a1");
        x.add("aaa3");
        x.add("aaa5");
        x.add("a0");
        x.add("aaa4");
        x.add("aaa5");
        x.add("bbb2");
        // System.out.println(x);
        for (String x1 : x) {
            System.out.println(x1);
        }
    }

}
