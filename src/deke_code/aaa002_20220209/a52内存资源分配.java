package deke_code.aaa002_20220209;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class a52�ڴ���Դ���� {
    /*
    ���̵�������λ��M,G,T�������ȼ�
    ����֮��Ļ����ϵΪ
    1T=1024G
    1G=1024M
    ���ڸ���N����̵�����
      ������ǰ���С�����˳������ȶ�����
      �������5��������
      1T,20M,3G,10G6T,3M12G9M
    �����Ľ��Ϊ20M,3G,3M12G9M,1T,10G6T

    ע�ⵥλ�����ظ�����
    ����3M12G9MΪ 3M+12G+9M�� 12M12G���

    ��������:
    �����һ�а���һ������N
    2<=N<=100 ,��ʾ���̵ĸ���
    ��������N��ÿ��һ���ַ��� ���� (2<l<30)
    ��ʾ���̵�����
    ��һ��������ʽΪ mv���Ӵ����
    ����m��ʾ������С v��ʾ������λ
    ����

    ��������m�ķ�Χ 1~1024������
    ������λv�ķ�Χ������Ŀ���ᵽ��M,G,T

    �������:
     ���N��
     ��ʾN��������������Ľ��

     ʾ��1:
     ����
         3
         1G
         2G
         1024M

     ���
        1G
        1024M
        2G

    ˵�� 1G��1024M�������,�ȶ�����Ҫ��������ԭ�������λ��
    ��1G��1024Mǰ

     ʾ����:
     ����
          3
          2G4M
          3M2G
          1T

      ���
        3M2G
        2G4M
        1T
        ˵��1T����2G4M����3M2G

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        ArrayList<String> sizes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            sizes.add(in.nextLine());
        }
        in.close();
        sizes.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Long.compare(parseLong(o1), parseLong(o2));
            }
        });

        sizes.forEach(System.out::println);

    }

    static Long parseLong(String size) {
        String[] units = size.split("[0-9]+");
        String[] nums = size.split("[A-Z]+");
        //[, M, G, M]
        //[3, 12, 9]

        long sum = 0;
        for (int i = 1; i < units.length; i++) {
            long num = Long.parseLong(nums[i - 1]);
            switch (units[i]) {
                case "M":
                    sum += num;
                    break;
                case "G":
                    sum += num * 1024;
                    break;
                case "T":
                    sum += num * 1024 * 1024;
                    break;
            }
        }

        return sum;
    }
}
