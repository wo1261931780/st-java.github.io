package c2stage_20220403.ddd018�쳣�׳�;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ddd019throws�쳣 {
    public static void main(String[] args) {
        werror();
        Scanner x = new Scanner(System.in);
        System.out.println("YYYY-MM-dd");
        String x1 = x.nextLine();
        // dddx(x1);
        try {
            dddx(x1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // �Զ�����Ҳ���������׳��쳣��Ҳ����ֱ��try...catch����

    }

    /**
     * �����쳣��Ҳ��Ϊ���ܼ��쳣
     * д�����ʱ��û���⣬����ִ�г����ʱ����ִ�����Ϣ
     */
    public static void werror() {
        int[] x = {1, 2, 3};
        System.out.println(x[3]);
    }

    /**
     * �����쳣��Ҳ��Ϊ�ܼ��쳣
     * д�����ʱ��parse����ʾ������Ϣ
     */
    public static void dddx(String x) throws ParseException {
        // ����ٷ������Ķ��壺throws ParseException
        // ����쳣����������
        // ����ֻ�����һ�����죬ʵ����û�н������
        // �ӻ��˱����쳣������main��������Ȼ�ᱨ��
        SimpleDateFormat x1 = new SimpleDateFormat("YYYY-MM-dd");
        Date x2 = x1.parse(x);
        System.out.println(x2);
    }
}
