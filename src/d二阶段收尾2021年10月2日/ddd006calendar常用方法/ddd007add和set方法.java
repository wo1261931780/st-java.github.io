package d���׶���β2021��10��2��.ddd006calendar���÷���;
/*
    public abstract void add?(int field, int amount):���������Ĺ��򣬽�ָ����ʱ������ӻ��ȥ�����������ֶ�
    public final void set?(int year,int month,int date):���õ�ǰ������������
 */


import java.util.Calendar;

public class ddd007add��set���� {
    public static void main(String[] args) {
        System.out.println("��ʼ����");
        Calendar x = Calendar.getInstance();
        // int yy = x.get(Calendar.YEAR);
        // int mm = x.get(Calendar.MONTH)+1;
        // int dd = x.get(Calendar.DATE);
        // System.out.println(yy + "," + mm + "," + dd);
        // -------------------------------------------------------------------
        // -------------------------------------------------------------------
        // -------------------------------------------------------------------
        // x.add(Calendar.YEAR, -10);
        // public abstract void add?(int field, int amount):���������Ĺ��򣬽�ָ����ʱ������ӻ��ȥ�����������ֶ�
        // add������ִ�е���ʱ�����Ӳ���
        // �������ӣ�������������Ҳ�����Ǹ���
        // ���磬��ǰʱ��2021��10��3
        // add���-10�Ժ󣬵õ���ʱ��Ϊ��2011��10��3
        // int yy = x.get(Calendar.YEAR);
        // int mm = x.get(Calendar.MONTH) + 1;
        // int dd = x.get(Calendar.DATE);
        // System.out.println(yy + "," + mm + "," + dd);
        // -------------------------------------------------------------------
        // -------------------------------------------------------------------
        // -------------------------------------------------------------------
        // public final void set?(int year,int month,int date):���õ�ǰ������������
        x.set(2088, 10, 10);
        // �����set������Ҳ��ר�������������x���õ�
        // ������ʱ�����Ȼ����������������ݵ���Ӻ�ɾ��
        int yy = x.get(Calendar.YEAR);
        int mm = x.get(Calendar.MONTH) + 1;
        int dd = x.get(Calendar.DATE) + 20;
        System.out.println(yy + "," + mm + "," + dd);
        // ���ս����2088,11,30

    }
}
