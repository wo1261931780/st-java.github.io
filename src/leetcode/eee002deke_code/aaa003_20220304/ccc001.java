package leetcode.eee002deke_code.aaa003_20220304;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa003_20220304
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-20  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (x.hasNext()) {
            show(x.nextInt());
        }
    }

    // ����
    // ���С�ڵ��� n ���� 7 �й����ֵĸ��������� 7 �ı��������а��� 7 �����֣��� 17 ��27 ��37 ... 70 ��71 ��72 ��73...���ĸ�����һ���������������ж������ݣ���ע�⴦��
    // ���ݷ�Χ�� 1 \le n \le 30000 \1��n��30000
    // �����ж�������
    // ����������
    // ��������ÿ������ 1 �������� n ��( n ������ 30000 )
    // ���������
    // ������n����7�йص����ָ�������������20����7�йص����ְ���7,14,17.

    public static int show(int x) {
        // 1.������
        // 2.��7����
        int num = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 7 == 0) {
                num++;
            } else {
                String demo = i + "";
                for (int j = 0; j < demo.length(); j++) {
                    int zf = demo.charAt(j) - '0';
                    if (zf == 7) {
                        num++;
                        break;
                    }
                }
            }
        }
        return num;
    }
}
