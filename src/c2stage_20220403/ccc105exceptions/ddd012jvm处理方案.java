package c2stage_20220403.ccc105exceptions;

/**
 * JVM��Ĭ�ϴ�����
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
