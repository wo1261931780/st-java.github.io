package ccc039simpledate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ccc040 {
    public static void main(String[] args) throws ParseException {
        Date x1=new Date();//��ѡ��һ����Ҫ�����Ķ���
        SimpleDateFormat x=new SimpleDateFormat();//Ϊ�˲���x1������Ҫʹ��x�ķ���
        String w=x.format(x1);//��������֮����Ҫw�����ս��
        System.out.println(w);//2021/5/10 ����4:58
        System.out.println("------------------");

//        Date x2=new Date();����Ҫ�½�һ��ʱ��
        SimpleDateFormat xx=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        //2021��05��10�� 17:04:10
        String w2=xx.format(x1);
        System.out.println(w2);
        System.out.println("-------------------");

        String ss="1564��56��54�� 12:54:87";
        SimpleDateFormat xxx=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        Date ss2=xxx.parse(ss);
        //alt+enter���޳��쳣������󣬶�������throws ParseException
        System.out.println(ss2);

    }
}
