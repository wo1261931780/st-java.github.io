package abc����ѧϰ2021��10��2��.ccc034�������Ͱ�װ;

public class ccc035demo {
    public static void main(String[] args) {
        // �ж������Ƿ���int��Χ��
        // public static final int MIN_VALUE
        // ������Сֵ�ĳ���Ϊ int����Ϊ-2��31�η�
        // ת�������������ͣ�int��string

        // static����̬���Σ�����ͨ������ֱ�ӷ���
        // ����ʹ�õ����������͵��ַ�����ֻ����100��111���֣�����ֱ����"aaaa"����
        // ��Ϊ�����Ѿ���ʱ����value of��������Բ��Ƽ�ʹ��
        Integer x = new Integer("100");
        System.out.println("x������Ϊ��" + x);
        // ����ʹ�õ���new������x��������������Ƕ���Ϊ���ǹ��췽����
        // ֱ�Ӵ�ӡ��������Ķ���ֻ��õ�����ĵ�ַ

        Integer xx = new Integer(200);
        // ͬ���������ֱ����������
        System.out.println("xx������Ϊ��" + xx);
        // ������������������ֱ��չʾ���ݣ���ʹ���ַ�����Ҳ����������ʽչʾ
        // -----------------------------------
        // -----------------------------------
        // -----------------------------------
        Integer x1 = Integer.valueOf("300");
        // ��װx1��int��ֵ
        System.out.println("x1������Ϊ��" + x1);
        Integer x2 = Integer.valueOf("444");
        System.out.println("x2������Ϊ��" + x2);
        // Integer x3=Integer.valueOf("a");//�޷�������ĸ,Ҳ�޷�������ĸ���
        // System.out.println(x3);
    }
}
