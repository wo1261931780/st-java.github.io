package abc����ѧϰ2021��10��2��.ccc038get_set_time;
/*
    public long getTime():��ȡ�������ڶ����1970��1��1�� 00:00:00�����ڵĺ���ֵ
    public void setTime(long time):����ʱ�䣬�����Ǻ���ֵ
 */

import java.util.Date;

public class ccc039get_set_time {
    public static void main(String[] args) {
        Date dd = new Date();
        System.out.println(dd);
        // ���Ϊ��
        // Sat Oct 02 18:13:35 CST 2021
        // dd.setTime(12648);
        System.out.println(dd.getTime());
        // gettimeʵ���ϻ�ȡ���ǣ���׼ʱ�䵽����ʱ�䣬����ʱ����ĺ�����
        System.out.println(dd.getTime() / 1000 / 3600 / 24 / 365);
        // ����Ĵ��룬��ȡ��ʱ��Ϊ��׼ʱ�䵽Ŀǰʱ�䣬���������
        // -----------------------------------------------
        // -----------------------------------------------
        // -----------------------------------------------
        long x2 = System.currentTimeMillis();
        dd.setTime(x2);
        System.out.println(dd);
        // �����set��get����������Ҫ��һ��dd���ڲſ��Խ���


    }
}
