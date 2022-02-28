package leetcode.eee002deke_code.aaa002_20220209;

import java.util.Scanner;

public class a01������� {
    /*��Ŀ85
      ��һ��������������
      ������A��Ctrl-C��Ctrl-X��Ctrl-V��Ctrl-A
      A������Ļ�����һ����ĸA
      Ctrl-C����ǰ��ѡ����ĸ���Ƶ�������
      Ctrl-X����ǰѡ�����ĸ���Ƶ������岢�����ѡ�����ĸ
      Ctrl-V����ǰ���������ĸ�������Ļ
      Ctrl-Aѡ��ǰ��Ļ��������ĸ
      ע�⣺
        1. �������ʼΪ��
        2. �µ����ݸ��Ƶ�������Ḳ��ԭ������
        3. ����Ļ��û����ĸʱ,Ctrl-A��Ч
        4. ��û��ѡ����ĸʱCtrl-C��Ctrl-X��Ч
        5. ������ĸ��ѡ��ʱA��Ctrl-V������������ܵļ�,
           ���������ѡ����ĸ�ٽ������

      ����һϵ�м�������,
      ���������Ļ����ĸ������

      ��������:
         ����Ϊһ��
         Ϊ�򻯽���������12345�ֱ����A��Ctrl-C��Ctrl-X��Ctrl-V��Ctrl-A������
         �����ÿո�ָ�

      �������:
          ���һ������Ϊ��Ļ����ĸ��������

      ʾ��һ:
          ����:
            1 1 1
          ���:
            3

     ʾ����:
          ����:
            1 1 5 1 5 2 4 4
          ���:
            2

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ops = in.nextLine();
        in.close();
        String[] list = ops.split(" ");

        StringBuilder builder = new StringBuilder();

        String choose = "";
        String tab = "";

        for (String op : list) {
            switch (op) {
                case "1":
                    choose = reset(builder, choose);
                    builder.append('A');
                    break;
                case "2":
                    if (!choose.isEmpty()) {
                        tab = choose;
                    }
                    break;
                case "3":
                    if (!choose.isEmpty()) {
                        tab = choose;
                        choose = "";
                        builder = new StringBuilder();
                    }
                    break;
                case "4":
                    choose = reset(builder, choose);
                    builder.append(tab);
                    break;
                case "5":
                    if (builder.length() != 0) {
                        choose = builder.toString();
                    }
                    break;
                default:
                    break;
            }

            System.out.println(builder);
            System.out.println(builder.length());
        }

        System.out.println(builder.length());
    }

    private static String reset(StringBuilder builder, String choose) {
        if (!choose.isEmpty()) {
            builder.replace(0, choose.length(), "");
            choose = "";
        }
        return choose;
    }
}
