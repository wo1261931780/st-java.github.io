package leetcode.eee002deke_code.aaa009_20220414;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220414
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-12-51  ������
 * ���� n ���ַ�������� n ���ַ��������ֵ������С�
 * �����һ��Ϊһ��������n(1��n��1000),����n��Ϊn���ַ���(�ַ������ȡ�100),�ַ�����ֻ���д�Сд��ĸ��
 * �������n�У�������Ϊ�����ֵ������е��ַ�����
 */
public class ccc001 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String num = x.nextLine();
        // Set<String> x1 = new TreeSet<>();
        // for (int i = 0; i < Integer.valueOf(num); i++) {
        //     String demo = x.nextLine();
        //     x1.add(demo);
        // }
        // Ϊ�˱�֤�ַ��������ظ��������ʹ��list���͵�
        List<String> x1 = new ArrayList<>();
        for (int i = 0; i < Integer.valueOf(num); i++) {
            String demo = x.nextLine();
            x1.add(demo);
        }
        x1.stream().sorted().forEach(System.out::println);
        // x1.forEach(System.out::println);

    }
}
