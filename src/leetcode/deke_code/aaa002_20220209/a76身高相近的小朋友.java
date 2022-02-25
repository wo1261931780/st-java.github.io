package leetcode.deke_code.aaa002_20220209;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * Created with IntelliJ IDEA.
 * Author: Amos
 * E-mail: amos@amoscloud.com
 * Date: 2021/10/27
 * Time: 17:29
 * Description:
 */
public class a76��������С���� {
  /*
  ��ѧУ��
  N��С����վ��һ��
  ��i��С���ѵ����Ϊheight[i]
  ��i��С���ѿ��Կ�����һ�����Լ���߸��ߵ�С����j
  ��ôj��i�ĺ�����
  (Ҫ��j>i)
  ����������һ���б�
  ��Ӧλ�õ������ÿ��С���ѵĺ����ѵ�λ��
  ���û�п���������
  ���ڸ�λ����0����
  С����������Χ 0~40000

  ����������
    ��һ������N
    N��ʾ��N��С����

    �ڶ�������N��С���ѵ����height[i]
    ��������

  ���������
    ���N��С���ѵĺ����ѵ�λ��

  ʾ��1��
     ���룺
       2
       100 95
      ���
       0 0
     ˵��
       ��һ��С�������100վ�ڶ���ĩβ
       ����׿� û�б�����߸ߵ�С����
       ���������һ��ֵΪ0
       �ڶ���С����վ�ڶ���ǰ��Ҳû�б�����߸ߵ�С����
       ��������ڶ���ֵΪ0

   ʾ��2��
      ����
        8
        123 124 125 121 119 122 126 123
      ���
        1 2 6 5 5 6 0 0
       ˵����
       123�ĺ�������1λ���ϵ�124
       124�ĺ�������2λ���ϵ�125
       125�ĺ�������6λ���ϵ�126
        ��������

   */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }
        String[] strs = in.nextLine().split(" ");

        List<Integer> height = Arrays.stream(strs)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        LinkedList<Integer> res = new LinkedList<>();

        for (int i = 0; i < height.size(); i++) {
            int pos = 0;
            for (int j = i + 1; j < height.size(); j++) {
                if (height.get(j) > height.get(i)) {
                    pos = j;
                    break;
                }
            }
            res.add(pos);
        }

        StringBuilder builder = new StringBuilder();
        res.forEach(x -> builder.append(x).append(" "));
        if (builder.length() > 1) {
            String substring = builder.substring(0, builder.length() - 1);
            System.out.println(substring);
        }

    }
}
