package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

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
    }
}
