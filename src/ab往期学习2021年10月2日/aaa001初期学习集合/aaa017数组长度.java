package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;
/*
public class aaa003 {
    public static void main(String[] args) {
        int[] xx = {6543, 12, 1, 65, 423, 132, 45674, 61, 8967, 84, 51, 6};
        int max = xx[0];
        int min = xx[1];
        int x1 = 0;
        for (System.out.println("��ʼѭ����"); x1 < xx.length; x1++) {
            if (max < xx[x1]) {
                max = xx[x1];
            } else if (min > xx[x1]) {
                min = xx[x1];
            }
        }
        System.out.println("��Сֵ�ǣ�" + min + ";���ֵ�ǣ�" + max);
    }
}
*/

import java.util.Scanner;
import java.util.Random;

public class aaa017���鳤�� {
    public static void main(String[] args) {
        //����һ������
        Scanner xx = new Scanner(System.in);
        System.out.println("������һ����ֵ����ֵ��������ֵ����");
        int z0 = xx.nextInt();
        //����õ�һ������
        Random xr = new Random();
        int z1 = xr.nextInt(1000);
        //���������ּ�������
        int[] x1 = {1, 2, 3, z0, z1};
        int[] x2 = new int[5];
        int x = 0;
        //���ֵ����Сֵ��
        int max = x1[0];
        int min = x1[0];
        /*
        for(System.out.println("��ʼ����");x<x1.length;x++){
            if(min < x1[x]){
                x2[x] = min;
            }else{
                min = x1[x];
                x2[x] = min;
            }
        }�������
        */
        for (System.out.println("��ʼ�����"); x < x1.length; x++) {
            if (max < x1[x]) {
                max = x1[x];
            } else if (min > x1[x]) {
                min = x1[x];
            }
        }
        System.out.println("���ֵ�ǣ�" + z1);
        System.out.println("����ֵ�ǣ�" + z0);
        System.out.println("���ֵ�ǣ�" + max);
        System.out.println("��Сֵ�ǣ�" + min);
    }
}
