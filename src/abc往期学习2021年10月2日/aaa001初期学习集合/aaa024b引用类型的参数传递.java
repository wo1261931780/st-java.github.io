package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa024b�������͵Ĳ������� {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        int[] arr = {1, 1, 12, 1, 3, 12};
        System.out.println(arr[2]);
        demo1(arr);
        System.out.println("main�е�Ԫ�أ�" + arr[2]);

    }

    public static void demo1(int[] arr) {
        arr[2] = 200;
        // �������õ�������ĵ�ַ���ı���Ƕ��ڴ��е���������
        System.out.println("���Ƿ����е�Ԫ�أ�" + arr[2]);
    }
}
