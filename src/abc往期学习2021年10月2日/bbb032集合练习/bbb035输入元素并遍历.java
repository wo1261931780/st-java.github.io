package abc����ѧϰ2021��10��2��.bbb032������ϰ;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * �����룬Ȼ������Ķ���洢�������У�
 * ���Լ����е�Ԫ�ؽ��б�������
 */

public class bbb035����Ԫ�ز����� {
    public static void main(String[] args) {
        ArrayList<String> xx = new ArrayList<>();
        Scanner zz = new Scanner(System.in);
        //        int x=0;
        System.out.println("��ʼѭ��");
        for (int x = 0; x < 5; x++) {
            System.out.println("����������:");
            String x1 = zz.nextLine();
            xx.add(x1);
            // add�Ǵ�ĩβ��ʼ��ӣ����翪ʼ��1��add2֮�󣬾ͱ����[1,2]
        }
        System.out.println(xx);
        //�����[1, 1, 1, 2, 2]

        for (int x = 0; x < xx.size(); x++) {
            System.out.println(xx.get(x));
        }
        //�������������һ�����������ϣ�����������
        // 2021��11��2��20:20:46
        // ������ô����������һ��Ҫд��
    }
}
