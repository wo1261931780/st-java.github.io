package c2stage_20220203.ccc045Localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ccc003Localdatetime {
    public static void main(String[] args) {
        // ���� ʱ��
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("�����ǣ�" + nowDateTime);//�����ǣ�
        System.out.println(nowDateTime.getYear());//��
        System.out.println(nowDateTime.getMonthValue());//��
        System.out.println(nowDateTime.getDayOfMonth());//��
        System.out.println(nowDateTime.getHour());//ʱ
        System.out.println(nowDateTime.getMinute());//��
        System.out.println(nowDateTime.getSecond());//��
        System.out.println(nowDateTime.getNano());//����
        //�գ�����ĵڼ���
        System.out.println("dayOfYear��" + nowDateTime.getDayOfYear());//dayOfYear��249
        //����
        System.out.println(nowDateTime.getDayOfWeek());//THURSDAY
        System.out.println(nowDateTime.getDayOfWeek().getValue());//4
        //�·�
        System.out.println(nowDateTime.getMonth());//SEPTEMBER
        System.out.println(nowDateTime.getMonth().getValue());//9


        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
    }
}
