package c2stage_20220220.ccc057collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc057collection
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-11  ������
 */
public class ccc001collection���� {
    public static void main(String[] args) {
        // ���򣬿��ظ���������
        Collection x = new ArrayList();
        x.add("demo");
        x.add("demo");
        x.add(11);
        x.add(11);
        x.add(true);
        // ���ϴ�ӡ���ݣ���Ϊ�ڲ��Ѿ�������������һ����д
        System.out.println(x);// [demo, demo, 11, 11, true]

        // ���򣬲��ظ���������
        // ���ڶ�̬�ɽ������ֱ����Ӽ���
        // ****************************************
        // ������н������������֮���������ǿ��
        // ������һ��ʼnew��һ��dog��a.eat��dog�ķ�����
        // ���Ǻ����ҽ�dog�ĳ�cat��a.eat���Զ������cat�ķ����壬����Ҫ�������������޸�
        // ****************************************
        Collection x1 = new HashSet();
        x1.add("demo");
        x1.add("run");
        x1.add("demo");
        x1.add("run");
        x1.add(11);
        x1.add(11);
        x1.add(true);
        System.out.println(x1);//[run, 11, demo, true]
        // �����Զ�����ڲ����ظ����ݣ�ͬʱδ�������˳������
    }
}
