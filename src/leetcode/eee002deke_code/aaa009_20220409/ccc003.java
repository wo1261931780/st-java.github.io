package leetcode.eee002deke_code.aaa009_20220409;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220409
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-10  ������
 * ����:����һ�������������մ�С�����˳������������������ӣ��ظ���ҲҪ�о٣�����180��������Ϊ2 2 3 3 5 ��
 * <p>
 * <p>
 * ���ݷ�Χ�� 1 \le n \le 2 \times 10^{9} + 14 \1��n��2��10
 * 9
 * +14
 */
public class ccc003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long k = (long) Math.sqrt(num);

        for (long i = 2; i <= k; ++i) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        System.out.println(num == 1 ? "" : num + " ");
    }

    // 2022��4��9��21:13:58
    // ��ʵ������û�н���ģ����µĴ��룬���һЩ���������޷�ͨ��
    // ����һЩ�ر��������������û��������

    // public static Map<Integer, List<Integer>> x1 = new HashMap<>();
    // public static List<Integer> x2 = new ArrayList<>();

    // static {
    //     x1.put(2, x2);
    //     x1.put(3, x2);
    //     x1.put(5, x2);
    //     x1.put(7, x2);
    //     x1.put(11, x2);
    //     x1.put(13, x2);
    //     x1.put(17, x2);
    //     x1.put(19, x2);
    //     x1.put(23, x2);
    //     x1.put(27, x2);
    //     x1.put(29, x2);
    // }

    // public static void main(String[] args) {
    //     Scanner x = new Scanner(System.in);
    //     int demo_num = x.nextInt();
    //     int res = demo_num;
    //     Set<Integer> list = x1.keySet();
    //     while (res > 1) {
    //         for (Integer integer : list) {
    //             if (res % integer == 0 && res != 1) {
    //                 res = res / integer;
    //                 x2.add(integer);
    //                 if (res % 2 == 0 && integer > 3) {
    //                     break;
    //                 }
    //             }
    //         }
    //         show(res);
    //
    //     }
    //     x2.sort((Comparator.comparingInt(o -> o)));
    //     for (int i = 0; i < x2.size(); i++) {
    //         String x3 = i == x2.size() - 1 ? "" : " ";
    //         System.out.print(x2.get(i) + x3);
    //     }
    // }
    //
    // public static void show(int demonum) {
    //     long demo = (long) Math.sqrt(demonum);
    //     for (long i = 2; i < demo; i++) {
    //         while (demo % i == 0) {
    //             // System.out.println(demo + " ");
    //             demo /= i;
    //         }
    //     }
    //     // System.out.println(demo == 1 ? "" : demo + "");
    // }
}
