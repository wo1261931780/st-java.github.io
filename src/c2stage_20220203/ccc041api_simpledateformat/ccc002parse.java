package c2stage_20220203.ccc041api_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc002parse {
    public static void main(String[] args) throws ParseException {
        String x = "2022��2��4��20:40:48";
        SimpleDateFormat x1 = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
        // Date x1=new Date();
        Date x2 = x1.parse(x);//parse��ʾ������������ھ�����Ҫ���������
        //ֱ��ʹ��parse�ᷢ����������һ��Ҫ�׳��쳣������쳣������ǩ����
        //�׳��쳣��ʵ���Ͼ��Ǳ������
        System.out.println(x2);//Fri Feb 04 20:40:48 CST 2022
        System.out.println("*******************************************");
        // SimpleDateFormat x3 = new SimpleDateFormat("yyyy��MM��dd+2�� HHʱmm��ss��");
        // String x4 = x3.format(x2);
        Date x3 = new Date();
        // long x4 = x2.getTime() + 1111*1000;//gettime�������൱��ȥ��ȡ��һ�κ���ֵ���õ��Ժ󣬷������ǽ��м���
        long x4 = x2.getTime() + (2L*24*3600+19*60)*1000;//�������L������long���͵ļ��㣬����int����
        x3.setTime(x4);
        System.out.println("����ʱ�䣺" + x3);


    }
}
