package bbb029����Ȼ������Ĳ���;

import java.util.ArrayList;

/**
 * ArrayList���췽����
 * public ArrayList?()������һ���յļ��϶���
 * ArrayList��ӷ�����
 * public boolean add(E e)����ָ����Ԫ��׷�ӵ��˼��ϵ�ĩβ
 * public void add(int index,E element)���ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
 */
public class bbb030ArrayList {
    public static void main(String[] args) {
        // ��Ҫ����
        ArrayList<String> xx = new ArrayList<>();
        // �����޷��Զ�ʶ�𣬱������˫����
        xx.add("S");
        xx.add("SS");
        xx.add("SSS");
        // ���Ϊ��[S, SS, SSS]
        // ���������ַ������Զ�˳������ַ�����
        // ����[1,2]��add����Ժ��Զ����[1,2,3]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        // ���Ϊ��[S, SS, sada, SSS]
        xx.add(2, "sada");
        // ָ��λ�ò���������ַ��Զ��Ӻ�
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.remove("S"));
        // ȥ��ָ�����ݣ�������ȥ���Ƿ�ɹ�
        // ���Ϊ��[SS, sada, SSS]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.remove(2));
        // ȥ��ָ��λ��Ԫ�أ����ر�ȥ�������� SSS
        // ���Ϊ��[SS, sada]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.set(1, "00"));
        // ����(��ʾ)���޸ĵ�Ԫ��sada
        // �޸ĺ�Ľ����[SS, 00]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.get(0));
        // ���0��λ�õ�Ԫ��SS
        // �����[SS, 00]
        System.out.println(xx);
        System.out.println("-----------------------------------------");
        System.out.println(xx.size());
        // �ܳ��ȣ�2
        // ArrayList<String> zz=new ArrayList<>("1","2","3","44","55","66","77","88","99","00");
        // System.out.println(zz);
    }
}
