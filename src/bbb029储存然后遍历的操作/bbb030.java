package bbb029����Ȼ������Ĳ���;

import java.util.ArrayList;

public class bbb030 {
    public static void main(String[] args) {
        ArrayList<String> xx = new ArrayList<>();//��Ҫ����
        xx.add("S");//�����޷��Զ�ʶ�𣬱������˫����
        xx.add("SS");
        xx.add("SSS");
        System.out.println(xx);        //���Ϊ��[S, SS, SSS]
        xx.add(2, "sada");//���Ϊ��[S, SS, sada, SSS]
        //ָ��λ�ò���������ַ��Զ��Ӻ�

        System.out.println(xx);
        System.out.println(xx.remove("S"));
        //ȥ��ָ�����ݣ�������ȥ���Ƿ�ɹ�
        System.out.println(xx);        //���Ϊ��[SS, sada, SSS]
        System.out.println(xx.remove(2));
        //ȥ��ָ��λ��Ԫ�أ����ر�ȥ�������� SSS
        System.out.println(xx);        //���Ϊ��[SS, sada]
        System.out.println(xx.set(1, "00"));
        //����(��ʾ)���޸ĵ�Ԫ��sada
        System.out.println(xx);        //�޸ĺ�Ľ����[SS, 00]
        System.out.println(xx.get(0));
        //���0��λ�õ�Ԫ��SS
        System.out.println(xx);        //�����[SS, 00]
        System.out.println(xx.size());
        //�ܳ��ȣ�2
//        ArrayList<String> zz=new ArrayList<>("1","2","3","44","55","66","77","88","99","00");
//        System.out.println(zz);
    }
}
