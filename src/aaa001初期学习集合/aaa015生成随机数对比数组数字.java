package aaa001����ѧϰ����;

import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("NonAsciiCharacters")
public class aaa015����������Ա��������� {
    //    public static void main(String[] args){
//        System.out.println("xxxxxxxx��������");
    public static void main(String[] args) {
        int[] arr = new int[12];//�趨���鳤��(Ԫ�ظ���12)
        System.out.println(Arrays.toString(arr));//[I@16b98e56���ǵ�ַ
        //Arrays.toString(arr)������ĵ�ַת����string���͵�����
        System.out.println(arr[0]);//�����������ֵ����Ϊ�Ƕ�̬������������ġ�
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0] = 112;
        System.out.println(arr[0] + arr[5]);
        Random b1 = new Random();
        arr[5] = b1.nextInt(100);
        int xx = b1.nextInt(100);
        if (xx > arr[5]) {
            System.out.println("�����Ϊ��" + xx + "��" + arr[5]);
            System.out.println("������ϴ�");
        } else if (xx < arr[5]) {
            System.out.println("�����Ϊ��" + xx + "��" + arr[5]);
            System.out.println("�������С");
        } else {
            System.out.println("�����Ϊ��" + xx + "��" + arr[5]);
            System.out.println("�������");
        }
        //���涼�ǲ��ԡ�
//        System.out.println("12323165465");
//        System.out.println("12323165465");
//        System.out.println("12323165465");
//        System.out.println("12323165465");
//        int i = 123;
//        System.out.println("i:" + i);*/
    }
}

