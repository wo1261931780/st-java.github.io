package ab����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Random;

/**
 * ���󣺶��巽��ʵ���������һ��5λ����֤�룬ÿλ���������֡���д��ĸ��Сд��ĸ��
 */
public class aaa028��֤�� {
    public static void main(String[] args) {
        System.out.println(show(5));
        System.out.println("end");

    }

    // public static String show() {
    //     String x = "";
    //     for (int i = 0; i < 5; i++) {
    //         x += (char) show2() + "";
    //     }
    //     System.out.println(x);
    //     return x;
    // }
    //
    // public static int show2() {
    //     Random x1 = new Random();
    //     int i = x1.nextInt(3);
    //     if (i == 0) {
    //         int x2 = x1.nextInt(10) + 48;
    //         // 0��Ӧ���ַ�Ϊ48-57��
    //         System.out.println((char) x2);
    //         return x2;
    //     } else if (i == 1) {
    //         int x3 = x1.nextInt(26) + 65;
    //         // A��Ӧ���ַ�Ϊ65-91��
    //         System.out.println((char) x3);
    //         return x3;
    //     } else {
    //         int x4 = x1.nextInt(26) + 97;
    //         // a��Ӧ���ַ�Ϊ97-113��
    //         System.out.println((char) x4);
    //         return x4;
    //     }
    // }
    // �����൱���ҵ�show2������������Σ�����Ч�ʺܵ�

    public static String show(int n) {
        // �������Ǿ߱�����ֵ�ģ���Ϊ�����Ľ�����������������ط�������
        String x = "";
        Random xx = new Random();
        for (int i = 0; i < n; i++) {
            int x1 = xx.nextInt(3);
            if (x1 == 0) {
                int x2 = xx.nextInt(10) + 48;
                x += (char) x2 + "";
            } else if (x1 == 1) {
                int x2 = xx.nextInt(26) + 65;
                x += (char) x2 + "";
            } else {
                int x2 = xx.nextInt(26) + 97;
                x += (char) x2 + "";
            }
        }
        return x;
    }
}
