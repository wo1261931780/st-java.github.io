package ab����ѧϰ2021��10��2��.bbb010ѧ����ͷ���;

public class bbb014�������ָ����ͬ {
    public static void main(String[] args) {
        bbb011ѧ���� x = new bbb011ѧ����();
        x.name = "11";
        System.out.println(x.name);
        bbb011ѧ���� xx = x;
        // �����½���һ�����󣬰�x�Ķ����ַ��ֵ����xx��
        // ����x��xx��ָ����ͬ
        // �����xx������޸ģ�Ҳ�ᵼ��x�ı����仯

        xx.name = "22";
        System.out.println(xx.name);
        System.out.println(x.name);

        // ����������
        // x=null;
        // ���������x�����ָ��

    }
    // public static  void
}
