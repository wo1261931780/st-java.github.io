package c2stage_20220203.ccc041api_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc001simpledateformate {
    public static void main(String[] args) {
        Date x = new Date();//�½�һ�����ڶ���
        System.out.println("Ĭ��ʱ�䣺" + x);
        // SimpleDateFormat x1 = new SimpleDateFormat("yyyy+MM+dd+HH+mm+ss EEE a");
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy��MM��dd��-----HHʱmm��ss�� EEE a");//Ȼ���½�һ������������
        String time_format = x1.format(x);//�����������ڲ��ķ���������ʽ�����ڶ���
        System.out.println(time_format);

    }
}
