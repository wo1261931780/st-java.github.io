package c2stage_20220203.ccc049between;

import java.time.Duration;
import java.time.LocalDateTime;

public class ccc001between {
    public static void main(String[] args) {
        System.out.println("start");
        LocalDateTime x = LocalDateTime.now();
        System.out.println(x);// 2022-02-06T17:16:46.805553300
        LocalDateTime bd = LocalDateTime.of(1996, 11, 22, 00, 00, 00);
        System.out.println("�趨ʱ�䣺" + bd);// �趨ʱ�䣺1996-11-22T00:00
        // ****************************************************
        Duration xx = Duration.between(bd, x);
        System.out.println("������" + xx.toDays());// ������9207
        System.out.println("Сʱ��" + xx.toHours());// Сʱ��220985
        System.out.println("���ӣ�" + xx.toMinutes());// ���ӣ�13259116
        System.out.println("������" + xx.toMillis());// ������795547006805


    }
}
