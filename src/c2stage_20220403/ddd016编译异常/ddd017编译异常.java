package c2stage_20220403.ddd016�����쳣;
/*
    Java �е��쳣����Ϊ�����ࣺ����ʱ�쳣������ʱ�쳣��Ҳ����Ϊ�ܼ��쳣�ͷ��ܼ��쳣
    ���е� RuntimeException �༰�������ʵ������Ϊ����ʱ�쳣���������쳣���Ǳ���ʱ�쳣

    ����ʱ�쳣��������ʾ�����������ͻᷢ�������޷�ͨ������
    ����ʱ�쳣��������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ddd017�����쳣 {

    public static void main(String[] args) {
        werror();
        Scanner x = new Scanner(System.in);
        System.out.println("YYYY-MM-dd");
        String x1 = x.nextLine();
        dddx(x1);
    }

    /**
     * �����쳣��Ҳ��Ϊ���ܼ��쳣
     * д�����ʱ��û���⣬����ִ�г����ʱ����ִ�����Ϣ
     */
    public static void werror() {
        try {
            int[] x = {1, 2, 3};
            System.out.println(x[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e);
            e.printStackTrace();
            System.out.println("�����Ѿ�ִ��");
        }
    }

    /**
     * �����쳣��Ҳ��Ϊ�ܼ��쳣
     * д�����ʱ��parse����ʾ������Ϣ
     */
    public static void dddx(String x) {
        try {
            SimpleDateFormat x1 = new SimpleDateFormat("YYYY-MM-dd");
            Date x2 = x1.parse(x);
            // �������
            // ParseException
            System.out.println(x2);
        } catch (ParseException e) {
            // System.out.println("�������ParseException");
            e.printStackTrace();
        }
        // return x2;
    }
}
