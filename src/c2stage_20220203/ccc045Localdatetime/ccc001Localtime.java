package c2stage_20220203.ccc045Localdatetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ccc001Localtime {
    //Localtime/ Localdate/ Localdatetime
    public static void main(String[] args) {
        // 1����ȡ����ʱ�����
        LocalTime nowTime = LocalTime.now();
        System.out.println("�����ʱ�䣺" + nowTime);//�����ʱ�䣺

        int hour = nowTime.getHour();//ʱ
        System.out.println("hour��" + hour);//hour��

        int minute = nowTime.getMinute();//��
        System.out.println("minute��" + minute);//minute��

        int second = nowTime.getSecond();//��
        System.out.println("second��" + second);//second��

        int nano = nowTime.getNano();//����
        System.out.println("nano��" + nano);//nano��

        System.out.println("-----");
        System.out.println(LocalTime.of(8, 20));//ʱ��
        System.out.println(LocalTime.of(8, 20, 30));//ʱ����
        System.out.println(LocalTime.of(8, 20, 30, 150));//ʱ��������
        LocalTime mTime = LocalTime.of(8, 20, 30, 150);

        System.out.println("---------------");
        System.out.println(LocalDateTime.of(1991, 11, 11, 8, 20));
        System.out.println(LocalDateTime.of(1991, Month.NOVEMBER, 11, 8, 20));
        System.out.println(LocalDateTime.of(1991, 11, 11, 8, 20, 30));
        System.out.println(LocalDateTime.of(1991, Month.NOVEMBER, 11, 8, 20, 30));
        System.out.println(LocalDateTime.of(1991, 11, 11, 8, 20, 30, 150));
        System.out.println(LocalDateTime.of(1991, Month.NOVEMBER, 11, 8, 20, 30, 150));
    }

}
