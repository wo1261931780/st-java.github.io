package c2stage_20220203.ccc046instant;

import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;

public class ccc001demo {
    public static void main(String[] args) {
        Instant x = Instant.now();
        System.out.println("Ĭ�Ϲ��ʱ�׼ʱ�䣺" + x);// 2022-02-06T06:45:00.892641100Z
        System.out.println("��ǰʱ����׼ʱ�䣺" + x.atZone(ZoneId.systemDefault()));// 2022-02-06T14:45:00.892641100+08:00[Asia/Shanghai]
        // Ĭ�Ϲ��ʱ�׼ʱ�䣺2022-02-06T06:45:00.892641100Z
        // ��ǰʱ����׼ʱ�䣺2022-02-06T14:45:00.892641100+08:00[Asia/Shanghai]
        // ���߲������ʱ������ʱ���������ĺ���ֵ
        // ******************************************
        // Date x1 = Date.from(x);//ֱ��д�ᱨ��
        java.util.Date date_transf = Date.from(x);//��instantǨ�Ƶ�date����
        System.out.println("instantǨ�Ƶ�date��" + date_transf);// Sun Feb 06 14:53:10 CST 2022
        Instant inst_transf = date_transf.toInstant();//dateǨ�Ƶ�instant����
        System.out.println("dateǨ�Ƶ�instant��" + inst_transf);// 2022-02-06T06:53:10.203Z

    }
}
