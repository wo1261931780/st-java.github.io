package c2stage_20220203.ccc040api_date;

import java.util.Date;

public class ccc001date {
    public static void main(String[] args) {
        Date x = new Date();
        System.out.println("ʱ���ǣ�" + x);//ʱ���ǣ�Thu Feb 03 23:03:22 CST 2022
        long x1 = x.getTime();//ֱ�ӻ�ȡ��ǰʱ��ĺ���ֵ��1643900602715
        System.out.println(x1);//1643900602715
        System.out.println("**********************");
        // ��ʵÿ������ִ�ж�����ʱ��ģ�Ϊʲô���ʱ��û�м���������ֵ
        Date x2 = new Date();
        x2.setTime(x1);
        System.out.println(x2);//Thu Feb 03 23:03:22 CST 2022
        //ʵ���ϣ����½���һ��date���͵Ķ���
        // �����date���͵ģ��ڲ���get/set����
    }
}
