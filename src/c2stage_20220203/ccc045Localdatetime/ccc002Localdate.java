package c2stage_20220203.ccc045Localdatetime;

import java.time.LocalDate;
import java.time.Month;

public class ccc002Localdate {
    public static void main(String[] args) {
        // 1����ȡ�������ڶ���
        LocalDate nowDate = LocalDate.now();
        System.out.println("��������ڣ�" + nowDate);//��������ڣ�

        int year = nowDate.getYear();
        System.out.println("year��" + year);


        int month = nowDate.getMonthValue();
        System.out.println("month��" + month);

        int day = nowDate.getDayOfMonth();
        System.out.println("day��" + day);

        //����ĵڼ���
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println("dayOfYear��" + dayOfYear);

        //����
        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfWeek().getValue());

        //�·�
        System.out.println(nowDate.getMonth());//AUGUST
        System.out.println(nowDate.getMonth().getValue());//8

        System.out.println("------------------------");
        LocalDate bt = LocalDate.of(1991, 11, 11);
        System.out.println(bt);//ֱ�Ӵ����Ӧ��������
        System.out.println(LocalDate.of(1991, Month.NOVEMBER, 11));//�������ֻ�ǰ��»�����ö��
    }
}
