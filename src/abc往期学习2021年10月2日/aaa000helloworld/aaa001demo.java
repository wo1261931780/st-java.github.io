package abc����ѧϰ2021��10��2��.aaa000helloworld;

public class aaa001demo {
    public static void main(String[] args) {
        System.out.println("hellow");
        int a = 10;
        System.out.println(a);
        a = 22;
        System.out.println(a);

        System.out.println("------------------------------");

        //        С��Χ�ı�������������ת��Ϊ��Χ����ı���
        //        ��������ת�������Զ�ת��
        byte x1 = 1;
        int x2 = x1;
        //        ���byte����ת��Ϊint����
        System.out.println(x2);
        System.out.println("------------------------------");
        int x3 = 11;
        System.out.println(x3);
        //        ת���󣬻ᰴ���µĸ�ʽ����չʾ
        float x4 = x3;
        System.out.println(x4);
        double x5 = x3;
        System.out.println(x5);
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        //�������ǿ��ת��
        //        �ѷ�Χ��ı�����ת��ΪС�ı���������double��int
        //        int xx1 =88.88;�����������̣����Ǹ������ᱨ��
        int xx1 = (int) 88.88;
        System.out.println(xx1);
    }
}

