package c2stage_20220228.ccc076set;
/*
    Set�����ص�
        �������ظ�Ԫ�صļ���
        û�д������ķ��������Բ���ʹ����ͨforѭ������
    HashSet:�Լ��ϵĵ���˳�����κα�֤
 */

import java.util.HashSet;
import java.util.Set;

public class ccc001set���� {
    public static void main(String[] args) {
        Set<String> x = new HashSet<>();
        // Set<String> x = new LinkedHashSet<>();
        // ֱ�ӽ�������linkedhashset���ͻ������򼯺�
        // [a2, a1, aaa3, aaa5, a0, aaa4, bbb2]
        // �������˳��
        x.add("a2");
        x.add("a1");
        x.add("aaa3");
        x.add("aaa5");
        x.add("a0");
        x.add("aaa4");
        x.add("aaa5");
        x.add("bbb2");
        System.out.println(x);// [a1, a2, aaa5, aaa4, bbb2, aaa3, a0]
        // ��Ϊ�ڲ���д��tostring������ֱ��չʾ����
        // ͬʱ����Ϊ��set���ͣ������������
        // set�����ص㣬���ظ�
        for (String x1 : x) {
            System.out.println(x1);
        }
    }
}
