package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa018b��������2 {
    public static void main(String[] args) {
        //�������������͵Ĳ�������
        //��̬��ʼ��
        int[] x = {1, 2, 3, 4, 5, 6, 7};
        //���ڴ������
        System.out.println("����ǰ" + x[2]);
        //��x�ĵ�ַ���ݵ������У������������ڴ�����ݱ仯
        show(x);
        //���ڴ�����ݷ����仯
        System.out.println("���ú�" + x[2]);
    }

    public static void show(int[] x) {// �������������͵Ĳ�������
        //ͨ���ڴ��ַ���ҵ����ڴ��е����ݣ�Ȼ����и�ֵ
        x[2] = 200;
        //�����޸ĵ��Ƕ��ڴ��е�����
        System.out.println(x[2]);
    }
}
