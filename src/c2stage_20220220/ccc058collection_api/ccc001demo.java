package c2stage_20220220.ccc058collection_api;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc058collection_api
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-21-09  ���ڶ�
 */
public class ccc001demo {
    public static void main(String[] args) {
        Collection<String> x=new ArrayList<>();
        x.add("a");
        x.add("b");
        x.add("c");
        x.add("demo");
        x.add("java");
        System.out.println(x);
        System.out.println("�Ƿ�Ϊ�գ�"+x.isEmpty());
        Object[] x1=x.toArray();//ת��Ϊ����,���ص���Object���ͣ�
        // ���ǲ���ֱ��ת��ΪString���ͣ���Ϊ�ᱨ��
        // ��;�������int���͵����ݣ����ֱ��ת�����ᱨ��


    }
}
