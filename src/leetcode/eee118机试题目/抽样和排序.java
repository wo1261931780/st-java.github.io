package leetcode.eee118������Ŀ;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class ���������� {
    /*
    ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��1000����
    ���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰�����
    �õ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ���(ͬһ��������������ܻ��ж�������(���ڲ�ͬ�ĵ���)��ϣ���������ȷ����)��
ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣
��û���µ�����ʱ��˵�����������
    */

    public static void main(String[] args) {
        Random x = new Random();
        Scanner xx = new Scanner(System.in);
        int xx1 = xx.nextInt();
        int i = 0;
        TreeSet x2 = new TreeSet<>();
        while (i < xx1) {
            int x1 = x.nextInt(1000) + 1;
            System.out.println(x1);
            x2.add(x1);
            i++;
        }
        System.out.println("-----");
        for (Object i1 : x2) {
            System.out.println(i1);
        }


    }
}
