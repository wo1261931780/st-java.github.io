package c2stage_20220403.ddd013�쳣����;

public class ddd014�쳣���� {
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
            System.out.println("�������ArrayIndexOutOfBoundsException");
            x.printStackTrace();
            // ����������룬��չʾjvm�еĴ��󣬿���������Ϊ���
        }
        // �ڲ������쳣���������£�
        // ������ڳ����쳣���Զ�ֹͣ
        // try {
        // }catch (){}
        // ����Ľṹ���൱��ʹ���������/�滻�˴������
        // -------------------------------------------------
        // ����ṹ���£�
        // try {
        // ���ִ���Ĵ���
        // }catch (����ԭ�� ���ִ���ı���){��������ʾ}
        // -------------------------------------------------
        // �����ִ������Ӧ���ǣ�
        // try {
        // ���ִ���Ĵ���--------------//new ����ԭ��
        // }catch (����ԭ�� ���ִ���ı���){��������ʾ}
        // �����ǣ�
        // ����ԭ�� ������� = new ����ԭ��;
        // -------------------------------------------------


    }
}
