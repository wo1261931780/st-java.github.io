package c2stage_20220403.ccc105exceptions;

/**
 * ��չ: ����������ʱ�쳣���������⣩
 * ����ʱ�쳣�ĸ���:
 * �̳���RuntimeException���쳣���������࣬
 * ����׶��ǲ������ģ�����������ʱ�׶ο��ܳ��ֵĴ���
 * ����ʱ�쳣����׶ο��Դ���Ҳ���Բ�����,������붼��ͨ������
 * <p>
 * 1.��������Խ���쳣: ArrayIndexOutOfBoundsException��
 * 2.��ָ���쳣 : NullPointerException��
 * ֱ�����û�����⡣���ǵ��ÿ�ָ��ı����Ĺ��ܾͻᱨ����
 * 3.����ת���쳣��ClassCastException��
 * 4.����������û�д�Ԫ���쳣��NoSuchElementException��
 * 5.��ѧ�����쳣��ArithmeticException��
 * 6.����ת���쳣�� NumberFormatException��
 * <p>
 * С�᣺
 * ����ʱ�쳣�̳���RuntimeException ,����׶β���������ʱ�ſ��ܻ���ִ���!
 */
public class ccc002exception_kind {
    // error��Ӳ��������쳣��ͨ���������Ϊ��
    // ����쳣�������ڼ䴦������������

    public static void main(String[] args) {
        System.out.println("����ʼ������������");
        /** 1.��������Խ���쳣: ArrayIndexOutOfBoundsException��*/
        int[] arr = {1, 2, 3};
        System.out.println(arr[2]);
        // System.out.println(arr[3]); // ���г���������ֹ

        /** 2.��ָ���쳣 : NullPointerException��ֱ�����û�����⡣���ǵ��ÿ�ָ��ı����Ĺ��ܾͻᱨ���� */
        String name = null;
        System.out.println(name); // null
        // System.out.println(name.length()); // ���г���������ֹ

        /** 3.����ת���쳣��ClassCastException�� */
        Object o = 23;
        // String s = (String) o;  // ���г���������ֹ

        /** 5.��ѧ�����쳣��ArithmeticException�� */
        //int c = 10 / 0;

        /** 6.����ת���쳣�� NumberFormatException�� */
        //String number = "23";
        String number = "23aabbc";
        Integer it = Integer.valueOf(number); // ���г���������ֹ
        System.out.println(it + 1);

        System.out.println("�����������������");
    }
}
