package c2stage_20220220.ccc059collection_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc059collection_iterator
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-20-13  ������
 */
public class ccc001iterator {
    public static void main(String[] args) {
        Collection<String> x = new ArrayList<>();
        x.add("c1");
        x.add("c4");
        x.add("c3");
        x.add("c2");
        Iterator<String> demo = x.iterator();
        System.out.println(x);// ����ͽ��й�һ����д������ֱ��չʾ���
        // [c1, c4, c3, c2]
        // System.out.println(demo.hasNext());//�����Ƿ��н����true/false
        // System.out.println(demo.next());//���ؾ���Ľ����c1
        while (demo.hasNext()) {// �Ƿ��н����true/false
            // String xx= demo.next();// ��Ԫ��ȡ������Ȼ��ֵ��xx
            //ͬʱ���ƶ�����һ��Ԫ��
            System.out.println(demo.next());
        }
        // ���������������Խ�磬��ֱ���׳��쳣�����³������
    }
    public static void show(){
        Collection<String> x = new ArrayList<>();
        x.add("c1");
        x.add("c4");
        x.add("c2");
        Iterator<String> demo = x.iterator();
        while (demo.hasNext()) {
            System.out.println(demo.next());
            System.out.println(demo.next());
        }
        // �����൱��ѯ��һ�Σ��ƶ����Σ�
        // �����ż��Ԫ�ظ�����û������
        // ���������Ԫ�ظ������ᱨ����Ϊ����Խ��
    }
}
