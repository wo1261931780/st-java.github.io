package c2stage_20220220.ccc061for_plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc060��ǿfor
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-12  ������
 */
public class ccc001for���� {
    public static void main(String[] args) {
        showint();
        showstring();
        // ����ֱ���л���ͬ��Ԫ�ؼ���
        // Ҳ����ֱ���л�Ϊ���������½�һ��student�࣬Ȼ������е�Ԫ��ִ�б���
    }

    public static void showint() {
        int[] x = {1, 32, 16, 54, 654, 8, 7};
        System.out.println(Arrays.toString(x));// [1, 32, 16, 54, 654, 8, 7]
        for (int i : x) {
            System.out.println(i);
        }
    }

    public static void showstring() {
        Collection<String> x = new ArrayList<>();
        x.add("demo1");
        x.add("demo2");
        x.add("demo3");
        x.add("demo4");
        System.out.println("���ϣ�" + x);// ���ϣ�[demo1, demo2, demo3, demo4]
        for (String i : x) {
            System.out.println("����Ԫ�أ�" + i);
        }

    }
}
