package abc����ѧϰ2021��10��2��.bbb028Stringuild���;

public class bbb033String���ת�� {
    public static void main(String[] args) {
        // StringBuilder xx= new StringBuilder();
        // xx.append(65465);
        // String x=xx.toString();
        // //���ת����ǰ���ǣ�xx�Ѿ���build�����ˣ����Կ������Ϊ��
        // //�Ҷ�����һ��x���ַ���������Ȼ���xxִ����ת�����
        // StringBuilder z=new StringBuilder(x);
        // //������е�ת�����൱�ڶ�����һ���µ�z��Ȼ���x���ַ���������
        StringBuilder x1 = new StringBuilder();
        x1.append("111");
        System.out.println(x1);
        String x2 = x1.toString();
        System.out.println(x2);
        String x3 = "222";
        System.out.println(x3);
        StringBuilder x4 = new StringBuilder(x3);
    }
}
