package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Random;
import java.util.Scanner;

public class aaa016������������ {
    public static void main(String[] args) {
        System.out.println("��ʼ��������:");
        //int[] xx = new int[10];��̬��ʼ����
        //int[] xx = new int[]{123,13545,16541,6546748};
        //��̬��ʼ�����൱��ֱ�Ӹ���������
        int[] xx = {111, 222, 333, 44, 6854, 654, 564, 31, 65, 4896, 74, 61, 4, 867, 6};
        // ����ֻ����ʾ����ĵ�ַ
        System.out.println(xx);
        // System.out.println(xx[1]);
        // System.out.println(xx[2]);
        // System.out.println(xx[0]);���鶼�Ǵ�0��ʼ����
        //xx.length��ʾ���ǣ����鳤����һ�����֣�[]�е�����Ҳ����ֱ�Ӷ���.
        System.out.println(xx.length);
        int x = 0;
        for (System.out.println("��ʼ�����"); x < xx.length; x++) {
            System.out.println("��" + x + "�����ǣ�" + xx[x]);
            //System.out.println(xx[x]);
            System.out.println("�ظ���ʾ--------------------");
        }
        // show();
        // sum();
        // mx();
        // guessnum();
        rank();
    }

    public static void show() {
        int[] x = new int[9];
        x[8] = 11;
        for (int i = 0; i < 9; i++) {
            System.out.println(x[i]);
        }
        System.out.println("����");
    }

    // ֱ��ʹ��������.fori�ͻ��Զ�����һ������ѭ��
    public static void sum() {
        int[] x = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(x.length);
        int sim = 0;
        for (int i = 0; i < x.length; i++) {
            sim += x[i];
        }
        System.out.println(sim);
    }

    public static void mx() {
        int[] x = {11, 1, 56, 4, 165, 1, 65, 4, 8, 498};
        int max = 0;
        int min = 0;
        for (int i = 0; i < x.length; i++) {
            max = max < x[i] ? x[i] : max;
            min = min > x[i] ? x[i] : min;
            // if(max<x[i]){
            //     max=x[i];
            // }else if(min>x[i]){
            //     min=x[i];
            // }
        }
        System.out.println(max + "***" + min);
    }

    public static void guessnum() {
        Random xx = new Random();
        int[] x = new int[5];
        for (int i = 0; i < 5; i++) {
            int i1 = xx.nextInt(20);
            x[i] = i1;
        }
        Scanner x1 = new Scanner(System.in);
        OUT:
// ѭ��������λ��
        while (true) {
            System.out.println("����������:");
            int i = x1.nextInt();
            for (int j = 0; j < x.length; j++) {
                if (i == x[j]) {
                    System.out.println("right num");
                    // for (int i1 = 0; i1 < x.length; i1++) {
                    //     System.out.println(x[i1]);
                    // }
                    break OUT;//ֱ�ӽ�����outλ��
                }
            }
        }
    }

    public static void rank() {//ð������
        int[] x={1,1,1,321,5,54,4,85,64};
        for (int i = 0,mid=0; i < x.length-1; i++) {
            // if (x[i]>x[i+1]){
            //     mid=x[i];
            //     x[i]=x[i+1];
            //     x[i+1]=mid;
            // }
            // i == 0  �ȽϵĴ��� 3  j = 0 1 2
            // i == 1  �ȽϵĴ��� 2  j = 0 1
            // i == 2  �ȽϵĴ��� 1  j = 0
            // 3������һ��ѭ������ÿ�ֱȽϵĴ�����ռλ
            // ���ֻ�е���ѭ����ֻ�����һ�飬����������ѭ��Ƕ�������ʵ�ִ�С���������
            for (int j = 0; j < x.length-i-1; j++) {
                if (x[j]>x[j+1]){
                    mid=x[j];
                    x[j]=x[j+1];
                    x[j+1]=mid;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+"--");
        }
    }
}
