package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aaa032˫ɫ���� {
    public static void main(String[] args) {
        int[] x = new int[7];
        int[] x1 = new int[7];
        // show(x);
        // Arrays.toString(type(x));
        int[] ss = type(x);
        // show2(x1);
        bj(show2(x1), ss);

    }

    public static void show(int[] xx) {
        Random x = new Random();
        for (int i = 0; i < xx.length - 1; i++) {

            int r1 = x.nextInt(33) + 1;
            out:
            for (int ii = 0; ii < xx.length; ii++) {
                if (xx[ii] == r1) {
                    r1 = x.nextInt(33) + 1;
                    break out;
                }
            }
            xx[i] = r1;
            // yn(xx, r1) ? xx[i] = r1 : r1 = x.nextInt(33) + 1;
        }
        int b1 = x.nextInt(16) + 1;
        xx[xx.length - 1] = b1;
        System.out.println(Arrays.toString(xx));
    }

    // �γ�д����
    public static int[] show2(int[] xx) {
        Random x = new Random();
        for (int i = 0; i < xx.length - 1; i++) {
            while (true) {
                // Ϊ�˲��ظ������֣���Ҫ���ѭ��
                // �ڲ�֪��ѭ������������£�ֱ�Ӹ���һ����ѭ������
                int r1 = x.nextInt(33) + 1;
                boolean sin = true;
                for (int i1 = 0; i1 < i; i1++) {
                    //����ע��д����ǰ���index,��i1����i
                    if (r1 == xx[i1]) {
                        sin = false;
                        break;
                    }
                }
                if (sin) {
                    xx[i] = r1;
                    break;
                    // ��ɸ�ֵ��ֱ�ӽ����������ѭ��
                }
                // ����Ҳ����Ҫע��ģ�
                // û�б�Ҫ��������������ж�

                // if (sin == false) {
                //     break;
                // } else {
                //     xx[i] = r1;
                // }
            }
        }
        int b1 = x.nextInt(16) + 1;
        xx[xx.length - 1] = b1;
        System.out.println(Arrays.toString(xx));
        return xx;
    }

    public static int[] type(int[] xx) {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < xx.length - 1; i++) {
            //����ѭ����ǰ�ᣬ����һ��״̬��������
            while (true) {
                System.out.println("please enter in" + i + "λ������");
                xx[i] = x.nextInt();
                boolean stage = true;
                for (int i1 = 0; i1 < i; i1++) {
                    if (xx[i1] == xx[i]) {
                        stage = false;
                        break;
                    }
                }
                // �����ж��Ƿ�����ѭ������������ͬ���ݵ�ʱ����
                if (stage) {
                    break;
                }
            }
        }
        System.out.println("��������ɫ�����");
        xx[xx.length - 1] = x.nextInt();
        System.out.println(Arrays.toString(xx));
        System.out.println("finish");
        return xx;
    }

    public static void bj(int[] x1, int[] x2) {
        int red = 0;
        int blue = 0;
        for (int i = 0; i < x1.length; i++) {
            // if (x1[i] != x2[i]) {
            //     System.out.println("�����");
            //     return;
            // }
            for (int i1 = 0; i1 < x2.length; i1++) {
                if (x1[i] != x2[i1]) {
                    // return;
                } else {
                    if (i == x1.length - 1) {
                        blue++;
                    } else {
                        red++;
                    }
                }
            }
        }
        System.out.println("�н��������ɫ" + red + "��ɫ" + blue);


    }
}
