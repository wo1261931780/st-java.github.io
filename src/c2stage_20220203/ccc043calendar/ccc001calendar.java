package c2stage_20220203.ccc043calendar;

import java.util.Calendar;
import java.util.Date;

public class ccc001calendar {
    public static void main(String[] args) {
        Calendar x = Calendar.getInstance();//�൱�����½���һ����������x
        // �����ı����ǣ��ɱ����ڶ���
        System.out.println(x);//time=1644037567997,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=36,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=6,SECOND=7,MILLISECOND=997,ZONE_OFFSET=28800000,DST_OFFSET=0
        // ֱ���������õ������е�������Ϣ����������ֻ��Ҫ���е�һ����

        int c_yaer = x.get(Calendar.YEAR);//��ȡ�����е�year����
        // Ȼ��int���͵�year���ݸ�ֵ��c_year�������
        System.out.println("����:" + c_yaer);
        System.out.println("δ�޸�ʱ�䣺" + x.getTimeInMillis());
        // boolean xx = x.getTimeInMillis() == x.get(Calendar.time());
        // Դ���룺
        // protected long time;
        // time�����Ǵ��������еģ��������η�Ϊprotect���޷�ֱ�ӷ���
        // ��ؼ����ǣ�Դ����û������
        // System.out.println(xx);

        x.add(Calendar.MONTH, 55);//�����ڽ������Ӳ���

        System.out.println(x.get(Calendar.YEAR));//��ʹ������ʱ�䣬ǰ��չʾ��ʱ����Ȼ�ǲ����
        System.out.println(x.get(Calendar.YEAR));//���Ǻ��������ʱ�䣬��Ϊ����ͬһ���������Իᷢ���ı�

        Date demo_date = x.getTime();//gettime�������õ�����һ��final����
        System.out.println(demo_date);//�������
        long demo_ss = x.getTimeInMillis();
        System.out.println("ʱ�����ֵ��" + demo_ss);


    }
}
