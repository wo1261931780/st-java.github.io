package c���׶�ǿ���γ�2022��1��11��.ccc039simpledate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc001test_run {
    public static void main(String[] args) throws ParseException {
        System.out.println("��ʼִ��");
        Date x = new Date();
        // SimpleDateFormat x1 = new SimpleDateFormat();
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy" + "��" + "\t" + "MM" + "��" + "\t" + "dd" + "��" + "\t" + "HHmmss");
        String x2 = x1.format(x);
        System.out.println(x2);
        // 1.���ȴ���һ����������ʾ��ʱ��
        // 2.ʹ�ù̶���������ʽ��
        // 3.����ʽ���Ľ����һ���ַ�������
        // 4.չʾ���
        // -----------------------------------------------------
        // -----------------------------------------------------
        // -----------------------------------------------------
        String xx = "2020-02-02 11-11-11";
        SimpleDateFormat x3 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date x4 = x3.parse(xx);
        // ����쳣������������
        // throws ParseException
        // ȥ��������Ϣ
        System.out.println(x4);
        // 1.����ַ���
        // 2.�����ַ���xx�ĸ�ʽ������ʱ��Ľ�����ʽx3
        // 3.��x3�����ַ���xx
        // Ȼ����x4���ս��


    }
}
