package c2stage_20220203.ccc047datetimeformat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ccc001datetimeformat {
    public static void main(String[] args) {
        LocalDateTime x = LocalDateTime.now();
        System.out.println("Ĭ�ϵ�ʱ�����" + x);
        DateTimeFormatter x1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println("��ʽ������" + x1.format(x));
        System.out.println("���ڶ��������ʽ����" + x.format(x1));
        // ******************************************************
        DateTimeFormatter string_x = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//�����ʱ����밴��ָ����ʽ���ã������������2020-11-11���ᱨ��
        LocalDateTime xx = LocalDateTime.parse("2020-11-11 11:11:11", string_x);//ע�ͼ�����
        System.out.println("��ȡ�����������" + xx.getDayOfYear());
    }
}
