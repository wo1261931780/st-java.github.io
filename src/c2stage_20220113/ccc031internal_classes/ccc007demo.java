package c2stage_20220113.ccc031internal_classes;

public class ccc007demo {
    public static void main(String[] args) {
        //�ڳ�Ա�ڲ����У���������ĸ�ʽ
        // ccc031��Ա�ڲ���.inside xx=new ccc031��Ա�ڲ���().new inside();
        //��ʽ�ǣ�
        //�ⲿ����.�ڲ����� xx=new �ⲿ��.new �ڲ��ࣻ
        //�ⲿ����.�ڲ����� xx=�ⲿ�����ͨ��new �ⲿ�������.�ڲ������ͨ��new �ڲ����������
        // xx.show();
        ccc005Member_Internal_Classes.ceshi1 x1 = new ccc005Member_Internal_Classes().new ceshi1();
        x1.show();
        System.out.println("--------------------------------------");

        ccc005Member_Internal_Classes x = new ccc005Member_Internal_Classes();
        x.find();
        //���ⲿ����ʹ��һ�Σ�ֱ�ӵ����ڲ���ķ���
        //�����һ�δ����ڲ���ķ�ʽ�Ƚ��鷳
        //���������ⲿ���д����˶���
        // Ȼ��x����ֱ�ӵ������ⲿ���У���find����
        //��find�����������ǣ������ڲ������+ʹ��show������
    }
}
