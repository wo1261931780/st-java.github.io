package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa023e�������ص���ϰ {
    public static void main(String[] args) {
        show();
        System.out.println("*****");
        show(10);
        System.out.println("*****");
        show(10, "ooo");
        System.out.println("*****");

    }

    // �������أ������ڷ��������໥����

    public static void show() {
        // System.out.println("method1");
        show(1);
        // �������˼�ǣ�
        // ����û�������κβ���������£�show����Ĭ��չʾ����1
        // Ȼ��������Ҫ����չʾ���ݵ�ʱ�򣬾������������
    }

    public static void show(int x) {
        System.out.println("method1" + x);
    }

    public static void show(int x, String xx) {
        System.out.println("method1" + x + xx);
    }

    // ************************************************
    // �·���
    public static void open() {
    }

    // ���ط���
    public static void open(int a) {
    }

    // ���ط���
    static void open(int a, int b) {
    }

    // ���ط���
    public static void open(double a, int b) {
    }

    // ���ط����������ֱ�����ǰ��˳��
    // ����������
    public static void open(int a, double b) {
    }

    // �ظ�������static�ؼ��ֿ��Բ�д
    // public void open(int i, double d) { }

    // �·���,java�����ִ�Сд��
    public static void OPEN() {
    }

    // ************************************************
}
