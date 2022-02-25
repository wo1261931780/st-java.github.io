package leetcode.deke_code.aaa002_20220209;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/3/11
 * Time: 15:38
 * Description:
 */
public class a031������Ȼ��֮�� {
    public static void main(String[] args) {
        /*
        һ��������������������Ȼ��֮������ʾ
        ����һ������
        ����������м���������Ȼ��֮�͵ı��ʽ
        ����ӡ��ÿһ�ֱ��ʽ

        ��������
        һ��Ŀ������t  1<= t <=1000

        �������
        1.�����������б��ʽ�ͱ��ʽ�ĸ���
        ����ж��ֱ��ʽ����Ȼ���������ٵı��ʽ�������
        2.ÿ�����ʽ�а���Ȼ���������

        ����ĸ�ʽ�μ�����
        ��ÿ���������ݽ���ʱ�����һ��"Result:X"
        ����X�����յı��ʽ����

        ����
        9

        ���
        9=9
        9=4+5
        9=2+3+4
        Result:3

        ˵�� ����9�����ֱ�﷽����

        ʾ����
        ����
        10
        ���
        10=10
        10=1+2+3+4
        Result:2

         */

        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        System.out.println(t + "=" + t);

        ArrayList<String> res = new ArrayList<>();

        for (int n = 1; n < t; n++) {
            int sum = 0;
            StringBuilder builder = new StringBuilder();
            for (int i = n; sum < t; i++) {
                sum += i;
                builder.append(i).append("+");
                if (sum == t) {
                    res.add(t + "=" + builder.substring(0, builder.length() - 1));
                    break;
                }
            }
        }
        res.sort(Comparator.comparingInt(String::length));
        res.forEach(System.out::println);

        System.out.println("Result:" + (res.size() + 1));
        in.close();
    }
}
