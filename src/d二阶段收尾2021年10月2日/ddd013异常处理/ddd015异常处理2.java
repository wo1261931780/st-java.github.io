package d���׶���β2021��10��2��.ddd013�쳣����;
/*
    public String getMessage():���ش� throwable ����ϸ��Ϣ�ַ���
    public String toString():���ش˿��׳��ļ������
    public void printStackTrace():���쳣�Ĵ�����Ϣ����ڿ���̨
 */

import java.io.Serializable;

public class ddd015�쳣����2 {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        method();
        System.out.println("����");
    }

    public static void method() {
        try {
            int[] x = {1, 1, 2};
            System.out.println(x[3]);
        } catch (ArrayIndexOutOfBoundsException x) {
            // ��Դ�����У�catch�ڲ��൱��һ�����췽����
            // new ArrayIndexOutOfBoundsException("x");
            // x�������湹������еĶ���
            // ----------------------------------------------
            // �쳣��������һ��������
            // getmessage
            // tostring
            // printstacktrace
            // ��������ӡ�Ľ����ͬ
            // ----------------------------------------------
            System.out.println(x.getMessage());
            // 1.��������
            // Index 3 out of bounds for length 3
            // ----------------------------------------------
            System.out.println(x.toString());
            // 2.��������
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            // ----------------------------------------------
            x.printStackTrace();
            // 3.��������
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            // at d���׶���β2021��10��2��.ddd013�쳣����.ddd014�쳣����2.method(ddd014�쳣����2.java:20)
            // at d���׶���β2021��10��2��.ddd013�쳣����.ddd014�쳣����2.main(ddd014�쳣����2.java:13)
            // ----------------------------------------------
            // ��Ҫע����ǣ�
            // ����������������ö��������ܽ��������printstacktrace�����ԣ�������Ϣ��ȫ���õ����
        }
        // Դ���룺
        // public class Throwable {

        // private String detailMessage;

        // public Throwable(String message) {
        //             detailMessage = message;
        //     }
        // public String getMessage() {
        //     return detailMessage;
        //     }
        // }
        // �ⲿ���ȴ���һ������x������
        // x����getmessage��������÷��ص�detailMessage��
        // �ڹ��췽���У�detailMessage��������Դ��message��
        // 2021��10��3��15:09:08�������ܸо�������


    }
}
