package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa023c�������� {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        int xx1 = demo1(10, 10);
        System.out.println(xx1);
        float xx2 = demo1(10, 10, 10);
        System.out.println(xx2);
        double xx3 = demo1(10, 10, 10, 10);
        System.out.println(xx3);
        // ���ݲ��������жϵ������ĸ�����
    }

    /**
     * ��������֮�䣬�໥���ɷ�������
     * 1.���������ͬһ������
     * 2.��������ķ�������ͬ
     * 3.����/����/������һ������ͬ
     */
    public static int demo1(int x1, int x2) {
        return x1 + x2;
    }

    public static float demo1(int x1, int x2, int x3) {
        return x1 + x2 + x3;
    }

    public static double demo1(int x1, int x2, int x3, int x4) {
        return x1 + x2 + x3 + x4;
    }
}
