
package abc����ѧϰ2021��10��2��.aaa001����ѧϰ����;

import java.util.Random;
import java.util.Scanner;

public class aaa007switch����жϼ���case {
    public static void main(String[] args) {
        Scanner b11 = new Scanner(System.in);
        System.out.println("�����·ݣ�");
        int xx = b11.nextInt();
        // switch (xx) {
        //switch�ڲ���һ�����ʽ��Ȼ������ź������ж����

        switch (xx) {
            // case 1:
            //     System.out.println("����һ");
            //     break;
            // case 2:
            //     System.out.println("���ڶ�");
            //     break;
            // case 3:
            //     System.out.println("������");
            //     break;
            // case 4:
            //     System.out.println("������");
            //     break;
            // case 5:
            //     System.out.println("������");
            //     break;
            // case 6:
            //     System.out.println("������");
            //     break;
            // case 7:
            //     System.out.println("������");
            //     break;
            case 1:
            case 2:
            case 3:
                System.out.println("����");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("�ļ�");
                break;
            //������Ҫһ��˵����
            //456ͬʱ���ļ�������45�·�û��break�����Գ������ִ�е�6�������ļ�����ʾ��Ȼ��break����
            //�����breakȥ������ô�����������е�9�·���ʾ���֣�Ȼ�����
            //רҵ���ʣ�case��͸
            case 7:
            case 8:
            case 9:
                System.out.println("�＾");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("����");
                break;
            default:
                //������䲻ƥ�䣬Ĭ��ִ��default
                System.out.println("ʱ����󣬳������");
                // break;
                //break��ֱ�ӽ���������default����ֱ��ʡ�ԣ�2021��9��7��11:02:05
        }
        show();
    }

    public static void show() {
        Random random = new Random();
        int x = random.nextInt(200);
        switch (x) {
            case 1:
            case 2:
                System.out.println("show");
                break;
            default:
                System.out.println(x+"error");
                break;
        }
    }
}
