package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa024a�����Ĳ������� {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        int xx = 10;
        System.out.println(xx);
        demo1(xx);
        System.out.println("-------------------------------");
        System.out.println(xx);
        System.out.println("-------------------------------");
        int dd = demo1(xx);
        //����Ҳ�����һ��x1����Ϊ���÷����Ĺ����У�������չʾ��x1����ֵ
        System.out.println("�����˷����еı䶯������Ϊ��" + dd);
    }

    public static int demo1(int x1) {
        x1 = 20;
        // ������޸ģ���ʵ���޸���xx����������
        // �������Ϊ��
        // xx=10��x1=xx=20
        // ���Ǵ�ʱ��x1�����޸ģ�����Ӱ��main�����е�xx��ֵ
        // ��Ϊdemo1�����е��޸�ֻ���ջ�ڴ棬��Ӱ��ʵ������
        System.out.println("���Ƿ����еĲ�������ʽ����:" + x1);
        // �޸ĺ�sout������䶯���ݣ���Ϊ��ջ�ڴ�ı��ʽ��ͬ����һ������
        return x1;
    }
}
