package abc����ѧϰ2021��10��2��.ccc034�������Ͱ�װ;

public class ccc001test_transform {
    public static void main(String[] args) {
        // 1.int����ת��Ϊstring����
        int x = 111;
        String x1 = String.valueOf(x);
        System.out.println("x1Ŀǰ��string����:" + x1);
        // ��ʵ������ʹ��String x1 = ""+x;
        // �������ַ�ʽ��ͨ�����ַ�ƴ��ʵ��
        // ---------------------------------------
        // ---------------------------------------
        // ---------------------------------------
        // 2.string����ת��Ϊint����
        String xx = "222";
        int xx1 = Integer.parseInt(xx);
        System.out.println("����int���͵�xx1��" + xx1);
        // ��ʵ��������ת��Ϊinteger��Ȼ��ת��Ϊint���͵�������ʵ��
        // Integer xx2=Integer.valueOf(xx);
        // ---------------------------------------
        // ---------------------------------------
        // ---------------------------------------
        // ʲô���͵����ݣ���ʹ��ʲô��ʽȥת��
        // int���͵ģ�����integer.parseintת��
        // string���͵ģ�����string.valueofת��
    }
}
