package ccc037date;

import java.util.Date;

public class ccc038 {
    public static void main(String[] args) {
        System.out.println("------------------");
        Date x=new Date();
        System.out.println(x);
        //Mon May 10 15:49:00 CST 2021
        long x1=1564651*56*461*354635*5;
        Date x2=new Date(x1);
        //Tue Jan 20 07:00:41 CST 1970
        //��ʾ�ӱ�׼ʱ�䣬�л�ʱ��������ʱ����ʱ����
        System.out.println(x2);
    }
}
