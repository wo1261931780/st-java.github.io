package leetcode.eee002deke_code.aaa009_20220413;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220413
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-12-57  ������
 */
// ����һ�� int �����������մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�������
// ��֤������������һλ���� 0 �����մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�����


public class ccc001 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int demo = x.nextInt();
        show(demo);
    }

    public static void show(int demo) {
        String x1 = demo + "";
        Set<String> x = new LinkedHashSet<>();
        for (int i = x1.length() - 1; i >= 0; i--) {
            char xx = x1.charAt(i);
            if (xx == '0' && i == x1.length() - 1) {
            } else {
                x.add(xx + "");
            }
        }
        x.forEach(System.out::print);
    }
}
