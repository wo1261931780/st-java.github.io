package c2stage_20220203.ccc043calendar;
/*
    Calendar Ϊ�ض�˲����һ�������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶ��ṩ��һЩ����
    Calendar �ṩ��һ���෽�� getInstance ���ڻ�ȡ�������͵�һ�����õĶ��󣬸÷�������һ�� Calendar ����
    �������ֶ���ʹ�õ�ǰ���ں�ʱ���ʼ����Calendar rightNow = Calendar.getInstance();
 */

import java.util.Calendar;

public class ddd005get {
    public static void main(String[] args) {
        System.out.println("��ʼ����");
        // ����ͨ����̬����ʽ����һ������
        // 2021��10��3��10:34:06
        Calendar x = Calendar.getInstance();
        // �÷���Ϊ�����࣬��ô��Ҫ��ʵ�����Ǹö��������/������
        // System.out.println(x);
        // ��ȡ�õ�һ��������Ϣ
        // WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=276,DAY_OF_WEEK=1
        // ����Ĳ������൱����calendar���췽����������һ����������x
        // public int get?(int field)
        int yy = x.get(Calendar.YEAR);
        int mm = x.get(Calendar.MONTH);
        int dd = x.get(Calendar.DAY_OF_WEEK);
        // ����Ĳ�����ʵ�����Ǹ��ݸ�����x����ȡʱ��
        // �൱���ҵ�ʱ���Ѿ��趨���ˣ�������Ҫ�Ľ������ֱ��get�Ϳ���
        System.out.println(yy + "year---" + mm + "month---" + dd + "DAY_OF_WEEK");
        // DAY_OF_WEEK����������Ϊ��һ��

    }
}
