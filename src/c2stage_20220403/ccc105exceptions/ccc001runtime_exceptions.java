package c2stage_20220403.ccc105exceptions;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220403.ccc105exceptions
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-04  ������
 */
public class ccc001runtime_exceptions {
    public static void main(String[] args) {


    }

    public static void show1() {
        // �������쳣���ࣺ
        int[] x = {12, 123, 13};
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        // System.out.println(x[3]);// ���������쳣
    }

    public static void show2() {
        String x2 = null;
        System.out.println(x2);
        // System.out.println(x2.length());//��ָ���쳣
    }

    public static void show3() {
        Object x = 23;
        String x2 = (String) x;//ǿ������ת��
    }

    public static void show4() {
        int x = 10 / 0;//��ѧ�����쳣
        String x1 = "a321sd56";
        Integer demo = Integer.valueOf(x1);//����׶β��������н׶η����޷�ת��
        System.out.println(demo);
    }

}
