package c2stage_20220403.ccc105exceptions;

/**
 * Ŀ�꣺�����ı���ʱ�쳣��ʶ��
 * <p>
 * ����ʱ�쳣���̳���Exception���쳣���������࣬û�м̳�RuntimeException
 * "����ʱ�쳣�Ǳ���׶ξͻᱨ��"��
 * �������Ա����׶ξʹ���ġ�����������ͱ�����
 * <p>
 * ����ʱ�쳣��������ʲô��
 * �ǵ��ĳ���Ա�ļ������У��ڱ���׶ξͱ���һ������, Ŀ����������!
 * ���ѳ���Ա����ܿ��ܳ������鲢ע�ⲻҪ��bug��
 * ����ʱ�쳣�ǿ��������������˾��������¡�
 */

/**
 * JVM��Ĭ�ϴ�����
 * Ŀ�꣺�쳣�Ĳ���Ĭ�ϵĴ�����̽�����(�Զ�����Ĺ��̣�)
 * ��1��Ĭ�ϻ��ڳ����쳣�Ĵ��������Զ��Ĵ���һ���쳣����ArithmeticException��
 * ��2���쳣��ӷ����г��ֵĵ������׳��������ߣ������������׳���JVM�������
 * ��3����������յ��쳣��������ڿ���ֱ̨������쳣ջ��Ϣ���ݡ�
 * ��4��ֱ�Ӵӵ�ǰִ�е��쳣��ɵ���ǰ����
 * ��5����������û�л���ִ���ˣ���Ϊ�����Ѿ�������
 * <p>
 * С�᣺
 * �쳣һ�����֣����Զ������쳣���������׳���������������
 * ֻҪ�յ��쳣����ֱ������쳣��Ϣ���ɵ����򣡣�
 * <p>
 * Ĭ�ϵ��쳣������Ʋ����ã�һ����ĳ����쳣����������������
 */
public class ddd012jvm������ {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        method();
        System.out.println("����");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
        //        System.out.println(arr[1]);
        System.out.println(arr[3]);
    }

    // �������쳣չʾ��
    // jvm��������󣬻�ֹͣ��������У�
    // ArrayIndexOutOfBoundsException�Ǵ���ԭ��
    // Index 3����λ�ã�java:16����
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    // at c2stage_20220403.ccc105exceptions.ddd012jvm������.method(ddd012jvm������.java:16)
    // at c2stage_20220403.ccc105exceptions.ddd012jvm������.main(ddd012jvm������.java:9)
}
