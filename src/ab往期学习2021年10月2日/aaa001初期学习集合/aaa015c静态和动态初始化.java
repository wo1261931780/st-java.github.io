package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa015c��̬�Ͷ�̬��ʼ�� {
    public static void main(String[] args) {
        System.out.println("��̬��ʼ��");
        // int[] arr = new int[]{1, 1, 1, 2, 3};
        int[] arr = {1, 1, 2, 3, 4, 4};
        System.out.println(arr);
        System.out.println(arr[2]);
        System.out.println("--------------------------");
        /*
         * ��̬��ʼ��������һ��ʼ�����������д��������ĳ���Ҳ�̶���
         * ��̬��ʼ����һ��ʼֻȷ��������ĳ��ȣ����������Ĭ����0����ַҲ�������
         * */

        // System.out.println(arr[7]);
        // ֱ�ӷ��ʲ����ڵ�Ԫ�أ��ͻ��������Խ��
        // ArrayIndexOutOfBoundsException
        // int[] arr=null;
        // �����ǿ�з��ʣ�����ɿ�ָ�롪������˵�˻����ǣ�arr�޷����ʵ�ַΪ�յ�����
        // NullPointerException
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�����" + i + "λ������Ϊ��" + arr[i]);
        }
        //����������������������ڱ����Ļ����ϣ��ж���ֵ
        System.out.println("--------------------------");
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("���ֵΪ��" + max);
        System.out.println("��СֵΪ��" + min);
        // 2021��12��26��15:17:41������ѧϰ
        // Ŀ�꣺���ն�̬��ʼ��Ԫ��Ĭ��ֵ�Ĺ���
        // 1�����������Ԫ��Ĭ��ֵ����0
        int[] arrr = new int[10];
        System.out.println(arrr[0]);
        System.out.println(arrr[9]);

        // 2���ַ������Ԫ��Ĭ��ֵ�Ƕ����أ� 0
        char[] chars = new char[100];
        System.out.println((int)chars[0]);
        System.out.println((int)chars[99]);

        // 3�������������Ԫ��Ĭ��ֵ��0.0
        double[] scores = new double[90];
        System.out.println(scores[0]);
        System.out.println(scores[89]);

        // 4���������͵�����
        boolean[] booleans = new boolean[100];
        System.out.println(booleans[0]);
        System.out.println(booleans[99]);

        // 5���������͵�����
        String[] names = new String[90];
        System.out.println(names[0]);
        System.out.println(names[89]);

        // int[] arrs = new int[3]{30, 40, 50};
        //��̬�Ͷ�̬��ʼ�������߲��ɻ���
    }
}
