package leetcode;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-10-46  ������
 */


//����
// ���������ַ������밴����Ϊ8���ÿ�������ַ��������������
// ���Ȳ���8���������ַ������ں��油����0�����ַ���������
// ��ע�������ж������룩
// ����������
// ���������ַ���(������,ÿ���ַ�������С�ڵ���100)
//
// ���������
// ����������зָ��ĳ���Ϊ8�����ַ���
// abc
// 123456789
// �����
// abc00000
// 12345678
// 90000000


public class ccc20220218 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (x.hasNext()) {
            String x1 = x.nextLine();
            show(x1);
        }
    }

    public static String show(String x1) {
        int x2 = x1.length();
        if (x2 <= 8 && x2 > 0) {
            for (int i = 0; i < 8 - x2; i++) {
                x1 += "0";
            }
            System.out.println(x1);
            return x1;
        } else {
            System.out.println(x1.substring(0, 8));
            show(x1.substring(8, x2));
        }
        // System.out.println(x1);
        return x1;
    }
}
