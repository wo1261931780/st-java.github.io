package d���׶���β2021��10��2��.ddd001���ڹ�����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ddd001date {
    private ddd001date() {
    }

    public static void main(String[] args) throws ParseException {
        System.out.println("��ʼ����---------");
        Scanner x = new Scanner(System.in);
        System.out.println("������ʱ��(YYYY-MM-dd-HH-mm-ss)");
        String x1 = x.nextLine();
        System.out.println(stringtodate(x1));
        System.out.println("-----------------------------");
        String x2 = datetostring(stringtodate(x1));
        System.out.println(x2);

    }

    public static Date stringtodate(String x) throws ParseException {
        SimpleDateFormat x2 = new SimpleDateFormat("YYYY-MM-dd-HH-mm-ss");
        Date x1 = x2.parse(x);
        // ע�����
        // 1.ת�����밴��simpledateformat�еĸ�ʽ����
        // ��ζ�ţ������ʱ��ͱ��밴�������ʽ����
        // 2.�����Ľ�������ձ�׼�������
        // ��׼��ʽ��
        // Sun Dec 27 11:22:33 CST 1998
        System.out.println("ת������");
        return x1;
    }

    public static String datetostring(Date x) {
        SimpleDateFormat x1 = new SimpleDateFormat("YYYY-MM-dd-HHmmss");
        String x2 = x1.format(x);
        return x2;
    }

}
