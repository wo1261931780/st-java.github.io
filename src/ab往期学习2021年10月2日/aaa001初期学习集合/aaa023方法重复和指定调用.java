package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

// �����Ƿ������ص���ϰ��2021��9��9��21:40:19

public class aaa023�����ظ���ָ������ {
    public static void main(String[] args) {
        //����Ĭ�ϵ���int����Ϊ��������int
        System.out.println(max(10, 20));
        //���Ҫת��������ǰ��ǿת
        System.out.println(max((byte) 10, (byte) 20));
        System.out.println(max((short) 10, (short) 20));
        //ǿ��ת��x1��x2����������
        //10L��ʾת��int10����long10��ͬ�����ֱ��10F
        System.out.println(max(10L, 20L));
        // ���Ͻ��ȫ��Ϊfalse
        //-------------------------------------------
        System.out.println("-------------------------------------------");
        boolean xx1 = demo1(1, 2);
        System.out.println(xx1);
    }

    /**
     * �������ĸ����������Ƚ�x1��x2����ֵ
     * ÿ�����������x1��x2�������Ͳ�ͬ
     * Ϊ�����ַ�������ÿ�������ڲ�����չʾ���
     */
    public static boolean max(int x1, int x2) {
        System.out.println("int---------");
        return x1 == x2;
    }

    public static boolean max(byte x1, byte x2) {
        System.out.println("byte---------");
        return x1 == x2;
    }

    public static boolean max(long x1, long x2) {
        System.out.println("long----------");
        return x1 == x2;
    }

    public static boolean max(short x1, short x2) {
        System.out.println("shout---------");
        return x1 == x2;
    }

    /**
     * -------------------------------------------
     */
    public static boolean demo1(int x1, int x2) {

        return x1 == x2;
    }
}
