package c2stage_20220302.ccc080treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc080treeset
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-39  ������
 */
public class ccc001treeset {
    public static void main(String[] args) {
        // treeset��������Ϊ���������
        Set<String> x = new TreeSet<>();
        x.add("2demo1");
        x.add("2demo2");
        x.add("5demo3");
        x.add("3demo4");
        System.out.println(x);// [2demo1, 2demo2, 3demo4, 5demo3]
        // Ԫ������ĸ-����char��intֵ-ȥ���ظ�-
    }
}
