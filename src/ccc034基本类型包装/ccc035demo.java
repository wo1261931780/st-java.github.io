package ccc034�������Ͱ�װ;

public class ccc035demo {
    public static void main(String[] args) {
        //�ж������Ƿ���int��Χ��
        //public static final int MIN_VALUE
        //������Сֵ�ĳ���Ϊ int����Ϊ-2��31�η�
        //ת�������������ͣ�int��string

        Integer x=new Integer("100");//����ʹ�õ����������͵��ַ���������ֱ����"aaaa"����
        //��Ϊ�����Ѿ���ʱ����value of��������Բ��Ƽ�ʹ��
        System.out.println(x);
        Integer xx=new Integer(200);
        //ͬ���������ֱ����������
        System.out.println(xx);
        Integer x1=Integer.valueOf("300");
        //��װx1��int��ֵ
        System.out.println(x1);
        Integer x2=Integer.valueOf("444");
        System.out.println(x2);
//        Integer x3=Integer.valueOf("a");//�޷�������ĸ,Ҳ�޷�������ĸ���
//        System.out.println(x3);
    }


}
