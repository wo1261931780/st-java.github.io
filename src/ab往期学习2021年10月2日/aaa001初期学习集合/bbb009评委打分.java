package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Scanner;

public class bbb009��ί��� {
    // public static void main(String[] args) {
    //     Random xx = new Random();
    //     int[] arr = new int[6];
    //     int x = 0;
    //     for (System.out.println("start"); x < arr.length; x++) {
    //         arr[x] = xx.nextInt(100);
    //         System.out.println("��" + x + "λ��ί�����ĵ÷��ǣ�" + arr[x]);
    //     }
    //     //        int max=0;
    //     mm(arr, x);
    //     //        System.out.println("���ֵ�ǣ�");
    //     //�����ǹٷ��ķ���-------------------------
    //     //�����ǹٷ��ķ���-------------------------
    //     //�����ǹٷ��ķ���-------------------------
    //     /*����������������������ƽ���ֵķ��������Ǳ���˼������ͬ��
    //     Scanner zz=new Scanner(System.in);
    //     int z1=zz.nextInt();
    //     for (int z=0;z< arr.length;z++){
    //         System.out.println("��"+(z+1)+"����ί�ķ����ǣ�");//����������Ը����󣬵��ǲ��ܸ�����/���
    //         arr[z]=zz.nextInt();
    //     }*/
    // }
    //
    // public static void mm(int[] arr, int x) {
    //     int mn = 0;
    //     //���ﶨ��û�����⣬������max=0��˵���Ǳ�����ʼ��ʱ��x���ǲ���ȷ�����ݣ����¸���û�н��б�����
    //     //��Ҫ��x����һ�ζ��塣
    //     x = 0;
    //     int max = arr[x];
    //     int min = arr[x];
    //     for (System.out.println("��ʼ�Ա�"); x < arr.length; x++) {
    //         if (max < arr[x]) {
    //             max = arr[x];
    //             mn += arr[x];
    //         } else if (min > arr[x]) {
    //             min = arr[x];
    //             mn += arr[x];
    //         } else {
    //             mn += arr[x];
    //         }
    //     }
    //     mn = mn - max - min;
    //     System.out.println("��������,���ֵΪ��" + max + ".��������,��СֵΪ��" + min);
    //     //System.out.println("ѡ�ֵ÷֣�" + mn/4);
    //     //����ĳ�arr.length-2�ȽϿ�ѧ
    //     System.out.println("ѡ�ֵ÷��ǣ�" + mn / (arr.length - 2));
    // }
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        int[] score1 = new int[6];
        demoimp(score1);
        demosc(score1);
    }

    public static void demoimp(int[] score1) {
        System.out.println("��ʼ�������ݣ�");
        Scanner x1 = new Scanner(System.in);
        for (int i = 0; i < score1.length; i++) {
            System.out.println("�����" + i + "������:");
            int c = x1.nextInt();
            score1[i] = c;
        }
        System.out.println("��ֽ���");
        // System.out.println("�����һ��������");
        // int c1 = x1.nextInt();
        // score1[1] = c1;
        // System.out.println("����ڶ���������");
        // int c2 = x1.nextInt();
        // System.out.println("���������������");
        // int c3 = x1.nextInt();
        // System.out.println("������ĸ�������");
        // int c4 = x1.nextInt();
        // System.out.println("��������������");
        // int c5 = x1.nextInt();
        // System.out.println("���������������");
        // int c6 = x1.nextInt();
    }

    public static void demosc(int[] score1) {
        int max = score1[0];
        int min = score1[0];
        int x = 0;
        for (int i = 0; i < score1.length; i++) {
            if (score1[i] > max) {
                max = score1[i];
            } else if (score1[i] < min) {
                min = score1[i];
            }
            x += score1[i];
        }
        x = (x - max - min) / (score1.length - 2);
        System.out.println("ƽ����Ϊ��" + x);
    }
}
