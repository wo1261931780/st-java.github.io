package c2stage_20220220.ccc065list;

import java.util.ArrayList;
import java.util.List;

public class ddd041list���з��� {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        // list����һ���ӿڣ����Ա����϶���ͨ����̬�ķ�ʽ����������
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        x.add("a5");
        x.add(2, "xx");
        // x.add(20, "xx");
        // ������Χ�Ĳ��룬Ҳ�Ǳ���
        System.out.println(x);// �����[a1, a2, xx, a3, a4, a5]
        // ---------------------------------------------
        System.out.println(x.remove("a1"));
        System.out.println(x.remove("aa"));// ɾ��ָ��Ԫ�أ�ֻ�᷵��ɾ���Ƿ�ɹ�
        System.out.println(x.remove(2));// ɾ��ָ��λ�ã�����ɾ����Ԫ��
        // ---------------------------------------------
        System.out.println(x);// [a2, xx, a4, a5]
        System.out.println(x.set(1, "a3"));// ����ָ��λ�õ�Ԫ��Ϊָ�����ݣ�����ԭʼ����
        System.out.println(x);// [a2, a3, a4, a5]
        // ---------------------------------------------
        System.out.println(x.get(1));// ���a3����ȡָ��λ�õ�Ԫ��
        // x.get(i);
        // ��ȡָ��λ�õ�Ԫ��
        // forѭ���Լ��Ͻ��в�����x.size()��ʾ���ϵĴ�С
    }
}
