package c2stage_20220326.ccc090collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc090collections
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-15-51  ������
 */
public class ccc001demo {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        // x.add("a1");
        // x.add("a2");
        // x.add("a3");
        // x.add("a4");
        // x.add("a5");
        Collections.addAll(x, "a1", "a2", "a3", "a4", "a5");
        System.out.println(x);// [a1, a2, a3, a4, a5]
        // Collections<? super cat,cat... x> demo=new eee035collections()
        // ����һ������Ĵ���
        // ������һ���ɱ����cat... x��cat���Ƕ�����
        // �������collectionsͨ��api�����������������

        Collections.shuffle(x);
        // ����ֻ�ܶ�list���в���
        System.out.println(x);// [a4, a3, a1, a2, a5]

        Collections.sort(x);// ��������
        System.out.println(x); // [a1, a2, a3, a4, a5]
        // ����ָ���Ķ������ͣ�ֻҪʵ��������comparator�ӿڣ������ǿ��Խ��е�
    }

}
