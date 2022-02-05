package c2stage_20220203.ccc045Localdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

public class ccc004updatetime {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);//��ǰʱ��
        System.out.println(nowTime.minusHours(1));//һСʱǰ
        System.out.println(nowTime.minusMinutes(1));//һ����ǰ
        System.out.println(nowTime.minusSeconds(1));//һ��ǰ
        System.out.println(nowTime.minusNanos(1));//һ����ǰ

        System.out.println("----------------");

        System.out.println(nowTime.plusHours(1));//һСʱ��
        System.out.println(nowTime.plusMinutes(1));//һ���Ӻ�
        System.out.println(nowTime.plusSeconds(1));//һ���
        System.out.println(nowTime.plusNanos(1));//һ�����

        System.out.println("------------------");
        // ���ɱ����ÿ���޸Ĳ����¶���
        System.out.println(nowTime);

        System.out.println("---------------");
        LocalDate myDate = LocalDate.of(2018, 9, 5);
        LocalDate nowDate = LocalDate.now();

        System.out.println("������2018-09-06�� " + nowDate.equals(myDate));//������2018-09-06�� false
        System.out.println(myDate + "�Ƿ���" + nowDate + "֮ǰ�� " + myDate.isBefore(nowDate));//2018-09-05�Ƿ���2018-09-06֮ǰ�� true
        System.out.println(myDate + "�Ƿ���" + nowDate + "֮�� " + myDate.isAfter(nowDate));//2018-09-05�Ƿ���2018-09-06֮�� false

        System.out.println("---------------------------");
        // �жϽ����Ƿ����������
        LocalDate birDate = LocalDate.of(1996, 8, 5);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println("��������������� " + birMd.equals(nowMd));//��������������� false
    }
}
