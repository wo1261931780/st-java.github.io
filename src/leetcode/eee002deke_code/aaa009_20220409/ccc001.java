package leetcode.eee002deke_code.aaa009_20220409;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220409
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-15-47  ������
 * ����������NN��1��500֮����������������ɾȥ�����ظ������֣�����ͬ������ֻ����һ������������ͬ����ȥ����Ȼ���ٰ���Щ����С�������򣬰����źõ�˳�������
 * ���ݷ�Χ�� 1 \le n \le 1000 \1��n��1000  ����������ִ�С���� 1 \le val \le 500 \1��val��500
 */
public class ccc001 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        // Set
        // while (x.hasNext()) {
        //     int demo_index = x.nextInt();
        //     for (int i = 0; i < demo_index; i++) {
        //     }
        // }
        // ��ʵ�����и����⣬���������������ݣ�n1��n2����ô�ҵĲ��Խ����������n1��n2�ϲ���һ����������Ƿֿ�������飿
    }

    public static void show() {
        Scanner x1 = new Scanner(System.in);
        int show_num = x1.nextInt();
        Set x2 = new TreeSet();
        for (int i = 0; i < show_num; i++) {
            int demo_num = x1.nextInt();
            if (demo_num >= 1 && demo_num <= 500) {
                System.out.println(demo_num);
                x2.add(demo_num);
            }
        }
        x2.stream().forEach(System.out::println);
    }
}
