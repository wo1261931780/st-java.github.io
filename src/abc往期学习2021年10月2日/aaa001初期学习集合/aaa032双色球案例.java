package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Arrays;
import java.util.Random;

public class aaa032˫ɫ���� {
    public static void main(String[] args) {
        int[] x = new int[7];
        show(x);

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
    public static void show2(int[] xx) {
        Random x = new Random();
        for (int i = 0; i < xx.length - 1; i++) {

            while (true) {
                // Ϊ�˲��ظ������֣���Ҫ���ѭ��
                // �ڲ�֪��ѭ������������£�ֱ�Ӹ���һ����ѭ������
                int r1 = x.nextInt(33) + 1;
                boolean sin = true;
                for (int i1 = 0; i1 < i; i1++) {
                    if (r1 == xx[i]) {
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
    }
}
