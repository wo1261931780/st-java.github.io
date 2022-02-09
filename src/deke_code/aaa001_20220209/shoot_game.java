package deke_code.aaa001_20220209;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * Author: junw
 * E-mail: 
 * Date: 2022��2��9��19:42:13
 * Time: 11:18
 * Description: 100%
 */
public class shoot_game {
  /*
  ����һ����������ɼ���
  �������ѡ�����ɴ�����ĳɼ�����
  ���ÿ��ѡ�ְ��������������֮�ͽ��н�������
  ��������������ѡ��id����
  ��������
    1. һ��ѡ�ֿ����ж������ɼ��ķ������Ҵ��򲻹̶�
    2. ���һ��ѡ�ֳɼ�����3��������Ϊѡ�ֵ����гɼ���Ч���������Ը�ѡ��
    3. ���ѡ�ֵĳɼ�֮����ȣ�����ȵ�ѡ�ְ�����id��������

   ��������:
     �����һ��
         һ������N
         ��ʾ�ó������ܹ�������N�����
         ����N���ɼ�����
         2<=N<=100

     ����ڶ���
       һ������ΪN��������
       ��ʾ����ÿ�������ѡ��id
       0<=id<=99

     ���������
        һ������ΪN��������
        ��ʾ����ÿ�����ѡ�ֶ�Ӧ�ĳɼ�
        0<=�ɼ�<=100

   �������:
      �������������Ľ����������ѡ��ID����

   ʾ��һ
      ����:
        13
        3,3,7,4,4,4,4,7,7,3,5,5,5
        53,80,68,24,39,76,66,16,100,55,53,80,55
      ���:
        5,3,7,4
      ˵��:
        �ó��������������13��
        ������ѡ��Ϊ{3,4,5,7}
        3��ѡ�ֳɼ�53,80,55 ��������ɼ��ĺ�Ϊ188
        4��ѡ�ֳɼ�24,39,76,66  ��������ɼ��ĺ�Ϊ181
        5��ѡ�ֳɼ�53,80,55  ��������ɼ��ĺ�Ϊ188
        7��ѡ�ֳɼ�68,16,100  ��������ɼ��ĺ�Ϊ184
        �Ƚϸ���ѡ�����3���ɼ��ĺ�
        ��3��=5��>7��>4��
        ����3�ź�5�ųɼ����  ��id 5>3
        �������5,3,7,4
   */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<Integer> ids = toIntList(in.nextLine());
        List<Integer> scores = toIntList(in.nextLine());
        in.close();

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Integer id = ids.get(i);
            Integer score = scores.get(i);
            List<Integer> list = map.getOrDefault(id, new LinkedList<>());
            list.add(score);
            map.put(id, list);
        }
        StringBuilder builder = new StringBuilder();

        map.entrySet()
                .stream()
                .filter(x -> x.getValue().size() >= 3)
                .sorted((o1, o2) -> {
                    Integer sum1 = sumT3(o1.getValue());
                    Integer sum2 = sumT3(o2.getValue());
                    if (sum1.equals(sum2)) {
                        return o2.getKey() - o1.getKey();
                    } else {
                        return sum2 - sum1;
                    }
                })
                .map(Map.Entry::getKey)
                .forEach(x -> builder.append(x).append(","));

        System.out.println(builder.substring(0, builder.length() - 1));

    }

    private static Integer sumT3(List<Integer> list) {
        list.sort(Integer::compareTo);
        int sum = 0;
        for (int i = list.size() - 1; i >= list.size() - 3; i--) {
            sum += list.get(i);
        }
        return sum;
    }

    private static List<Integer> toIntList(String str) {
        return Arrays.stream(str.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
