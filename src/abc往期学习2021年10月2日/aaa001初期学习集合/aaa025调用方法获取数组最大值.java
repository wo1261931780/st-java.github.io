package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

public class aaa025���÷�����ȡ�������ֵ {
    // public static void main(String[] args) {
    //     int[] arr = {321, 135, 46, 156, 9684, 6156, 7, 56};
    //     b11(arr);
    // }
    //
    // public static void b11(int[] arr) {
    //     int x = 0;
    //     //int mm = arr[x];
    //     int max = 0;
    //     for (System.out.println("��ʼ�Աȣ�"); x < arr.length; x++) {
    //         if (arr[x] > max) {
    //             max = arr[x];
    //         }
    //     }
    //     System.out.println("�������ֵΪ��" + max);
    // }
    public static void main(String[] args) {
        System.out.println("----------------------");
        int[] xx = {2, 12, 12, 123, 1, 31, 56, 5};
        int x1 = demo1(xx);
        System.out.println("���ֵΪ��" + x1);
    }

    public static int demo1(int[] arr) {
        // int max = 0;
        //Ĭ��ʹ��arr[0]λ�Ĳ�����������ܳ���0������������Ԫ�ص����
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("��" + i + "�α���");
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
