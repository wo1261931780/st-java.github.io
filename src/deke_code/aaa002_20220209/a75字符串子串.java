package deke_code.aaa002_20220209;

import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/10/27
 * Time: 17:11
 * Description:
 */
public class a75�ַ����Ӵ� {
  /*
  ����һ���ַ���
  �ַ������Ȳ�����100
  �����ַ�������ͬ�ַ��������ֵ�������

  ��������
    ����ֻ��һ�У�����һ�����Ȳ�����100���ַ���

  �������
    ���ֻ��һ�У������ͬ�ַ����������ֵ�������

   ˵����
     ���

   ʾ��1��
     ����
       hello
     ���
       2

    ʾ��2��
      ����
       word
      ���
       1

     ʾ��3��
      ����
        aaabbc
       ���
        3

    �ַ������ִ�Сд
   */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        char[] chars = str.toCharArray();

        int maxLen = 0;

        for (int i = 0; i < chars.length; i++) {
            int index = i;
            int len = 1;
            while (index + 1 < chars.length && chars[index + 1] == chars[index]) {
                len++;
                index++;
            }
            if (len > maxLen) maxLen = len;
        }

        System.out.println(maxLen);

    }

}
