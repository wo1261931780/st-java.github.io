package c2stage_20220410.ccc120file_recusion;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc120file_recusion
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-10-51  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        show();

    }

    public static void show() {
        System.out.println("���뷽��1");
        // show();
        // �������ñ������ǵݹ飬
        // ���ֵݹ��ʱ����߻������ʾ
        // ����ݹ�û�г��ڣ��ͻᱨ����Ϊ�ݹ�̫��
        // ���ʱ�򱨴���Ϣ������ջ�ڴ��������Ϊ����������ջ�ڴ��м���
        show2();
        System.out.println("����ִ�н���");
    }

    private static void show2() {
        System.out.println("show2������");
        show3();// �����ڣ����������ķ��������ֽм�ӵݹ�
    }

    private static void show3() {
        System.out.println("show3������");
        show();//�ٻص�����1��������ѭ��
    }
    // �����ִ�������ǣ�
    // ����1���֣����ط���2
    // ����2ִ�У����÷���3
    // ����3���֣��ص�����1���������û�н������ֱ�ӽ���
    // Ȼ�������˳��3-2-1
    // ���ص�����1���������������

}
