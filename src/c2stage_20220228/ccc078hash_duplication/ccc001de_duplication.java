package c2stage_20220228.ccc078hash_duplication;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220228.ccc078hash_duplication
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-43  ����һ
 */
public class ccc001de_duplication {
    public static void main(String[] args) {
        // set����ֻ��ʹ��Ĭ�ϵ�equals����ȥ�ж��Ƿ���ͬ
        // �����һ�������࣬��Ҫ�ж϶������е������Ƿ���ͬ
        // ����Ҫ��дhashcode��equals����
        Set<ccc002st_object> x = new HashSet<>();
        x.add(new ccc002st_object("demo", 11, "aa"));
        x.add(new ccc002st_object("demo", 11, "aa"));
        x.add(new ccc002st_object("demo", 12, "aa"));
        // ������ȥ���ظ���ֱ���ڶ���������дequals��hashcode��������
        System.out.println(x);
    }
}
