package leetcode.eee002deke_code.aaa009_20220413;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:leetcode.eee002deke_code.aaa009_20220413
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-14  ������
 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ��� ASCII �뷶Χ��( 0~127 ������ 0 �� 127 )�����б�ʾ���������������ַ�����ڷ�Χ�ڵĲ���ͳ�ơ������ͬ���ַ�ֻ����һ��
 * ���磬�����ַ��� abaca ���ԣ��� a��b��c ���ֲ�ͬ���ַ��������� 3 ��
 */
public class ccc002 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String demo = x.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < demo.length(); i++) {
            char str = demo.charAt(i);
            map.put(str, 1);
        }
        Set<Character> demo2 = map.keySet();
        System.out.println(demo2.size());
    }
}
