package d���׶���β2021��10��2��.ddd039list����;
/*
    List�����ص�
        ���򣺴洢��ȡ����Ԫ��˳��һ��
        ���ظ����洢��Ԫ�ؿ����ظ�
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ddd040list {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("a1");
        x.add("a2");
        x.add("a3");
        x.add("a4");
        x.add("a5");
        // �������ķ�ʽ����
        // list����collection�����࣬
        // ����ͬ�����Ե���collection�ķ���
        // list����collection�����࣬������arraylist�ĸ���
        // ����list�����з�����collection��û�У�����ArrayList�д���
        Iterator<String> x1 = x.listIterator();
        while (x1.hasNext()) {
            System.out.println(x1.next());
        }
    }
}
