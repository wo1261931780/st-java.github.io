package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;
/*
    �������ǽ����ж������ܵĴ������֯��Ϊһ�����壬ʹ��������⹦�ܵĴ��뼯
    �����ʽ��
        public static void ������ ( ) {
	        //������
	    }
	���ø�ʽ��
	    ������();
 */

import java.util.Scanner;

public class aaa018�βκ�ʵ�� {
    public static void main(String[] args) {
        // ���Բ����ݲ�����ֱ�ӵ��÷���
        showdemo();
        //����Ҫע�⣬���������ķ����������ڲ�Ϊ��
        System.out.println("------------------------------------------------");
        //���÷�����ʱ����ʵ��
        max(10, 20);
        // max�����У����ݵ���������10��20����ʵ��
        // ������÷����У����ݵ���number�����������ônumberҲ��ʵ��
        // ------------------------------------------------

        // ���÷�����ֱ��ʹ�÷�������Ȼ�������ڴ��ݲ�������
        //���ε�ʱ�򣬲��������ͺ���������һ�£���������
        Scanner xx = new Scanner(System.in);
        System.out.println("������������֣�");
        int pn = xx.nextInt();
        divides(pn);
        System.out.println("ִ�����");
    }

    public static void showdemo() {
        int a = 11;
        String b = "���ǲ��������ķ���";
        System.out.println(a + b);
    }

    /**
     * ���涨�巽��int xx��ʱ�����β�
     */
    public static void max(int xx, int x2) {
        System.out.println("���Ǵ������ķ������Ƚϴ�С");
        if (xx > x2) {
            System.out.println("���ֵΪ" + xx);
        } else {
            System.out.println("���ֵΪ" + x2);
        }
        //���巽�������������ƿ�������
        /*Scanner xx = new Scanner(System.in);
        System.out.println("���������֣�");
        int x1 = xx.nextInt();
        if(x1%2 == 0){
            System.out.println("ż��");
        }else {
            System.out.println("����");
        }
        System.out.println("���н���");*/
        /*int[] arr = {131, 1, 233};
        int x = 0;
        int max = 0;
        for (System.out.println("��ʼ�Ƚ�"); x < arr.length; x++)
            if (x1 > arr[x]) {
                max = x1;
            } else {
                max = arr[x];
            }
        System.out.println("���ֵΪ��" + max);*/
    }

    /**
     * �����еĲ����������βΣ����������number
     */
    public static void divides(int number) {
        if (number % 2 == 0 && number > 0) {
            System.out.println(number + "Ϊż��");
        } else if (number % 2 == 1 && number > 0) {
            System.out.println(number + "Ϊ����");
        } else {
            // while (number < 0) {
            System.out.println("���ݴ�������������");
            // break;
            // }
        }
    }
}
