package c2stage_20220220.ccc072genericity_class;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc072genericity_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-23-17  ������
 */
public class ccc001myarraylist<E> {// ����������������ϱ�Ƿ�
    private ArrayList x = new ArrayList();// �൱���ڲ�����һ��list

    public void add(E e) {
        x.add(e);// ������ĵ��ã������ϻ�����ArrayList�ķ���
    }

    public void remove(E e) {
        x.remove(e);
    }

    // ��֮ͬ�����ڣ�
    // ���շ��͵Ĺ����ҿ����Զ���tostring����


    @Override
    public String toString() {
        // return "ccc001myarraylist{" +
        //         "x=" + x +
        //         '}';
        return x.toString();
    }
}
